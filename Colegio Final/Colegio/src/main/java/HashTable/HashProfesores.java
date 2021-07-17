/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTable;

import Clases.Profesor;
import java.util.ArrayList;

/**
 *
 * @author Adrian
 */
public class HashProfesores {
    ArrayList<LinkedList<Profesor>> listProfesores;
    int m;
    
    public HashProfesores(int size) {
        inicializador(size);
    }
	
    public void insert(int dni, String nombre, String priApellido, String secApellido, String curso) {
        insertLL(dni, nombre, priApellido, secApellido, curso);
    }
    
    public void remove(int dni){
        removeLL(dni);
    }
    
    public void search(int dni){
        searchLL(dni);
    }
    
    private void insertLL(int dni, String nombre, String priApellido, String secApellido, String curso) {
        int f = funcionHash(dni);
        listProfesores.get(f).insert(new Profesor(dni, nombre, priApellido, secApellido, curso) );
        System.out.println("El elemento que se ingreso fue: " + listProfesores.get(f));
    }
    
    private void searchLL(int dni) {
        int f = funcionHash(dni);
        String aux = listProfesores.get(f).search(new Profesor(dni,"", "", "", ""));
        if (aux != null) 
            System.out.println("El elemento " + aux + " Se encuentra en la Posicion: " + f);
        else 
            System.out.println("El elemento " + aux + " NO EXISTE ");
    }
    
    private void removeLL(int dni) {
        int f = funcionHash(dni);
        listProfesores.get(f).deleteNode(new Profesor(dni, "", "", "", null));
    }
    
    private int funcionHash(int e) {
        return e % m;
    }
    
    private void inicializador(int size) {
        this.m = size;
        listProfesores=new ArrayList<LinkedList<Profesor>>(m);
        for (int i=0;i<m;i++) {
            listProfesores.add(new LinkedList<Profesor>());
        }
    }
    /*
    private int numPrimoSup(int size){
        size = (size % 2 == 0)? size+1 : size;
        boolean a = esPrimo(size);
        while (!a) {
            size += 2;
            a = esPrimo(size);
        }
        return size;
    }
    
    private boolean esPrimo(int size){
        for (int i = 3; i * i <= size; i += 2){
            if(size % i == 0)
                return false;
        }
        return true;
    }
    */
    
    public String toString() {
        return toLL();
    }
        
    public String toLL() {
        String cadena = "\n| \tD.REAL\t | \tELEMENTOS\t\n";
        for (int i = 0;i < listProfesores.size();i++) {
            cadena += "\t" + i + "\t ==> \t";
            if (listProfesores.get(i).isEmpty())
                cadena += "empty";
            else 
                cadena += listProfesores.get(i).toString();
            cadena += "\n";
        }
        return cadena;
    }
}
