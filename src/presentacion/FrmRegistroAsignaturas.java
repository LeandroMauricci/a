/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import datos.*;
import entidades.*;

/**
 *
 * @author emiia
 */
public class FrmRegistroAsignaturas extends javax.swing.JFrame {

    /**
     * Creates new form FrmRegistroAsignaturas
     */
    private String dato;
    private String nombreEstudiante;
    private Estudiante estudiante;
    public FrmRegistroAsignaturas() {
        initComponents();
        
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(columnas);
        
        DALAsignaturas dalAsignaturas = new DALAsignaturas();
        if(estudiante.getCarrera().compareToIgnoreCase("Ingeniería de sistemas")==0){
            dalAsignaturas.escribirAsignatura("101", "Programación", 1, 4);
            dalAsignaturas.escribirAsignatura("102", "Bases de Datos", 1, 4);
            dalAsignaturas.escribirAsignatura("103", "Redes de Computadoras", 1, 4);
        } else {
             if(estudiante.getCarrera().compareToIgnoreCase("Medicina")==0){
                 dalAsignaturas.escribirAsignatura("101", "Programación", 1, 4);
                dalAsignaturas.escribirAsignatura("102", "Bases de Datos", 1, 4);
                dalAsignaturas.escribirAsignatura("103", "Redes de Computadoras", 1, 4);
             } else {
                 if(estudiante.getCarrera().compareToIgnoreCase("Derecho")==0){
                     
                 }
             }
        }
        
        // Insertar los datos específicos en las filas
        //modelo.addRow(dalAsignaturas.escribirAsignatura("101", "Programación", 1, 4));
        //modelo.addRow(dalAsignaturas.escribirAsignatura("102", "Bases de Datos", 1, 4));
        modelo.addRow(new Object[]{"103", "Redes de Computadoras", 1, 4});
        modelo.addRow(new Object[]{"104", "Sistemas Operativos", 1, 4});
        modelo.addRow(new Object[]{"105", "Análisis y Diseño de Sistemas", 1, 4});
        modelo.addRow(new Object[]{"106", "Administración de Proyectos", 1, 4});

        tblAsignatura.setModel(modelo);
    }
    
    public FrmRegistroAsignaturas(JFrame principal) {
        initComponents();
        setLocationRelativeTo(principal);
        
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(columnas);

        // Insertar los datos específicos en las filas
        modelo.addRow(new Object[]{"101", "Programación", 1, 4});
        modelo.addRow(new Object[]{"102", "Bases de Datos", 1, 4});
        modelo.addRow(new Object[]{"103", "Redes de Computadoras", 1, 4});
        modelo.addRow(new Object[]{"104", "Sistemas Operativos", 1, 4});
        modelo.addRow(new Object[]{"105", "Análisis y Diseño de Sistemas", 1, 4});
        modelo.addRow(new Object[]{"106", "Administración de Proyectos", 1, 4});

        tblAsignatura.setModel(modelo);
        
    }
    
    public void setDato(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
        lblDato.setText(nombreEstudiante);
    }
    
    public void Estudiante(){
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAsignatura = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblBienvenido = new javax.swing.JLabel();
        lblDato = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Matrícula: registro de asignaturas");

        tblAsignatura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Asignatura", "Código", "Ciclo", "Creditos"
            }
        ));
        jScrollPane1.setViewportView(tblAsignatura);

        jLabel1.setText("Por favor elegir las asignaturas (minimo 1, maximo 6)");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblBienvenido.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblBienvenido.setText("Bienvenid@, estudiante");

        lblDato.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblDato.setText(".......");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDato)
                            .addComponent(lblBienvenido))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(39, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblBienvenido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDato)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        int filaSeleccionada = tblAsignatura.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar al menos un curso de la tabla",
                    "Selección de cursos", JOptionPane.ERROR_MESSAGE);
        } else {
          

        }
    }//GEN-LAST:event_btnRegistrarActionPerformed
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmRegistroAsignaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroAsignaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroAsignaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroAsignaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistroAsignaturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblDato;
    private javax.swing.JTable tblAsignatura;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel modelo;
    private String columnas[] = {"Código", "Asignatura", "Ciclo", "Créditos"};
}