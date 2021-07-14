/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Vista.Matricular;
import EstructuraDatos.BST.BST;
import java.util.*;
import Clases.Alumno;
import Vista.Prinicipal;
import Clases.CalificacionesMensuales;
import EstructuraDatos.ListLinked.ListLinked;
import EstructuraDatos.ListLinked.Node;


/**
 *
 * @author Adrian Valencia Sacatuma
 */
public class Notas<E> extends javax.swing.JPanel {
    public static DefaultTableModel modelo;
    Vector<Object> vector = new Vector<>();				// Generico
    DefaultTableModel modelo2;
    double sumatoria = 0;
    double cantidad = 0;
    double mayor = -999.99;
    
    public Notas() {
        initComponents();
        modelo = new DefaultTableModel();				// Objeto para trabajar con las Tablas
        modelo2 = new DefaultTableModel();
        tNotas.setModel(modelo);						// Cambio de Modelo
        
        actualizar();
    }
    private void actualizar(){
        agregar();
        tNotas.setModel(modelo);
        ArrayList<Alumno> alumnos = Matricular.bst.recorrer();
        for (int i = 0; i < alumnos.size(); i++){
            String nombreCompleto = alumnos.get(i).getNombreCompleto();			// Obtener principales datos de Alumnos
            String primerApellido = alumnos.get(i).getPrimerApellido();
            String segundoApellido = alumnos.get(i).getSegundoApellido();
            Integer dni = alumnos.get(i).getDNI();
            
            String campo0 = Integer.toString(dni);
            String campo1 = primerApellido + " " + segundoApellido + ", " + nombreCompleto;			// Concadenaci�n
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
                    
            String[] row = {campo0, campo1, String.valueOf(campo2), String.valueOf(campo3), String.valueOf(campo4), String.valueOf(campo5), String.valueOf(campo6)};	// Conversi�n
            
            //String[] row = {campo1, campo1, campo1, campo1, campo1, campo1};
            
            modelo.addRow(row);			// Agregar Fila(s)
            
            
        }
        
    }
    private void agregar(){
        int numRows = modelo.getRowCount();		// obtengo el numero de filas de la tabla 'modelo'
        for (int i = 0; i < numRows; i++){
            modelo.removeRow(i);
        }
        
        modelo = new DefaultTableModel();		// me permitira modificar la estructura de la tabla, cambiandole el nombre de cada columna
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

        jLabel1.setText("Promedio: ");

        lPromedio.setText("Nota ");

        lMaxima.setText("Nota");

        jLabel3.setText("Nota m�xima: ");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addContainerGap(72, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

   
    
    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        sumatoria = 0;
        cantidad = 0;
        BST<E> bst2 = new BST<E>();
        boolean val1, val2, val3, val4;
        double nota1, nota2, nota3, nota4;
        
        Vector<Vector> vector2 = modelo.getDataVector();		// obtengo todo lo que tiene la tabla (excepto la fila de las columnas)
        for (int i = 0; i < vector2.size(); i++){				
            Vector row = (Vector) vector2.get(i);				// En cada iteraci�n, cada fila se guarda en 1 row
            int dni = Integer.parseInt((String) row.get(0));
            
            Alumno alumno = Matricular.bst.searchDNI(dni).getData();	// se obtiene el alumno con el cual vamos a trabajar
            
            
            // PRE-CONDICI�N: cada nota es de 0.0 a 20.0
            nota1 = Double.parseDouble(row.get(2).toString());	// indico y almaceno 3er elemento de la fila
            val1 = validarNota(nota1);
            if (val1 == false) {
            	JOptionPane.showMessageDialog(null, "Nota ingresada no esta entre el rango de 0 a 20");            	
            	return;
            }
            nota2 = Double.parseDouble(row.get(3).toString());
            val2 = validarNota(nota2);
            if (val2 == false) {
            	JOptionPane.showMessageDialog(null, "Nota ingresada no esta entre el rango de 0 a 20");
            	return;
            }
            nota3 = Double.parseDouble(row.get(4).toString());
            val3 = validarNota(nota3);
            if (val3 == false) {
            	JOptionPane.showMessageDialog(null, "Nota ingresada no esta entre el rango de 0 a 20");
            	return;
            }
            nota4 = Double.parseDouble(row.get(5).toString());
            val4 = validarNota(nota4);
            if (val4 == false) {
            	JOptionPane.showMessageDialog(null, "Nota ingresada no esta entre el rango de 0 a 20");
            	return;
            }
            double notaFinal = (nota1 + nota2 + nota3 + nota4)/4;
            
            CalificacionesMensuales nota = new CalificacionesMensuales("curso1", 0.0, 0.0, nota1, nota2, nota3, nota4, notaFinal);
            
            ListLinked<E> notas = new ListLinked<E>();		// Para almacenar esas notas en nodos
        
            Node<E> n4 = new Node(nota);
            Node<E> n3 = new Node(nota, n4);
            Node<E> n2 = new Node(nota, n3);
            Node<E> n1 = new Node(nota, n2);
            Node<E> n0 = new Node(nota);

            notas.insertFirst(n3);
            notas.insertFirst(n2);
            notas.insertFirst(n1);
            notas.insertFirst(n0);
            notas.insertLast(n4);
            modelo.setValueAt(notaFinal, i, 6);			// Cambio el Elemento del campo 6 segun la fila 'i'
            alumno.setNotas(notas);						// Se actualiza con lo agregado en la tabla
            bst2.insert(alumno);						// Se pasan los valores del arbol original asignarlos a un arbol nuevo (donde se le inserta cada uno de los alumnos segun las iteraciones que se realicen en la fila)
            sumatoria = sumatoria + Double.parseDouble(modelo.getValueAt(i, 6).toString());	// sumatoria de fila '6'

                    
            cantidad = cantidad + 1;
            System.out.println(notaFinal);
            if (notaFinal > mayor) { 
                mayor = notaFinal;
                System.out.println("NOTAS FINALES--------");
                //System.out.println(notaFinal);
            }
            
        }
        Matricular.bst = bst2;
        Matricular.bst.preOrden();
        //actualizar2();
        //Principal.llamar();
        Prinicipal principal = new Prinicipal();
        lPromedio.setText(String.valueOf(sumatoria / cantidad));		// cambiar de resultado del Promedio y de la Nota Maxima
        lMaxima.setText(String.valueOf(mayor));
    }//GEN-LAST:event_bModificarActionPerformed
    
    /*
    public void actionPerformed(ActionEvent e) {
    	boolean v = se
    }
    */
    public static boolean validation(String cad) {
    	double num = Double.parseDouble(cad);
    	if (0.0 <= num && num <= 9999999.99)
    		return true;
    	return false;
    }
    
    public static boolean validarNota(double nota) {
    	if (0.0 <= nota && nota <= 20.0) {
    		return true;
    	}
    	return false;
    	
    	
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lMaxima;
    private javax.swing.JLabel lPromedio;
    private javax.swing.JTable tNotas;
    // End of variables declaration//GEN-END:variables
}
