/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capi.curdestudiante;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josuecg
 */
public class ConexionPSQL {
    
    public Connection getConnection() throws SQLException{
        Connection conn = null;
        try{
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dapp?"+ "user=capistran"+"&password=1234");
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return conn;
    }
    
}
