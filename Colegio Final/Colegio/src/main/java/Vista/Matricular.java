/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Clases.Alumno;
import EstructuraDatos.BST.BST;
import EstructuraDatos.ListLinked.ListLinked;
import EstructuraDatos.ListLinked.Node;
import Clases.NotasMensuales;
import HashTable.HashAlumnos;
//import Vista.Prinicipal;
import Vista.Notas;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class Matricular extends javax.swing.JPanel {
    
    public static HashAlumnos hashA = new HashAlumnos(20);

    public static BST bst = new BST();
    public static ListLinked notas;
    /**
     * Creates new form Matricular
     */
    public Matricular() {
        initComponents();
        
        NotasMensuales nota = new NotasMensuales(0.0, 0.0, 0.0, 0.0, 0.0);
        
        ListLinked notas = new ListLinked();
        
        Node n4 = new Node(nota);
        Node n3 = new Node(nota, n4);
        Node n2 = new Node(nota, n3);
        Node n1 = new Node(nota, n2);
        Node n0 = new Node(nota);
                
        notas.insertFirst(n3);
        notas.insertFirst(n2);
        notas.insertFirst(n1);
        notas.insertFirst(n0);
        notas.insertLast(n4);
        
        System.out.println(notas.getFirst().getData());
        nota = (NotasMensuales) notas.getFirst().getData();
        System.out.println(nota.getNotaFinal());
        
        Alumno alumno1 = new Alumno("Harriet McKenzie", "Burns", "Rosario", 80706640, "935379210", "Apartado núm.: 387, 6573 Sed Calle", notas);
        Alumno alumno2 = new Alumno("Tyler Emerald", "Mcconnell", "Reilly", 76485967, "978537996", "158-4934 Arcu Av.", notas);
        Alumno alumno3 = new Alumno("Suki Ruby", "Koch", "Bentley", 58989343, "986225062", "1693 Erat. Calle", notas);
        Alumno alumno4 = new Alumno("Audra Emerald", "Berry", "Downs", 84569016, "955089455", "286-5664 Id Av.", notas);
        Alumno alumno5 = new Alumno("Molly Jana", "Johnson", "Terrell", 77084356, "989601419", "Apdo.:315-1849 Sem Calle", notas);
        Alumno alumno6 = new Alumno("Aiko Barry", "Hopkins", "Atkins", 49720523, "999498277", "250-1747 Duis Av.", notas);
        Alumno alumno7 = new Alumno("Kieran Matthew", "Berry", "Duke", 48239445, "992255960", "Apartado núm.: 158, 1519 Fringilla Avenida", notas);
        Alumno alumno8 = new Alumno("Francesca Felicia", "Dunn", "Lawrence", 41060179, "955851824", "Apdo.:326-5093 Mollis Av.", notas);
        
        bst.insert(alumno1);
        bst.insert(alumno2);
        bst.insert(alumno3);
        bst.insert(alumno4);
        bst.insert(alumno5);
        bst.insert(alumno6);
        bst.insert(alumno7);
        bst.insert(alumno8);
        
        //bst.preOrden();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfNombreCompleto = new javax.swing.JTextField();
        tfPrimerApellido = new javax.swing.JTextField();
        tfSegundoApellido = new javax.swing.JTextField();
        tfDNI = new javax.swing.JTextField();
        tfCelular = new javax.swing.JTextField();
        tfDireccion = new javax.swing.JTextField();
        bMatricular = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Datos del Estudiante:");

        jLabel2.setText("Nombre completo:");

        jLabel3.setText("Primer Apellido:");

        jLabel4.setText("Segundo Apellido:");

        jLabel5.setText("DNI:");

        jLabel6.setText("Número de celular:");

        jLabel7.setText("Dirección:");

        tfNombreCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreCompletoActionPerformed(evt);
            }
        });

        tfPrimerApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPrimerApellidoActionPerformed(evt);
            }
        });

        tfSegundoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSegundoApellidoActionPerformed(evt);
            }
        });

        tfDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDNIActionPerformed(evt);
            }
        });

        tfCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCelularActionPerformed(evt);
            }
        });

        tfDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDireccionActionPerformed(evt);
            }
        });

        bMatricular.setText("Matricular");
        bMatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMatricularActionPerformed(evt);
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
                                    .addComponent(tfNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(bMatricular)))
                .addContainerGap(122, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addComponent(bMatricular)
                .addContainerGap(127, Short.MAX_VALUE))
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

    private void bMatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMatricularActionPerformed
        NotasMensuales nota = new NotasMensuales(0.0, 0.0, 0.0, 0.0, 0.0);
        
        ListLinked notas = new ListLinked();
        
        Node n4 = new Node(nota);
        Node n3 = new Node(nota, n4);
        Node n2 = new Node(nota, n3);
        Node n1 = new Node(nota, n2);
        Node n0 = new Node(nota);
                
        notas.insertFirst(n3);
        notas.insertFirst(n2);
        notas.insertFirst(n1);
        notas.insertFirst(n0);
        notas.insertLast(n4);
        
        System.out.println(notas.getFirst().getData());
        nota = (NotasMensuales) notas.getFirst().getData();
        
        
        // El 'trim' usado para validar que al final del texto, no tenga en cuenta los espacios en blanco
        if(!isDNI(tfDNI.getText().trim())){     // Para que el DNI sea 8 digitos
            JOptionPane.showMessageDialog(null, "El Nro. de DNI ingresado, NO es Correcto...");
            return;}
        if (!isCelular(tfCelular.getText().trim())){        // Para que el Celular sea 9 digitos
            JOptionPane.showMessageDialog(null, "El Nro. de Celular ingresado, NO es Correcto...");
            return;}
        String nombreCompleto = tfNombreCompleto.getText();
        String primerApellido = tfPrimerApellido.getText();
        String segundoApellido = tfSegundoApellido.getText();
        int dni = Integer.parseInt(tfDNI.getText());
        String celular = tfCelular.getText();
        String direccion = tfDireccion.getText();

        
        // Estructura Soporte
        hashA.insert(dni, nombreCompleto, primerApellido, segundoApellido, notas);
        System.out.println(hashA);
        
        System.out.print("\n");
        hashA.search(dni);
        
        
        //ArrayList<Object> notas = new ArrayList<Object>();
        
        Alumno alumno = new Alumno(nombreCompleto, primerApellido, segundoApellido, dni, celular, direccion, notas);
        bst.insert(alumno);
        bst.preOrden();
        /*
        String campo1 = primerApellido + " " + segundoApellido + ", " + nombreCompleto;
        int campo2 = 0;
        int campo3 = 0;
        int campo4 = 0;
        int campo5 = 0;
        int campo6 = 0;
        */
        String campo0 = Integer.toString(alumno.getDNI());
        String campo1 = primerApellido + " " + segundoApellido + ", " + nombreCompleto;
        System.out.println(campo1);
        //System.out.println(alumnos.get(i).getNota1());

        double campo2 = alumno.getNota1();
        System.out.println(campo2);
        double campo3 = alumno.getNota2();
        System.out.println(campo3);
        double campo4 = alumno.getNota3();
        System.out.println(campo4);
        double campo5 = alumno.getNota4();
        System.out.println(campo5);
        double campo6 = alumno.getNotaFinal();
        System.out.println(campo6);

        String[] row = {campo0, campo1, String.valueOf(campo2), String.valueOf(campo3), String.valueOf(campo4), String.valueOf(campo5), String.valueOf(campo6)};
        
        //Object[] row = {campo1, campo2, campo3, campo4, campo5, campo6};
        
        Notas.modelo.addRow(row);
        
        /*
        //Alumno alumno1 = new Alumno(nombreCompleto, primerApellido, segundoApellido, dni, celular, "asdas", notas);
        Alumno alumno1 = new Alumno("Nombre1", "Apellido1", "Apellido1", 1, "9", "Direccion1", notas);
        Alumno alumno2 = new Alumno("Nombre2", "Apellido2", "Apellido2", 2, "8", "Direccion2", notas);
        Alumno alumno3 = new Alumno("Nombre3", "Apellido3", "Apellido3", 3, "7", "Direccion3", notas);
        Alumno alumno4 = new Alumno("Nombre4", "Apellido4", "Apellido4", 4, "6", "Direccion4", notas);
        */
    }//GEN-LAST:event_bMatricularActionPerformed

    public static boolean isDNI(String dato){
        return dato.matches("[0-9]{1,8}");
        //return dato.matches("[a-zA-Z]*");     // Para que me acepte cadenas de texto y el "*" para que reciba cualquier cantidad de caracteres
    }
    
    public static boolean isCelular(String dato){
        return dato.matches("[0-9]{1,9}");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bMatricular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField tfCelular;
    private javax.swing.JTextField tfDNI;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfNombreCompleto;
    private javax.swing.JTextField tfPrimerApellido;
    private javax.swing.JTextField tfSegundoApellido;
    // End of variables declaration//GEN-END:variables
}