/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.EliminarAsesor;
import javax.swing.table.DefaultTableModel;
import modelo.AdminBD;

/**
 *
 * @author Jhon Nash
 */
public class JPanelMostrarListaAsesores extends javax.swing.JPanel {

    AdminBD adminBD;
    DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form JPanelMostrarLista
     */
    public JPanelMostrarListaAsesores() {
        initComponents();
        //desplegarCatalogo();
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
        asesores = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        asesores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Correo", "Nombre", "Apellido Paterno", "Apellido Materno"
            }
        ));
        jScrollPane1.setViewportView(asesores);

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
                        .addGap(149, 149, 149)
                        .addComponent(jButton1)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String fila = null;
        int asesorSeleccionado;
        modelo = (DefaultTableModel) asesores.getModel();
        asesorSeleccionado = asesores.getSelectedRow(); //La variable peliculaSeleccionada guarda la fila que se eligió de la tabla asesores.
        fila = asesores.getValueAt(asesorSeleccionado, 0).toString();
        EliminarAsesor ea = new EliminarAsesor();
        ea.eliminaRegistroBD(asesorSeleccionado, fila);
        modelo.removeRow(asesorSeleccionado);

    }//GEN-LAST:event_jButton1ActionPerformed

    public void desplegarCatalogo() {
        adminBD = new AdminBD();
        DefaultTableModel lista = new DefaultTableModel();
        lista = adminBD.consultaListaAsesores();
        asesores.setModel(lista);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable asesores;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}