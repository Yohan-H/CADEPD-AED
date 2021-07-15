package Hashing;

import java.util.ArrayList;

import Clases.Profesor;

public class HashingProfesores {
	ArrayList<Profesor> tabla;
	ArrayList<LinkedList<Profesor>> listProfesores;
	//ListLinked notas;
	int m;
	boolean tipo;
	
	// Constructor
	public HashingProfesores(int a,boolean tipo) {
		this.tipo = tipo;	// True: Direccionamiento Abierto | False: Encadenamiento
		inicializador(a, tipo);
	}
	
	// INSERT
	public void insert(int dni, String nombre, String priApellido, String secApellido, String curso) {
		if (tipo == true) 
			insertarConCuadratica(nombre, dni);
		else 
			insertNodeList(nombre, dni, priApellido, secApellido, curso);
	}
	
	public void remove(int dni) {
		if (tipo == true) 
			removeTrue(dni);
		else 
			removeNodeList(dni);
	}
	
	// SEARCH
	public void search(int dni) {
		if (tipo == true) 
			searchTrue(dni);
		else 
			searchNodeList(dni);
	}
	
	
	
	private void searchTrue(int codigo) {
		int f = cuadratica(funcionHash(codigo),codigo, false);
		if (f != -1) 
			System.out.println(tabla.get(f).nombreCompleto + " " + codigo + " Se encuentra en la posicion "+ f);
		else 
			System.out.println(codigo+" NO EXISTE ");
	}
	
	
	
	// Inserci�n en Encadenamiento
	private void insertNodeList(String nombre,int dni, String priApellido, String secApellido, String curso) {
		int f = funcionHash(dni);
		listProfesores.get(f).insert(new Profesor(dni, nombre, priApellido, secApellido, curso));
		System.out.println("Se inserto el elemento: " + listProfesores.get(f));
	}
	
	// Busqueda en Encadenamiento
	private void searchNodeList(int dni) {
		int f = funcionHash(dni);
		String aux = listProfesores.get(f).search(new Profesor(dni,"", "", "", ""));
		if (aux != null) 
			System.out.println(aux + " Se encuentra en la posicion " + f);
		else 
			System.out.println(aux +" NO EXISTE ");
	}
	
	// REMOVE
	// Eliminaci�n en Encadenamiento
	private void removeNodeList(int dni) {
		int f = funcionHash(dni);
		listProfesores.get(f).deleteNode(new Profesor(dni,"", "", "",""));
	}
	
	private void removeTrue(int codigo) {
		int f=cuadratica(funcionHash(codigo),codigo, false);
		if (f!=-1) 
			tabla.set(f, null);
	}
	
	
	private int cuadratica(int pos,int dni,boolean f) {
		int inicial = pos, con = 1;
		do {
			if (tabla.get(pos) != null &&tabla.get(pos).dni == dni) {
				if (f)
					return -1;
				else 
					return pos;
			}
			if (f == true && tabla.get(pos)==null) {
				return pos;
			}
			else {
				pos = (pos + (con*con)) % m;
				con++;
			}
		}while(inicial != pos);
		return -1;
	}
	
	private void insertarConCuadratica(String nombre,int dni) {
		int indice = cuadratica(funcionHash(dni), dni,true);
		if (indice == -1) {
			System.out.println("ESTA LLENOOO O ELEMENTO YA EXISTE");
		}
		else {
			tabla.set(indice, new Profesor(dni,nombre,"" ,"" ,"" ));
		}
	}
	private int funcionHash(int e) {
		return e % m;
	}
	
	private void inicializador(int a,boolean tipo) {
		if (tipo==true) {
			m = nuevoM(a);			
			tabla = new ArrayList<Profesor>(m);
			for (int i=0;i < m;i++) {
				tabla.add(null);
			}
		}
		else {	// Inicializando Tabla de Hash basada en Encadenamiento
			m = a;
			listProfesores = new ArrayList<LinkedList<Profesor>>(m);
			for (int i = 0; i < m ; i++) {
				listProfesores.add(new LinkedList<Profesor>());
			}
		
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
		if (tipo) { 
			return toST();
		}
		else {
			return toSLinkedList();
		}
}
	public String toST() {
		String cadena="D.REAL\t D.HASH\t Codigo\t Nombre\n";
		for (int i=0;i<tabla.size();i++) {
			cadena +=i+"-->\t";
			if (tabla.get(i)==null)cadena+="empty\t empty\t empty";
			else cadena+=funcionHash(tabla.get(i).dni)+"\t "+tabla.get(i).dni+"\t "+tabla.get(i).nombreCompleto + tabla.get(i).primerApellido + tabla.get(i).segundoApellido;
			cadena+="\n";
		}
		return cadena;
	}
	
	// toString() para mostrar Elementos de una Tabla basada en Encadenamiento
	public String toSLinkedList() {
		String cadena="\n| D.REAL\t | \tElementos\t \n";
		for (int i = 0; i < listProfesores.size(); i++) {
			cadena += i + "\t\t ==> \t";
			if (listProfesores.get(i).isEmpty())
				cadena += "empty";
			else 
				cadena += listProfesores.get(i).toString();
			cadena += "\n";
		}
		return cadena;
	}

}
