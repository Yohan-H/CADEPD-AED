 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import javax.swing.table.DefaultTableModel;
import Vista.Matricular;
import EstructuraDatos.BST.BST;
import java.util.*;
import Clases.Alumno;
import Vista.Prinicipal;
import Clases.NotasMensuales;
import EstructuraDatos.ListLinked.ListLinked;
import EstructuraDatos.ListLinked.Node;
import HashTable.ExceptionIsEmpty;
import HashTable.HashNotas;
import javax.swing.JOptionPane;


/**
 *
 * @author Adrian Valencia
 */
public class Notas extends javax.swing.JPanel {
    public static DefaultTableModel modelo;
    Vector<Object> vector = new Vector<>();
    HashNotas hashN = new HashNotas(21);            // Creación de un Hashing para Notas
    DefaultTableModel modelo2;
    double sumatoria = 0;
    double cantidad = 0;
    double menor = 999.99;
    double mayor = -999.99;
    
    public Notas() {
        initComponents();
        modelo = new DefaultTableModel();
        modelo2 = new DefaultTableModel();
        tNotas.setModel(modelo);
        
        actualizar();
    }
    private void actualizar(){
        agregar();
        tNotas.setModel(modelo);
        ArrayList<Alumno> alumnos = Matricular.bst.recorrer();
        for (int i = 0; i < alumnos.size(); i++){
            String nombreCompleto = alumnos.get(i).getNombreCompleto();
            String primerApellido = alumnos.get(i).getPrimerApellido();
            String segundoApellido = alumnos.get(i).getSegundoApellido();
            Integer dni = alumnos.get(i).getDNI();
            
                        
            String campo0 = Integer.toString(dni);
            String campo1 = primerApellido + " " + segundoApellido + ", " + nombreCompleto;
            System.out.println(campo1);
            System.out.println(alumnos.get(i).getNota1());
            
            double campo2 = alumnos.get(i).getNota1();
            System.out.println(campo2);
            double campo3 = alumnos.get(i).getNota2();
            System.out.println(campo3);
            double campo4 = alumnos.get(i).getNota3();
            System.out.println(campo4);
            double campo5 = alumnos.get(i).getNota4();
            System.out.println(campo5);
            double campo6 = alumnos.get(i).getNotaFinal();
            //System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            System.out.println(campo6);
                    
            String[] row = {campo0, campo1, String.valueOf(campo2), String.valueOf(campo3), String.valueOf(campo4), String.valueOf(campo5), String.valueOf(campo6)};
            
            //String[] row = {campo1, campo1, campo1, campo1, campo1, campo1};
            
            modelo.addRow(row);
            
            
        }
        
    }
    /*
    private void actualizar2(){
        agregar();
        tNotas.setModel(modelo);
        ArrayList<Alumno> alumnos = Matricular.bst.recorrer();
        for (int i = 0; i < alumnos.size(); i++){
            String nombreCompleto = alumnos.get(i).getNombreCompleto();
            String primerApellido = alumnos.get(i).getPrimerApellido();
            String segundoApellido = alumnos.get(i).getSegundoApellido();
            Integer dni = alumnos.get(i).getDNI();
            
            String campo0 = Integer.toString(dni);
            String campo1 = primerApellido + " " + segundoApellido + ", " + nombreCompleto;
            System.out.println(campo1);
            System.out.println(alumnos.get(i).getNota1());
            
            double campo2 = alumnos.get(i).getNota1();
            System.out.println(campo2);
            double campo3 = alumnos.get(i).getNota2();
            System.out.println(campo3);
            double campo4 = alumnos.get(i).getNota3();
            System.out.println(campo4);
            double campo5 = alumnos.get(i).getNota4();
            System.out.println(campo5);
            double campo6 = alumnos.get(i).getNotaFinal();
            //System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            System.out.println(campo6);
                    
            String[] row = {campo0, campo1, String.valueOf(campo2), String.valueOf(campo3), String.valueOf(campo4), String.valueOf(campo5), String.valueOf(campo6)};
            
            //String[] row = {campo1, campo1, campo1, campo1, campo1, campo1};
            
            modelo.addRow(row);
            
            
        }
        
    }*/
    private void agregar(){
        int numRows = modelo.getRowCount();
        for (int i = 0; i < numRows; i++){
            modelo.removeRow(i);
        }
        
        modelo = new DefaultTableModel();
        modelo.addColumn("DNI");
        modelo.addColumn("Estudiante");
        modelo.addColumn("Nota 1");
        modelo.addColumn("Nota 2");
        modelo.addColumn("Nota 3");
        modelo.addColumn("Nota 4");
        modelo.addColumn("Nota Final");
        
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
        tNotas = new javax.swing.JTable();
        bModificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lPromedio = new javax.swing.JLabel();
        lMaxima = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lMinima = new javax.swing.JLabel();

        tNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tNotas);

        bModificar.setText("Modificar");
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });

        jLabel1.setText("Promedio General: ");

        lPromedio.setText("Nota ");

        lMaxima.setText("Nota");

        jLabel3.setText("Nota máxima: ");

        jLabel2.setText("Nota mínima: ");

        lMinima.setText("Nota");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(bModificar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lMinima)
                            .addComponent(lPromedio)
                            .addComponent(lMaxima))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lPromedio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lMaxima))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lMinima))
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

   
    
    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        sumatoria = 0;
        cantidad = 0;
        BST bst2 = new BST();
        int contA = 0;
        boolean val;
        
        Vector<Object> vector2 = modelo.getDataVector();
        for (int i = 0; i < vector2.size(); i++){
            Vector row = (Vector) vector2.get(i);
            int dni = Integer.parseInt((String) row.get(0));
            
            Alumno alumno = Matricular.bst.searchDNI(dni).getData();
           
            /*
            if (!isNumeric(row.get(2).toString().trim()) || !isNumeric(row.get(3).toString().trim()) || !isNumeric(row.get(4).toString().trim()) || !isNumeric(row.get(5).toString().trim())){
                JOptionPane.showMessageDialog(null, "Texto ingresado como Nota(s), NO es(son) Correcto(s)");
                return;
            }*/ 
            double nota1 = Double.parseDouble(row.get(2).toString());
            double nota2 = Double.parseDouble(row.get(3).toString());
            double nota3 = Double.parseDouble(row.get(4).toString());
            double nota4 = Double.parseDouble(row.get(5).toString());
            if (!validarNota(nota1) || !validarNota(nota2) || !validarNota(nota3) || !validarNota(nota4)){
                JOptionPane.showMessageDialog(null, "Alguna(s) nota(s) ingresada(s), NO esta(n) entre el 0 al 20");            	
            	return;
            }
            double notaFinal = (nota1 + nota2 + nota3 + nota4)/4;
            
            if (notaFinal != 0.0){
                contA++;
                JOptionPane.showMessageDialog(null, "La nota final del estudiante N.°" + contA + " es: " + notaFinal);            	
                //System.out.println("La nota final del estudiante " + contA + " es: " + notaFinal);
            }
            if (notaFinal >= 12)
                JOptionPane.showMessageDialog(null, "El Estudiante N.°" + contA + " Ha APROBADO el Curso con: " + notaFinal);            	
            else if(notaFinal != 0.0)
                JOptionPane.showMessageDialog(null, "El Estudiante N.°" + contA + " Ha REPROBADO el Curso con: " + notaFinal);            	
            
            // APLICANDO HASHING COMO UNA ESTRUCTURA DE SOPORTE
            // Insertando Notas con Direccionamiento Abierto, donde el Area de Rebalse esta basado en Listas Enlazadas
            try{
                if(notaFinal != 0){
                    hashN.insert(notaFinal, nota1, nota2, nota3, nota4);
                    System.out.println("MOSTRANDO LA TABLA HASH: ");
                    System.out.println(hashN);
                    System.out.print("Buscando la nota final en la LINKED QUEUE: ");
                    hashN.search(notaFinal);
                    //hashN.remove(notaFinal);
                    System.out.println(hashN);
                }
            }
            catch(ExceptionIsEmpty e){
                System.out.println(e.getMessage());
            }
            
            NotasMensuales nota = new NotasMensuales(nota1, nota2, nota3, nota4, notaFinal);
            
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
            modelo.setValueAt(notaFinal, i, 6);
            alumno.setNotas(notas);
            bst2.insert(alumno);
            sumatoria = sumatoria + Double.parseDouble(modelo.getValueAt(i, 6).toString());
            //System.out.println("asdasdasd");
            
           
              
            cantidad = cantidad + 1;
            System.out.println(notaFinal);
            if (notaFinal > mayor) { 
                mayor = notaFinal;
                System.out.println("NOTASFINALES--------");
                System.out.println("LA NOTA MAYOR ES: " + mayor);
                //System.out.println(notaFinal);
            }
            if (notaFinal < menor && notaFinal != 0){
                menor = notaFinal;
                System.out.println("LA NOTA MENOR ES: " + menor);

            }
            
            
        }
        Matricular.bst = bst2;
        Matricular.bst.preOrden();
        //actualizar2();
        //Principal.llamar();
        Prinicipal principal = new Prinicipal();
        lPromedio.setText(String.valueOf(sumatoria / cantidad));
        lMaxima.setText(String.valueOf(mayor));
        lMinima.setText(String.valueOf(menor));
    }//GEN-LAST:event_bModificarActionPerformed

    public static boolean isNumeric(String dato){
        return dato.matches("[0-9]{1,2}");
    }
    
    public static boolean validarNota(double nota) {
    	if (0 <= nota && nota <= 20.0) {
    		return true;
    	}
    	return false;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lMaxima;
    private javax.swing.JLabel lMinima;
    private javax.swing.JLabel lPromedio;
    private javax.swing.JTable tNotas;
    // End of variables declaration//GEN-END:variables
}
