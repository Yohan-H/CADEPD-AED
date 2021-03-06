/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import EstructuraDatos.ListLinked.ListLinked;
import EstructuraDatos.ListLinked.Node;
import Clases.Profesor;

/**
 *
 * @author Yohan Hilpa
 */
public class RegistrarProfesor extends javax.swing.JPanel {
    public static ListLinked listLinked = new ListLinked();
    
    Profesor profesor1 = new Profesor("Harriet McKenzie", "Burns", "Rosario", 80706640, "935379210", "Apartado núm.: 387, 6573 Sed Calle", "Curso1");
    Profesor profesor2 = new Profesor("Tyler Emerald", "Mcconnell", "Reilly", 76485967, "978537996", "158-4934 Arcu Av.", "Curso1");
    Profesor profesor3 = new Profesor("Suki Ruby", "Koch", "Bentley", 58989343, "986225062", "1693 Erat. Calle", "Curso1");
    Profesor profesor4 = new Profesor("Audra Emerald", "Berry", "Downs", 84569016, "955089455", "286-5664 Id Av.", "Curso1");
    
    Node n4 = new Node(profesor4);
    Node n3 = new Node(profesor3, n4);
    Node n2 = new Node(profesor2, n3);
    Node n1 = new Node(profesor1, n2);
    
    
    public RegistrarProfesor() {
        initComponents();
        
        listLinked.insertFirst(n3);
        listLinked.insertFirst(n2);
        listLinked.insertFirst(n1);
        listLinked.insertLast(n4);
        
        //listLinked.toString1();
        
        mostrarUltimo();
        
    }
    public void addNodes(Profesor data){
        n4.setData(data);
        mostrarUltimo();
    }
    public void mostrarUltimo(){
        Profesor ultimoProfesor = (Profesor) listLinked.getLast().getData();

        System.out.println("Último Profesor: " + ultimoProfesor.toString());
        
        tfNombreCompleto.setText(ultimoProfesor.getNombreCompleto());
        tfPrimerApellido.setText(ultimoProfesor.getPrimerApellido());
        tfSegundoApellido.setText(ultimoProfesor.getSegundoApellido());
        tfDNI.setText(ultimoProfesor.getDNI().toString());
        tfCelular.setText(ultimoProfesor.getCelular());
        tfDireccion.setText(ultimoProfesor.getDireccion());
        tfCurso.setText(ultimoProfesor.getCurso());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfNombreCompleto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfPrimerApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfSegundoApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfDNI = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfCelular = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfDireccion = new javax.swing.JTextField();
        bRegistrarProfesor = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tfCurso = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Datos del Profesor:");

        jLabel2.setText("Nombre completo:");

        tfNombreCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreCompletoActionPerformed(evt);
            }
        });

        jLabel3.setText("Primer Apellido:");

        tfPrimerApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPrimerApellidoActionPerformed(evt);
            }
        });

        jLabel4.setText("Segundo Apellido:");

        tfSegundoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSegundoApellidoActionPerformed(evt);
            }
        });

        jLabel5.setText("DNI:");

        tfDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDNIActionPerformed(evt);
            }
        });

        jLabel6.setText("N?mero de celular:");

        tfCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCelularActionPerformed(evt);
            }
        });

        jLabel7.setText("Direcci?n:");

        tfDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDireccionActionPerformed(evt);
            }
        });

        bRegistrarProfesor.setText("Registrar");
        bRegistrarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistrarProfesorActionPerformed(evt);
            }
        });

        jLabel8.setText("Curso:");

        tfCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCursoActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(bRegistrarProfesor)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bRegistrarProfesor)
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfNombreCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreCompletoActionPerformed

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

    private void tfCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCursoActionPerformed

    private void bRegistrarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistrarProfesorActionPerformed
        String nombreCompleto = tfNombreCompleto.getText();
        String primerApellido = tfPrimerApellido.getText();
        String segundoApellido = tfSegundoApellido.getText();
        int DNI = Integer.parseInt(tfDNI.getText());
        String celular = tfCelular.getText();
        String direccion = tfDireccion.getText();
        String curso = tfCurso.getText();
        
        Profesor nuevoProfesor = new Profesor(nombreCompleto, primerApellido, segundoApellido, DNI, celular, direccion, curso);
        
        addNodes(nuevoProfesor);
    }//GEN-LAST:event_bRegistrarProfesorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bRegistrarProfesor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField tfCelular;
    private javax.swing.JTextField tfCurso;
    private javax.swing.JTextField tfDNI;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfNombreCompleto;
    private javax.swing.JTextField tfPrimerApellido;
    private javax.swing.JTextField tfSegundoApellido;
    // End of variables declaration//GEN-END:variables
}
