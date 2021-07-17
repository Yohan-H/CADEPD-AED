/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTable;

import Clases.NotasMensuales;
import java.util.ArrayList;

/**
 *
 * @author Adrian
 */
public class HashNotas {
    //ArrayList<LinkedList<Nota>> hashTable;
    ArrayList<LinkedQueue<NotasMensuales>> hashTable;
    int m;
    
    public HashNotas(int size) {
        inicializador(size);
    }
	
    public void insert(double notaFinal, double nota1, double nota2, double nota3, double nota4) {
        insertLQ(notaFinal,nota1,nota2,nota3,nota4);
    }
    
    public void remove(double notaFinal) throws ExceptionIsEmpty {
        removeLQ(notaFinal);
    }
    
    public void search(double notaFinal) throws ExceptionIsEmpty {
        searchLQ(notaFinal);
    }
    
    private void insertLQ(double notaFinal, double nota1, double nota2, double nota3, double nota4) {
        int n = (int) Math.round(notaFinal);
        int f = funcionHash(n);
        hashTable.get(f).enqueue(new NotasMensuales(nota1,nota2,nota3,nota4,notaFinal));
        System.out.println("El elemento que se ingreso fue: " + hashTable.get(f));
    }
    
    private void searchLQ(double notaFinal) throws ExceptionIsEmpty{
        int n = (int) Math.round(notaFinal);
        int f = funcionHash(n);
        NotasMensuales retorno = hashTable.get(f).front();
        if (retorno != null) 
            System.out.println("El elemento " + retorno + " Se encuentra en la Posicion: " + f);
        else 
            System.out.println("El elemento " + retorno + " NO EXISTE ");
    }
    
    private void removeLQ(double notaFinal) throws ExceptionIsEmpty {
        int n = (int) Math.round(notaFinal);
        int f = funcionHash(n);
        hashTable.get(f).dequeue();
    }
    
    private int funcionHash(int key) {
        return key % m;
    }
    
    private int funcionHashCuadratica(int key) {
        String cad = Integer.toString(key*key);
        int digitCentral = getDigitCount(m);
        int mid = (cad.length()-1)/2;
        int aux = 0;
        for (int i = 0; i <= cad.length(); i++) {
            if (i == mid) {
                aux = Integer.parseInt(cad.substring(i,i+digitCentral));
            }
        }
        return aux;
    }
    
    private static int getDigitCount(int n) {
        int nDigits = 0;
        while (n > 9) {
            n /= 10;
            nDigits++;
        }
        return nDigits;
    }
    
    
    private void inicializador(int size) {
        this.m = size;
        hashTable=new ArrayList<LinkedQueue<NotasMensuales>>(m);
        for (int i=0;i<m;i++) {
            hashTable.add(new LinkedQueue<NotasMensuales>());
        }
    }
    /*
    private int nuevoM(int a) {
        int e;
        e = (int)Math.round((a+(a*0.4)));
        return primoSuperior(e);
    }
    
    private int primoSuperior(int e) {
        e =(e%2==0)?e+1:e;
        boolean a=esPrimo(e);
        while (!a) {
            e+=2;a=esPrimo(e);
        }
        return e;
    }
    
    private boolean esPrimo(int e) {
        for(int i=3;i*i<=e;i+=2) {
            if(e%i==0)
                return false;
        }
        return true;
    }*/
    
    public String toString() {
        return toSLQ();
    }
        
    public String toSLQ() {
        String cadena = "\n| \tD.REAL\t | \tELEMENTOS\t\n";
        for (int i = 0;i < hashTable.size();i++) {
            cadena += "\t" + i + "\t ==> \t";
            if (hashTable.get(i).isEmpty())
                cadena += "empty";
            else 
                cadena += hashTable.get(i).toString();
            cadena += "\n";
        }
        return cadena;
    }
}
