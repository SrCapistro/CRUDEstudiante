package com.capi.curdestudiante;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author josuecg
 */
public class ControlCRUD {
    ConexionPSQL conexion = new ConexionPSQL();
    
    public boolean registrarEstudiante(Estudiante estudianteRegistrar){
        boolean registrado = true;
        try{
            Connection conn = conexion.getConnection();
            if(estudianteRegistrar.getSegundoNombre()==null){
                PreparedStatement query = conn.prepareStatement("insert into estudiante (primer_nom,primer_ape,seg_ape,) "
                        + "VALUES(?,?,?)");
                query.setString(1, estudianteRegistrar.getPrimerNombre());
                query.setString(2, estudianteRegistrar.getApellidoPaterno());
                query.setString(3, estudianteRegistrar.getApellidoMaterno());
                query.executeUpdate();
            }else{
                PreparedStatement query = conn.prepareStatement("insert into estudiante (primer_nom,primer_ape,seg_ape,seg_nom) "
                        + "VALUES(?,?,?,?)");
                query.setString(1, estudianteRegistrar.getPrimerNombre());
                query.setString(2, estudianteRegistrar.getApellidoPaterno());
                query.setString(3, estudianteRegistrar.getApellidoMaterno());
                query.setString(4, estudianteRegistrar.getSegundoNombre());
                query.executeUpdate();
            }
            conn.close();
        }catch(SQLException e){
            registrado = false;
        }
        return registrado;
    }
    
    public ArrayList<Estudiante> obtenerEstudiantes(){
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
        try{
            Connection conn = conexion.getConnection();
            PreparedStatement query = conn.prepareStatement("SELECT idestudiante, primer_nom,primer_ape,seg_nom, seg_ape from estudiante WHERE estado = false");
            ResultSet rs = query.executeQuery();
            while(rs.next()){
                Estudiante estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt(1));
                estudiante.setPrimerNombre(rs.getString(2));
                estudiante.setSegundoNombre(rs.getString(4));
                estudiante.setApellidoPaterno(rs.getString(3));
                estudiante.setApellidoMaterno(rs.getString(5));
                listaEstudiantes.add(estudiante);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return listaEstudiantes;
    }
    
    public Estudiante cargarEstudiante(String id){
        Estudiante estudiante = new Estudiante();
        try{
            Connection conn = conexion.getConnection();
            PreparedStatement query = conn.prepareStatement("SELECT idestudiante, primer_nom,primer_ape,seg_nom, seg_ape from estudiante WHERE idestudiante = ?");
            int idBuscar = Integer.valueOf(id);
            query.setInt(1, idBuscar);
            ResultSet rs = query.executeQuery();
            while(rs.next()){
                estudiante.setIdEstudiante(rs.getInt(1));
                estudiante.setPrimerNombre(rs.getString(2));
                estudiante.setSegundoNombre(rs.getString(4));
                estudiante.setApellidoPaterno(rs.getString(3));
                estudiante.setApellidoMaterno(rs.getString(5));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return estudiante;
    }
    
    public boolean actualizarEstudiante(Estudiante estudianteActualizar){
        boolean registrado = true;
        try{
            Connection conn = conexion.getConnection();
            if(estudianteActualizar.getSegundoNombre()!=null){
                PreparedStatement query = conn.prepareStatement("UPDATE estudiante SET primer_nom =?, primer_ape=?, seg_nom=?, seg_ape=? "
                        + "WHERE idestudiante =?");
                query.setString(1, estudianteActualizar.getPrimerNombre());
                query.setString(2, estudianteActualizar.getApellidoPaterno());
                query.setString(3, estudianteActualizar.getSegundoNombre());
                query.setString(4, estudianteActualizar.getSegundoNombre());
                query.setInt(5, estudianteActualizar.getIdEstudiante());
                query.executeUpdate();
            }else{
                PreparedStatement query = conn.prepareStatement("UPDATE estudiante SET primer_nom =?, primer_ape=?, seg_ape=? "
                        + "WHERE idestudiante =?");
                query.setString(1, estudianteActualizar.getPrimerNombre());
                query.setString(2, estudianteActualizar.getApellidoPaterno());
                query.setString(3, estudianteActualizar.getSegundoNombre());
                query.setInt(4, estudianteActualizar.getIdEstudiante());
                query.executeUpdate();
            }
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
            registrado = false;
        }
        return registrado;
    }
    
    public boolean darBajaEstudiante(int idBaja){
        boolean baja = false;
        PreparedStatement query;
        try {
            Connection conn = conexion.getConnection();
            query = conn.prepareStatement("UPDATE estudiante SET estado = 't' "
                    + "WHERE idestudiante =?");
            query.setInt(1, idBaja);
            query.executeQuery();
            baja = true;
            
        } catch (SQLException ex) {
            baja = false;
        }
        return baja;
    }
}
