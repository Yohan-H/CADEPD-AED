/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTable;

import EstructuraDatos.ListLinked.Node;

/**
 *
 * @author Adrian
 */
public class LinkedQueue<E> {
    private Node<E> front;
    private Node<E> back;
    
    public LinkedQueue() {
        this.front = null;
        this.back = null;
    }
    
    public void enqueue(E x) {
        Node<E> nuevo = new Node<E>(x);		// Creo mi Nodo 'nuevo' y usamos el 1er Constructor de la Clase Node
        if (this.isEmpty())			// Para validar si mi Cola esta VACÍA			
            this.front = nuevo;		// Si lo esta, El 'back' va a ser IGUAL al 'nuevo' y NO solo el 'back' sino tambien el 'front'   
        else						 
            this.back.setNext(nuevo);		// Si NO lo esta, el 'siguiente' del 'back' va a ser IGUAL al 'nuevo'
        this.back = nuevo;					// PERO como se tiene lo mismo en ambas Opciones, entonces mejor lo saco afuera				
    }
    
    public E dequeue() throws ExceptionIsEmpty{
        if (this.isEmpty())				// Para validar que mi Cola NO este Vacía
            throw  new ExceptionIsEmpty("Cannot remove from an empty queue...");	// Si NO fuera, lo que hago e
        E aux = this.front.getData();	// Si NO lo esta, voy a Guardar el Elemento para Devolverlo el Elemento que este en el '1ro'
        this.front = this.front.getNext();  // luego digo que mi nuevo 'front' va a ser IGUAL al 'siguiente' del 'front'
        System.out.println("El ELEMENTO QUE SE ESTA ELIMINANDO ES: " + aux.toString());
        if (this.front == null)			// Para saber que lo que estoy Eliminando es el Último Elemento que tenía 
            this.back = null;			// Si lo es, mi 'back' tambien tendrá que ponerse en NULO (por lo tanto, ya NO se tiene nada)
        return aux;						// Y sino, termina la Eliminación y retornamos el 'aux' que estamos Eliminando 
    }
	
    
    public boolean isEmpty() {
        return this.front == null; 
    }
    
    public E front() throws ExceptionIsEmpty {
        if (this.isEmpty())
            throw new ExceptionIsEmpty("Cola esta vacía... front");
        else
            return this.front.getData();
    }
    
    public E back() throws ExceptionIsEmpty {
        if (this.isEmpty())
            throw new ExceptionIsEmpty("Cola esta vacía... back");
        else
            return this.back.getData();
    }
    
    public String toString() {
        return "LinkedQueue [Primero en la Cola = " + this.front + ", Ultimo en la Cola = " + back + "]";
    }
    
    
}
