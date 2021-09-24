package com.capi.curdestudiante;

import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josuecg
 */
public final class MainFrame extends javax.swing.JFrame {
    ControlCRUD control = new ControlCRUD();
    Estudiante estudianteBuscar = null;
    public MainFrame() {
        initComponents();
        cargarTabla();
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_estudiantes = new javax.swing.JTable();
        btn_agregar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JButton();
        tb_pnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tb_snombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tb_aPaterno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tb_aMaterno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table_estudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_estudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_estudiantesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_estudiantes);

        btn_agregar.setBackground(new java.awt.Color(102, 204, 0));
        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_modificar.setBackground(new java.awt.Color(255, 255, 0));
        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel1.setText("ESTUDIANTES REGISTRADOS");

        btn_eliminar.setBackground(new java.awt.Color(204, 0, 0));
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel2.setText("DATOS:");

        jLabel3.setText("Primer nombre:");

        jLabel4.setText("Segundo nombre:");

        jLabel5.setText("Apellido paterno:");

        jLabel6.setText("Apellido materno:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tb_aMaterno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                        .addComponent(tb_aPaterno, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tb_snombre, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tb_pnombre, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tb_pnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(tb_snombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(3, 3, 3)
                        .addComponent(tb_aPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tb_aMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_modificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(btn_agregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        if(this.tb_pnombre.getText().isEmpty() || this.tb_aPaterno.getText().isEmpty()
                || this.tb_aMaterno.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"CAMPOS FALTANTES");
        }else{
            if(this.tb_snombre.getText().isEmpty()){
                Estudiante estudianteRegistro = new Estudiante(this.tb_pnombre.getText(),
                this.tb_aPaterno.getText(),this.tb_aMaterno.getText());
                boolean registrado = control.registrarEstudiante(estudianteRegistro);
                limpiarCampos();
                if(registrado){
                    JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
                }else{
                    JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO");
                }
            }else{
                Estudiante estudianteRegistro = new Estudiante(this.tb_pnombre.getText(),
                this.tb_snombre.getText(), this.tb_aPaterno.getText(),this.tb_aMaterno.getText());
                boolean registrado = control.registrarEstudiante(estudianteRegistro);
                limpiarCampos();
                if(registrado){
                    JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
                }else{
                    JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO");
                }
            }
        }
        cargarTabla();
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void table_estudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_estudiantesMouseClicked

        int row = table_estudiantes.rowAtPoint(evt.getPoint());
        String id=table_estudiantes.getModel().getValueAt(row,4).toString();
        cargarCamposEstudiante(id);
    }//GEN-LAST:event_table_estudiantesMouseClicked

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        if(this.tb_pnombre.getText().isEmpty() || this.tb_aPaterno.getText().isEmpty()
                || this.tb_aMaterno.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"PARA MODIFICAR SELECCIONE EL ALUMNO A MODIFICAR");
        }else{
            Estudiante estudianteActualizado = new Estudiante();
            estudianteActualizado.setIdEstudiante(estudianteBuscar.getIdEstudiante());
            estudianteActualizado.setPrimerNombre(this.tb_pnombre.getText());
            estudianteActualizado.setSegundoNombre(this.tb_snombre.getText());
            estudianteActualizado.setApellidoPaterno(this.tb_aPaterno.getText());
            estudianteActualizado.setApellidoMaterno(this.tb_aMaterno.getText());
            System.out.println(estudianteActualizado.getPrimerNombre());
            control.actualizarEstudiante(estudianteActualizado);
            JOptionPane.showMessageDialog(null, "ESTUDIANTE ACTUALIZADO CORRECTAMENTE");
            cargarTabla();
            limpiarCampos();
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        if(this.tb_pnombre.getText().isEmpty() || this.tb_aPaterno.getText().isEmpty()
                || this.tb_aMaterno.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"PARA ELIMINAR DEBE DE SELECCIONAR UN ALUMNO");
        }else{
            if(control.darBajaEstudiante(estudianteBuscar.getIdEstudiante())){
                JOptionPane.showMessageDialog(null,"ESTUDIANTE ELIMINADO CORRECTAMENTE");
            }else{
                JOptionPane.showMessageDialog(null,"ERROR AL ELIMINAR ESTUDIANTE");
            }
        }
        cargarTabla();
        limpiarCampos();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    
    public void cargarTabla(){
        DefaultTableModel modelo = new  DefaultTableModel();
        ArrayList<Object>headAlumno = new ArrayList<>();
        headAlumno.add("Primer nombre");
        headAlumno.add("Segundo nombre");
        headAlumno.add("Apellido paterno");
        headAlumno.add("Apellido materno");
        headAlumno.add("ID");
        headAlumno.forEach((columna) -> {
            modelo.addColumn(columna);
        });
        this.table_estudiantes.setModel(modelo);
        
        ArrayList<Estudiante> estudiantesRegistrados = control.obtenerEstudiantes();
        Object[] datosAlumno = new Object[table_estudiantes.getColumnCount()];
        for(Estudiante estudiante: estudiantesRegistrados){
           datosAlumno[0] = estudiante.getPrimerNombre();
           if(estudiante.getSegundoNombre()==null){
               datosAlumno[1] = "N/A";
           }else{
               datosAlumno[1] = estudiante.getSegundoNombre();
           }
           datosAlumno[2] = estudiante.getApellidoPaterno();
           datosAlumno[3] = estudiante.getApellidoMaterno();
           datosAlumno[4] = estudiante.getIdEstudiante();

            modelo.addRow(datosAlumno);
        }
        this.table_estudiantes.setModel(modelo);
    }
    
    public void cargarCamposEstudiante(String id){
        estudianteBuscar = control.cargarEstudiante(id);
        this.tb_snombre.setText(estudianteBuscar.getSegundoNombre());
        this.tb_pnombre.setText(estudianteBuscar.getPrimerNombre());
        this.tb_aPaterno.setText(estudianteBuscar.getApellidoPaterno());
        this.tb_aMaterno.setText(estudianteBuscar.getApellidoMaterno());
    }
    
    public void limpiarCampos(){
        this.tb_aMaterno.setText("");
        this.tb_aPaterno.setText("");
        this.tb_pnombre.setText("");
        this.tb_snombre.setText("");
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_estudiantes;
    private javax.swing.JTextField tb_aMaterno;
    private javax.swing.JTextField tb_aPaterno;
    private javax.swing.JTextField tb_pnombre;
    private javax.swing.JTextField tb_snombre;
    // End of variables declaration//GEN-END:variables
}
