/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTable;

// Betsy 


import Clases.Examen;
import java.util.ArrayList;

public class Hash {
	ArrayList<LinkedList<Examen>> hashTable;
        int m;
	public Hash(int size) {
		inicializador(size);
	}
	
	public void insert(Examen ex) {
		insertLL(ex);
	}
	public void remove(Examen ex) {
		removeLL(ex);
	}
	public void search(Examen ex) {
		searchLL(ex);
	}
	private void searchLL(Examen ex) {
		int f=funcionHash(ex.getFechaExamen().getDay());
		String retorno=hashTable.get(f).search(ex);
		if (retorno!=null) System.out.println(retorno+" Se encuentra en la posicion "+f);
		else System.out.println(retorno+" NO EXISTE ");
	}
	private void removeLL(Examen ex) {
		int f=funcionHash(ex.getFechaExamen().getDay());
		hashTable.get(f).deleteNode(ex);
	}

	private void insertLL(Examen ex) {
		int f = funcionHash(ex.getFechaExamen().getDay());
		hashTable.get(f).insert(ex);
                System.out.println("Se inserto el elemento: " + hashTable.get(f));
	}

	private int funcionHash(int e) {
		return e % m;
	}
	private void inicializador(int size) {
		
            m=size;
            hashTable=new ArrayList<LinkedList<Examen>>(m);
            for (int i=0;i<m;i++) {
                    hashTable.add(new LinkedList<Examen>());
            }
		
		
	}
	private int nuevoM(int a) {
		int e;
		e=(int)Math.round((a+(a*0.4)));
		
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
	}
	
	public String toString() {
		return toSLL();
        }
        
	public String toSLL() {
		String cadena="D.REAL\t Elementos\n";
		for (int i=0;i<hashTable.size();i++) {
			cadena +=i+"-->\t";
			if (hashTable.get(i).isEmpty())cadena+="\tempty";
			else cadena+=hashTable.get(i).toString();
			cadena+="\n";
		}
		return cadena;
	}
}
