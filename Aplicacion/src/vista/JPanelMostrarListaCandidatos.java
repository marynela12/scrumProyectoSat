package vista;

import controlador.EliminarRegistroenBD;
import javax.swing.table.DefaultTableModel;
import modelo.AdminBD;

/**
 *
 * @author U-Lee
 */
public class JPanelMostrarListaCandidatos extends javax.swing.JPanel {

    AdminBD adminBD;
    DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form JPanelMostrarLista
     */
    public JPanelMostrarListaCandidatos() {
        initComponents();
        desplegarCatalogo();
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
        candidatos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        candidatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Correo", "Matricula", "Nombre", "Apellido Paterno", "Apellido Materno"
            }
        ));
        jScrollPane1.setViewportView(candidatos);

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jButton1)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(58, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String fila = null;
        int candidatoSeleccionado;
        modelo = (DefaultTableModel) candidatos.getModel();
        candidatoSeleccionado = candidatos.getSelectedRow(); //La variable asesorSeleccionado guarda la fila que se eligió de la tabla asesores.
        fila = candidatos.getValueAt(candidatoSeleccionado, 0).toString();
        EliminarRegistroenBD ea = new EliminarRegistroenBD();
        ea.eliminaCandidato(candidatoSeleccionado, fila);
        modelo.removeRow(candidatoSeleccionado);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void desplegarCatalogo() {
        adminBD = new AdminBD();
        DefaultTableModel lista = new DefaultTableModel();
        lista = adminBD.consultaListaCandidatos();
        candidatos.setModel(lista);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable candidatos;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}