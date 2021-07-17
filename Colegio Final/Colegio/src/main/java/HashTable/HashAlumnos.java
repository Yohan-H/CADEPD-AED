/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTable;

import Clases.Alumno;
import EstructuraDatos.BST.BST;
import EstructuraDatos.ListLinked.ListLinked;
import java.util.ArrayList;

/**
 *
 * @author Adrian
 */
public class HashAlumnos {
    ArrayList<BST<Alumno>> bstListAlumnos;
    int m;
    
    public HashAlumnos(int size) {
        inicializador(size);
    }
	
    public void insert(int dni, String nombre, String priApellido, String secApellido, ListLinked notas) {
        insertBST(dni, nombre, priApellido, secApellido, notas);
    }
    
    public void remove(int dni){
        removeBST(dni);
    }
    
    public void search(int dni){
        searchBST(dni);
    }
    
    private void insertBST(int dni, String nombre, String priApellido, String secApellido, ListLinked notas) {
        int f = funcionHash(dni);
        bstListAlumnos.get(f).insert(new Alumno(dni, nombre, priApellido, secApellido, notas) );
        System.out.println("El elemento que se ingreso fue: " + bstListAlumnos.get(f));
    }
    
    private void searchBST(int dni) {
        int f = funcionHash(dni);
        BST aux = bstListAlumnos.get(f).searchDNI(dni);
        if (aux != null) 
            System.out.println("El elemento " + aux + " Se encuentra en la Posicion: " + f);
        else 
            System.out.println("El elemento " + aux + " NO EXISTE ");
    }
    
    private void removeBST(int dni) {
        int f = funcionHash(dni);
        bstListAlumnos.get(f).remove(new Alumno(dni, "", "", "", null));
    }
    
    private int funcionHash(int e) {
        return e % m;
    }
    
    private void inicializador(int size) {
        this.m = numPrimoSup(size);
        this.bstListAlumnos=new ArrayList<BST<Alumno>>(m);
        for (int i=0;i<m;i++) {
            bstListAlumnos.add(new BST<Alumno>());
        }
    }
    
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
     
    public String toString() {
        return toBST();
    }
        
    public String toBST() {
        String cadena = "\n| \tD.REAL\t | \tELEMENTOS\t\n";
        for (int i = 0;i < bstListAlumnos.size();i++) {
            cadena += "\t" + i + "\t ==> \t";
            if (bstListAlumnos.get(i).isEmpty())
                cadena += "empty";
            else 
                cadena += bstListAlumnos.get(i).toString();
            cadena += "\n";
        }
        return cadena;
    }
    
}
