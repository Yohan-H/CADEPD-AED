/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Vista.Matricular;
import EstructuraDatos.BST.BST;
import Clases.Alumno;

import java.util.*;

/**
 *
 * @author 
 */
public class Modificar extends javax.swing.JPanel {

    /**
     * Creates new form Buscar
     */
    public Modificar() {
        initComponents();
        limpiarCasillas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        bBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfDNIBuscar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfPrimerApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfSegundoApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfDNI = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfCelular = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfDireccion = new javax.swing.JTextField();
        bEliminar = new javax.swing.JButton();
        tfNombreCompleto = new javax.swing.JTextField();
        bModificar = new javax.swing.JButton();

        jLabel2.setText("DNI:");

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Datos del Estudiante:");

        jLabel3.setText("Nombre completo:");

        tfDNIBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDNIBuscarActionPerformed(evt);
            }
        });

        jLabel4.setText("Primer Apellido:");

        tfPrimerApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPrimerApellidoActionPerformed(evt);
            }
        });

        jLabel5.setText("SegundoApellido:");

        tfSegundoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSegundoApellidoActionPerformed(evt);
            }
        });

        jLabel6.setText("DNI:");

        tfDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDNIActionPerformed(evt);
            }
        });

        jLabel7.setText("Número de celular:");

        tfCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCelularActionPerformed(evt);
            }
        });

        jLabel8.setText("Dirección:");

        tfDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDireccionActionPerformed(evt);
            }
        });

        bEliminar.setText("Eliminar");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        tfNombreCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreCompletoActionPerformed(evt);
            }
        });

        bModificar.setText("Modificar");
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(bBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(128, 128, 128)
                                .addComponent(tfDNIBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(50, 50, 50))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(bModificar)
                                        .addGap(31, 31, 31)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bEliminar))))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(tfDNIBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEliminar)
                    .addComponent(bModificar))
                .addContainerGap(122, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        // TODO add your handling code here:
        //tfDNIBuscar.setText("");
        
        int dniBuscar = Integer.parseInt(tfDNIBuscar.getText());
        BST alumno = Matricular.bst.searchDNI(dniBuscar);
        
        String nombreCompleto = alumno.getData().getNombreCompleto();
        String primerApellido  = alumno.getData().getPrimerApellido();
        String segundoApellido = alumno.getData().getSegundoApellido();
        Integer dni  = (alumno.getData().getDNI());
        String celular  = alumno.getData().getCelular();
        String direccion  = alumno.getData().getDireccion();
        
        tfNombreCompleto.setText(nombreCompleto);
        tfPrimerApellido.setText(primerApellido);
        tfSegundoApellido.setText(segundoApellido);
        tfDNI.setText(dni.toString());
        tfCelular.setText(celular);
        tfDireccion.setText(direccion);
        
        //tfDNIBuscar.setText("");
    }//GEN-LAST:event_bBuscarActionPerformed

    private void tfDNIBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDNIBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDNIBuscarActionPerformed

    private void tfPrimerApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPrimerApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPrimerApellidoActionPerformed

    private void tfSegundoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSegundoApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSegundoApellidoActionPerformed

    private void tfDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDNIActionPerformed

    private void tfCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCelularActionPerformed

    private void tfDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDireccionActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        // TODO add your handling code here:
        int dniBuscar = Integer.parseInt(tfDNIBuscar.getText());
        BST alumno = Matricular.bst.searchDNI(dniBuscar);
        
        Alumno a = alumno.getData();
        
        Matricular.bst.remove(a);
        Matricular.bst.preOrden();
    }//GEN-LAST:event_bEliminarActionPerformed

    private void tfNombreCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreCompletoActionPerformed

    public void limpiarCasillas(){
        tfNombreCompleto.setText("");
        tfPrimerApellido.setText("");
        tfSegundoApellido.setText("");
        tfDNI.setText("");
        tfCelular.setText("");
        tfDireccion.setText("");
    }
    
    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        // TODO add your handling code here:
        int dniBuscar = Integer.parseInt(tfDNIBuscar.getText());
        BST alumno = Matricular.bst.searchDNI(dniBuscar);
        
        String nombreCompleto = tfNombreCompleto.getText();
        String primerApellido = tfPrimerApellido.getText();
        String segundoApellido = tfSegundoApellido.getText();
        int dni = Integer.parseInt(tfDNI.getText());
        String celular = tfCelular.getText();
        String direccion = tfDireccion.getText();
        
        //ArrayList<Object> notas = alumno.getData().getNotas();
        
        Alumno alumnoModificado = new Alumno(nombreCompleto, primerApellido, segundoApellido, dni, celular, direccion, Matricular.notas);
        alumno.setData(alumnoModificado);
        
        limpiarCasillas();
        Matricular.bst.preOrden();
    }//GEN-LAST:event_bModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField tfCelular;
    private javax.swing.JTextField tfDNI;
    private javax.swing.JTextField tfDNIBuscar;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfNombreCompleto;
    private javax.swing.JTextField tfPrimerApellido;
    private javax.swing.JTextField tfSegundoApellido;
    // End of variables declaration//GEN-END:variables
}
