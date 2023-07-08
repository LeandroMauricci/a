package presentacion;
import entidades.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.*;
import logica.*;

/**
 *
 * @author emiia
 */
public class FrmListadoDatosEstudiante extends javax.swing.JFrame {

    /**
     * Creates new form FrmListadoDatosEstudiante
     */
    private String dato;
    private String apellidoYNombreEstudiante;
    public FrmListadoDatosEstudiante() {
        initComponents();
    }
    public FrmListadoDatosEstudiante(JFrame principal) {
        initComponents();
        setLocationRelativeTo(principal);
    }
    
    public void setDato(String apellidoYNombreEstudiante) {
        this.apellidoYNombreEstudiante = apellidoYNombreEstudiante;
        lblDato.setText(apellidoYNombreEstudiante);
    }
    
    public void codigoIngresado(int codigo) {
        this.codigo = codigo;
    }
    
    public void llenarTabla1(){
        modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int filas, int columnas){
                if(columnas==5)
                    return true;
                else
                    return false;
            }
        };
        modelo.setColumnIdentifiers(columnas);
        iterador = lista.iterator();
        while(iterador.hasNext()){
            estudiante = iterador.next();
            if(estudiante.getCodigo()==this.codigo){
                fila[0] = estudiante.getCodigo();
                fila[1] = estudiante.getDni();
                fila[2] = estudiante.getNombre();
                fila[3] = estudiante.getApellido();
                fila[4] = estudiante.getDireccion();
                fila[5] = estudiante.getCarrera();
                fila[6] = estudiante.getEstado();
                modelo.addRow(fila);
            }
        }
        tblDatos.setModel(modelo);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBienvenido = new javax.swing.JLabel();
        lblDatos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        lblTexto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAsignaturas = new javax.swing.JTable();
        lblDato = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listado de datos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblBienvenido.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblBienvenido.setText("Bienvenid@, estudiante");

        lblDatos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDatos.setText("Tus datos son:");

        tblDatos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "DNI", "Nombre", "Apellidos", "Dirección", "Carrera", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDatos);

        lblTexto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTexto.setText("Los cursos en lo que te registraste son en tu última matrícula son:");

        tblAsignaturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Asignatura", "Código", "Ciclo", "Creditos"
            }
        ));
        jScrollPane2.setViewportView(tblAsignaturas);

        lblDato.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblDato.setText(".......");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDato)
                    .addComponent(lblBienvenido)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblDatos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblTexto))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblBienvenido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDato)
                .addGap(29, 29, 29)
                .addComponent(lblDatos)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblTexto)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lista = BLEstudiantes.getContenido();
        if(BLEstudiantes.getNumRegistros()!=0)
            llenarTabla1();
        else
            JOptionPane.showMessageDialog(this, "El archivo no tiene datos.", "Resultado", 2);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FrmListadoDatosEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmListadoDatosEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmListadoDatosEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmListadoDatosEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmListadoDatosEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblDato;
    private javax.swing.JLabel lblDatos;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JTable tblAsignaturas;
    private javax.swing.JTable tblDatos;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel modelo;
    private String columnas[] = {"Código", "DNI", "Nombre", "Apellido", "Dirección", "Carrera", "Estado"};
    private Object fila[] = new Object[columnas.length];
    private List<Estudiante> lista;
    private Iterator<Estudiante> iterador;
    private Estudiante estudiante;
    private int codigo;
}
