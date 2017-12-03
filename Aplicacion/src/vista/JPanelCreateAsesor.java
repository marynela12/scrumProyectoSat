/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorGuardaAsesor;
import controlador.cHorario;
import javax.swing.JOptionPane;
import modelo.mHorario;
/**
 *
 * @author Jhon Nash
 */
public class JPanelCreateAsesor extends javax.swing.JPanel {

    /**
     * Creates new form JPanelCreateAsesor
     */
    public JPanelCreateAsesor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblDatosPersonales = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabNomAsesor = new javax.swing.JLabel();
        jtxtNombreAsesor = new javax.swing.JTextField();
        jlblApellidoPaterno = new javax.swing.JLabel();
        jtxtApellidoPaterno = new javax.swing.JTextField();
        jlblApellicoMaterno = new javax.swing.JLabel();
        jtxtApellidoMaterno = new javax.swing.JTextField();
        jblCorrEletrAsesor = new javax.swing.JLabel();
        jtxtCorrEleAsesor = new javax.swing.JTextField();
        jlblTelefono = new javax.swing.JLabel();
        jtxtTelefono = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jlblDatosLaborales = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabCubiculo = new javax.swing.JLabel();
        jtxtCubiculo = new javax.swing.JTextField();
        jLabHrAsesor = new javax.swing.JLabel();
        jbttnCrearAsesorias = new javax.swing.JButton();
        jbttnAdministrarSeminario = new javax.swing.JButton();
        jbttnEditarAsesor = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jRdBttnCondicionesSi = new javax.swing.JRadioButton();
        jRdBttnCondicionesNo = new javax.swing.JRadioButton();
        jbttnCancelar = new javax.swing.JButton();
        jbttnGuardar = new javax.swing.JButton();

        jlblDatosPersonales.setText("Datos Personales");

        jLabNomAsesor.setText("Nombre");

        jtxtNombreAsesor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtNombreAsesorKeyTyped(evt);
            }
        });

        jlblApellidoPaterno.setText("Apellido Paterno");

        jtxtApellidoPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtApellidoPaternoKeyTyped(evt);
            }
        });

        jlblApellicoMaterno.setText("Apellido Materno");

        jtxtApellidoMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtApellidoMaternoKeyTyped(evt);
            }
        });

        jblCorrEletrAsesor.setText("Correo electronico ");

        jtxtCorrEleAsesor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCorrEleAsesorKeyTyped(evt);
            }
        });

        jlblTelefono.setText("Telefono");

        jtxtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtTelefonoKeyTyped(evt);
            }
        });

        jlblDatosLaborales.setText("Datos Laborales");

        jLabCubiculo.setText("Cubiculo");

        jtxtCubiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCubiculoKeyTyped(evt);
            }
        });

        jLabHrAsesor.setText("Horario de asesorias");

        jbttnCrearAsesorias.setText("Crear");
        jbttnCrearAsesorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttnCrearAsesoriasActionPerformed(evt);
            }
        });

        jbttnAdministrarSeminario.setText("Administrar ");
        jbttnAdministrarSeminario.setEnabled(false);

        jbttnEditarAsesor.setText("Editar");
        jbttnEditarAsesor.setEnabled(false);

        jLabel1.setText("Acepto terminos y condiciones de uso");

        jRdBttnCondicionesSi.setSelected(true);
        jRdBttnCondicionesSi.setText("si");

        jRdBttnCondicionesNo.setText("no");

        jbttnCancelar.setText("Cancelar");

        jbttnGuardar.setText("Guardar");
        jbttnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblDatosPersonales)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jlblApellicoMaterno))
                            .addComponent(jlblDatosLaborales))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabCubiculo)
                                .addGap(70, 70, 70)
                                .addComponent(jtxtCubiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabHrAsesor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbttnCrearAsesorias, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator4)
                    .addComponent(jSeparator5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(68, 68, 68)
                        .addComponent(jRdBttnCondicionesSi)
                        .addGap(18, 18, 18)
                        .addComponent(jRdBttnCondicionesNo)
                        .addGap(0, 54, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabNomAsesor)
                                    .addComponent(jlblApellidoPaterno))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtApellidoPaterno)
                                    .addComponent(jtxtNombreAsesor)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jblCorrEletrAsesor)
                                    .addComponent(jlblTelefono))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtApellidoMaterno, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtxtTelefono)
                                    .addComponent(jtxtCorrEleAsesor))))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbttnAdministrarSeminario, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jbttnEditarAsesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45))))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jbttnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jbttnGuardar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jlblDatosPersonales)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabNomAsesor)
                    .addComponent(jtxtNombreAsesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblApellidoPaterno)
                    .addComponent(jtxtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbttnEditarAsesor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblApellicoMaterno)
                    .addComponent(jtxtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblCorrEletrAsesor)
                    .addComponent(jtxtCorrEleAsesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTelefono)
                    .addComponent(jtxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbttnAdministrarSeminario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jlblDatosLaborales)
                .addGap(3, 3, 3)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabCubiculo)
                    .addComponent(jtxtCubiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabHrAsesor)
                    .addComponent(jbttnCrearAsesorias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jRdBttnCondicionesSi)
                    .addComponent(jRdBttnCondicionesNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbttnCancelar)
                    .addComponent(jbttnGuardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbttnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttnGuardarActionPerformed
        // TODO add your handling code here:
        ControladorGuardaAsesor controladorGuardaAsesor;
        
        if(jtxtNombreAsesor.getText().isEmpty()|| jtxtApellidoPaterno.getText().isEmpty()||
                this.jtxtApellidoMaterno.getText().isEmpty()|| 
                this.jtxtCorrEleAsesor.getText().isEmpty()|| 
                this.jtxtCubiculo.getText().isEmpty()|| 
                this.jtxtTelefono.getText().isEmpty()){
            JOptionPane.showMessageDialog(jLabNomAsesor, "No deje campos vacios ");   
        }else{
            controladorGuardaAsesor = new ControladorGuardaAsesor(this);
            
        }
        
        
       
    }//GEN-LAST:event_jbttnGuardarActionPerformed

    private void jtxtNombreAsesorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNombreAsesorKeyTyped
        // TODO add your handling code here:
        int maximoCadena=20;
        if(jtxtNombreAsesor.getText().length() >= maximoCadena){
            evt.consume();
            JOptionPane.showMessageDialog(jLabNomAsesor, "Solo 20 caracteres aceptados ");   
        }
    }//GEN-LAST:event_jtxtNombreAsesorKeyTyped

    private void jtxtApellidoPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtApellidoPaternoKeyTyped
        // TODO add your handling code here:
        int maximoCadena=30;
        if(jtxtApellidoPaterno.getText().length() >= maximoCadena){
            evt.consume();
            JOptionPane.showMessageDialog(jLabNomAsesor, "Solo 30 caracteres aceptados ");   
        }
    }//GEN-LAST:event_jtxtApellidoPaternoKeyTyped

    private void jtxtApellidoMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtApellidoMaternoKeyTyped
        // TODO add your handling code here:
        int maximoCadena=30;
        if(jtxtApellidoMaterno.getText().length() >= maximoCadena){
            evt.consume();
            JOptionPane.showMessageDialog(jLabNomAsesor, "Solo 30 caracteres aceptados ");   
        }
        
    }//GEN-LAST:event_jtxtApellidoMaternoKeyTyped

    private void jtxtCorrEleAsesorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCorrEleAsesorKeyTyped
        // TODO add your handling code here:
        int maximoCadena=30;
        if(jtxtCorrEleAsesor.getText().length() >= maximoCadena){
            evt.consume();
            JOptionPane.showMessageDialog(jLabNomAsesor, "Solo 30 caracteres aceptados ");   
        }
    }//GEN-LAST:event_jtxtCorrEleAsesorKeyTyped

    private void jtxtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtTelefonoKeyTyped
        // TODO add your handling code here:
        int maximoCadena = 15;
        if(jtxtTelefono.getText().length() >= maximoCadena){
            evt.consume();
            JOptionPane.showMessageDialog(jLabNomAsesor, "Solo 15 Digitos aceptados ");   
        }
    }//GEN-LAST:event_jtxtTelefonoKeyTyped

    private void jtxtCubiculoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCubiculoKeyTyped
        // TODO add your handling code here:
        int maximoCadena = 10;
        if(jtxtCubiculo.getText().length() >= maximoCadena){
            evt.consume();
            JOptionPane.showMessageDialog(jLabNomAsesor, "Solo 10 caracteres aceptados ");   
        }
    }//GEN-LAST:event_jtxtCubiculoKeyTyped

    private void jbttnCrearAsesoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttnCrearAsesoriasActionPerformed
        mHorario mHra = null ;
        JFvHorario vPan = new JFvHorario();
        cHorario cHra = new cHorario(mHra, vPan);
        cHra.iniciar();
        vPan.setVisible(true);
    }//GEN-LAST:event_jbttnCrearAsesoriasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabCubiculo;
    private javax.swing.JLabel jLabHrAsesor;
    private javax.swing.JLabel jLabNomAsesor;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JRadioButton jRdBttnCondicionesNo;
    public javax.swing.JRadioButton jRdBttnCondicionesSi;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel jblCorrEletrAsesor;
    public javax.swing.JButton jbttnAdministrarSeminario;
    public javax.swing.JButton jbttnCancelar;
    public javax.swing.JButton jbttnCrearAsesorias;
    public javax.swing.JButton jbttnEditarAsesor;
    public javax.swing.JButton jbttnGuardar;
    private javax.swing.JLabel jlblApellicoMaterno;
    private javax.swing.JLabel jlblApellidoPaterno;
    private javax.swing.JLabel jlblDatosLaborales;
    private javax.swing.JLabel jlblDatosPersonales;
    private javax.swing.JLabel jlblTelefono;
    public javax.swing.JTextField jtxtApellidoMaterno;
    public javax.swing.JTextField jtxtApellidoPaterno;
    public javax.swing.JTextField jtxtCorrEleAsesor;
    public javax.swing.JTextField jtxtCubiculo;
    public javax.swing.JTextField jtxtNombreAsesor;
    public javax.swing.JTextField jtxtTelefono;
    // End of variables declaration//GEN-END:variables
}
