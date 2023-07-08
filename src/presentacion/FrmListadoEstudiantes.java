/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import logica.*;
import entidades.*;

public class FrmListadoEstudiantes extends javax.swing.JFrame {

    public FrmListadoEstudiantes() {
        initComponents();
    }
    
    public FrmListadoEstudiantes(JFrame principal) {
        initComponents();
        setLocationRelativeTo(principal);
    }
    
    public void llenarTabla(){
        modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int filas, int columnas){
                if(columnas==7)
                    return true;
                else
                    return false;
            }
        };
        modelo.setColumnIdentifiers(columnas);
        iterador = lista.iterator();
        while(iterador.hasNext()){
            estudiante = iterador.next();
            fila[0] = estudiante.getCodigo();
            fila[1] = estudiante.getDni();
            fila[2] = estudiante.getNombre();
            fila[3] = estudiante.getApellido();
            fila[4] = estudiante.getDireccion();
            fila[5] = estudiante.getCarrera();
            fila[6] = estudiante.getEstado();
            modelo.addRow(fila);
        }
        tblEstudiante.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngGrupo = new javax.swing.ButtonGroup();
        lblordenarPor = new java.awt.Label();
        rbtnTitulo = new javax.swing.JRadioButton();
        rbtnPrecio = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstudiante = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        lblordenarPor1 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listado de peliculas");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblordenarPor.setAlignment(java.awt.Label.CENTER);
        lblordenarPor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblordenarPor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblordenarPor.setText("Listado de estudiantes");

        btngGrupo.add(rbtnTitulo);
        rbtnTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbtnTitulo.setSelected(true);
        rbtnTitulo.setText("por código");
        rbtnTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTituloActionPerformed(evt);
            }
        });

        btngGrupo.add(rbtnPrecio);
        rbtnPrecio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbtnPrecio.setText("alfabéticamente");
        rbtnPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnPrecioActionPerformed(evt);
            }
        });

        tblEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "DNI", "Nombre", "Apellido", "Direccion", "Carrera", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEstudiante.setShowGrid(false);
        tblEstudiante.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tblEstudiante);

        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/24-em-cross.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblordenarPor1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblordenarPor1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblordenarPor1.setText("Ordenar...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblordenarPor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblordenarPor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                            .addComponent(rbtnTitulo)
                            .addGap(26, 26, 26)
                            .addComponent(rbtnPrecio)
                            .addGap(51, 51, 51)
                            .addComponent(btnSalir)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblordenarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtnTitulo)
                        .addComponent(rbtnPrecio)
                        .addComponent(btnSalir))
                    .addComponent(lblordenarPor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lista = BLEstudiantes.getContenido();
        if(BLEstudiantes.getNumRegistros()!=0)
            llenarTabla();
        else
            JOptionPane.showMessageDialog(this, "El archivo no tiene datos.", "Resultado", 2);
    }//GEN-LAST:event_formWindowOpened

    private void rbtnTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTituloActionPerformed
        if(rbtnTitulo.isSelected()){
            if(lista != null){
                Collections.sort(lista);
                llenarTabla();
            } else {
                JOptionPane.showMessageDialog(this, "El archivo no contiene datos.", "Resultado", 2);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnTituloActionPerformed

    private void rbtnPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnPrecioActionPerformed
        if(rbtnPrecio.isSelected()){
            if(lista != null){
                Collections.sort(lista, new CompararEstudiantesPorApellido());
                llenarTabla();
            } else {
                JOptionPane.showMessageDialog(this, "El archivo no contiene datos.", "Resultado", 2);
            }
        }
    }//GEN-LAST:event_rbtnPrecioActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(FrmListadoEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmListadoEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmListadoEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmListadoEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmListadoEstudiantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup btngGrupo;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label lblordenarPor;
    private java.awt.Label lblordenarPor1;
    private javax.swing.JRadioButton rbtnPrecio;
    private javax.swing.JRadioButton rbtnTitulo;
    private javax.swing.JTable tblEstudiante;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel modelo;
    private String columnas[] = {"Código", "DNI", "Nombre", "Apellido", "Dirección", "Carrera", "Estado"};
    private Object fila[] = new Object[columnas.length];
    private List<Estudiante> lista;
    private Iterator<Estudiante> iterador;
    private Estudiante estudiante;


}
