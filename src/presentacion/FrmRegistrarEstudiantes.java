/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import javax.swing.*;
import logica.*;
import entidades.*;
import entidades.Estudiante;
import java.awt.event.*;
import java.util.*;
/**
 *
 * @author sistemas
 */
public class FrmRegistrarEstudiantes extends javax.swing.JFrame {

    /**
     * Creates new form FrmVideojuego
     */
    
    public FrmRegistrarEstudiantes(JFrame principal, BLEstudiantes blEstudiantes){
        initComponents();
        setLocationRelativeTo(principal);
        btnGuardar.setEnabled(false);
        this.blEstudiantes=blEstudiantes;
    }

    public FrmRegistrarEstudiantes() {
        initComponents();
    }
    
    private void activar(boolean estado){
        txtDni.setEnabled(estado);
        txtNombre.setEnabled(estado);
        btnGuardar.setEnabled(estado);
        txtApellido.setEnabled(estado);
        txtDireccion.setEnabled(estado);
        
        cbxCarrera.setEnabled(estado);
            
    }
    
    private void limpiar(){
        txtCodigo.setText(null);
        txtDni.setText(null);
        txtNombre.setText(null);
        txtApellido.setText(null);
        txtDireccion.setText(null);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblAño = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        lblPrecioVenta = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        lblDirector = new javax.swing.JLabel();
        lblProtagonista = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        lblTitulo1 = new javax.swing.JLabel();
        lblDirector1 = new javax.swing.JLabel();
        cbxCarrera = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar productos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 153));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitulo.setText("Código automático");

        txtCodigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCodigo.setEnabled(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        lblAño.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAño.setForeground(new java.awt.Color(0, 0, 153));
        lblAño.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAño.setText("DNI");

        txtDni.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDni.setEnabled(false);
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        lblPrecioVenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPrecioVenta.setForeground(new java.awt.Color(0, 0, 153));
        lblPrecioVenta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPrecioVenta.setText("Nombre");

        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtNombre.setEnabled(false);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/save.gif"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblDirector.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDirector.setForeground(new java.awt.Color(0, 0, 153));
        lblDirector.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDirector.setText("Dirección");

        lblProtagonista.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblProtagonista.setForeground(new java.awt.Color(0, 0, 153));
        lblProtagonista.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProtagonista.setText("Apellido");

        txtApellido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtApellido.setEnabled(false);
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        txtDireccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDireccion.setEnabled(false);
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        lblTitulo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(0, 0, 153));
        lblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitulo1.setText("Registrar estudiantes");

        lblDirector1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDirector1.setForeground(new java.awt.Color(0, 0, 153));
        lblDirector1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDirector1.setText("Carrera");

        cbxCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccionar carrera>", "Ingeniería de sistemas", "Medicina", "Derecho", "Psicología", "Administración de empresas", "Arquitectura" }));
        cbxCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCarreraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnGuardar)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblProtagonista, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPrecioVenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblAño, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                .addComponent(lblDirector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDirector1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombre)
                                .addComponent(txtDni)
                                .addComponent(txtApellido)
                                .addComponent(txtDireccion)
                                .addComponent(txtCodigo)
                                .addComponent(cbxCarrera, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAño, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProtagonista, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDirector1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String dni, nombre, apellido, direccion, carrera;
        int codigo = 100 + BLEstudiantes.getNumRegistros();
        if(txtDni.getText().trim().length()!=8){
            JOptionPane.showMessageDialog(this, "Debe ingresar DNI válido.", "Ingreso de datos", 0);
            txtDni.requestFocus();
        } else {
            if(BLEstudiantes.verificarDNI(txtDni.getText())){
                JOptionPane.showMessageDialog(this, "DNI repetido", "Ingreso de datos", 0);
                txtDni.requestFocus();
            } else {
                if(txtNombre.getText().trim().length()<2){
                    JOptionPane.showMessageDialog(this, "Debe ingresar año", "Ingreso de datos", 0);
                    txtNombre.requestFocus();
                } else {
                    if(txtApellido.getText().trim().length()<2){
                        JOptionPane.showMessageDialog(this, "Debe ingresar stock.", "Ingreso de datos", 0);
                        txtApellido.requestFocus();
                    } else {
                        if(txtDireccion.getText().trim().length()<2){
                                JOptionPane.showMessageDialog(this, "Debe ingresar precio de venta.", "Ingreso de datos", 0);
                                txtDireccion.requestFocus();
                        } else {
                            if(cbxCarrera.getSelectedIndex()==0){
                                JOptionPane.showMessageDialog(this, "Debe ingresar carrera", "Ingreso de datos", 0);
                                cbxCarrera.requestFocus();
                            } else {
                                txtCodigo.setText(String.valueOf(codigo));
                                dni = txtDni.getText();
                                nombre = txtNombre.getText();
                                apellido = txtApellido.getText();
                                direccion = txtDireccion.getText();
                                carrera = String.valueOf(cbxCarrera.getSelectedItem());

                                String mensaje = BLEstudiantes.escribirEstudiante(codigo, dni, nombre, apellido, direccion, carrera, "activo");
                                estudiante = new Estudiante(codigo, dni, nombre, apellido, direccion, carrera, "activo");

                                if(mensaje.compareTo("ok") == 0)
                                JOptionPane.showMessageDialog(this, "Los datos han sido registrados",
                                      "Resultado", 1);
                                else
                                JOptionPane.showMessageDialog(this, "Ocurrió un problema al guardar",
                                      "Resultado", 0);


                                activar(false);
                            }
                            


                        }
                    }
                }
            }
        
        }

                // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        char c = evt.getKeyChar();
            if(!(Character.isLetter(c) || (c== KeyEvent.VK_BACK_SPACE)
                    || (c== KeyEvent.VK_DELETE) || (c== KeyEvent.VK_SPACE))){
                evt.consume();// TODO add your handling code here:
            }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        char c = evt.getKeyChar();
            if(!(Character.isDigit(c) || (c== KeyEvent.VK_BACK_SPACE)
                    || (c== KeyEvent.VK_DELETE))){
                evt.consume();// TODO add your handling code here:
            }
    // TODO add your handling code here:
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
            char c = evt.getKeyChar();
            if(!(Character.isLetter(c) || (c== KeyEvent.VK_BACK_SPACE)
                    || (c== KeyEvent.VK_DELETE) || (c== KeyEvent.VK_SPACE))){
                evt.consume();// TODO add your handling code here:
            }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        char c = evt.getKeyChar();
            if(!(Character.isLetter(c) || (c== KeyEvent.VK_BACK_SPACE)
                    || (c== KeyEvent.VK_DELETE) || (c== KeyEvent.VK_SPACE))){
                evt.consume();// TODO add your handling code here:
            }        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        char c = evt.getKeyChar();
            if(!(Character.isLetter(c) || (c== KeyEvent.VK_BACK_SPACE)
                    || (c== KeyEvent.VK_DELETE) || (c== KeyEvent.VK_SPACE))){
                evt.consume();// TODO add your handling code here:
            }// TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
            activar(true);
    }//GEN-LAST:event_formWindowOpened

    private void cbxCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCarreraActionPerformed
    
    
    
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
            java.util.logging.Logger.getLogger(FrmRegistrarEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistrarEstudiantes().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbxCarrera;
    private javax.swing.JLabel lblAño;
    private javax.swing.JLabel lblDirector;
    private javax.swing.JLabel lblDirector1;
    private javax.swing.JLabel lblPrecioVenta;
    private javax.swing.JLabel lblProtagonista;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
    private BLEstudiantes blEstudiantes;
    private Estudiante estudiante;
}
