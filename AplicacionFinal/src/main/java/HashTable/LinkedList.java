/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTable;
import EstructuraDatos.ListLinked.Node;

public class LinkedList<T extends Comparable<T>>  {
    int count ;
    Node<T> first;
    
    public LinkedList(){
        first = new Node<T>(null,null);
        count=0;
    } 
    
    public void initializeList(){
        first = new Node<T>(null,null);
        count=0;
    }
    
    public String search(T searchItem){
        Node<T> aux=first.getNext();
        while (aux!=null && aux.getData().compareTo(searchItem) != 0 ) {
            aux=aux.getNext();
        }
        if (aux!=null && aux.getData().compareTo(searchItem) == 0)
            return aux.getData().toString();
        return null;
    }

    public void insert(T newItem){
        if (search(newItem)==null) {
            Node<T> aux=first;
            while (aux.getNext()!=null && aux.getNext().getData().compareTo(newItem)<0) {
                aux=aux.getNext();
            }
            Node<T> au = new Node<T>(newItem,aux.getNext());
            aux.setNext(au);
            count++;
        }
    }

    public void deleteNode(T deleteItem) {
        if(!isEmpty()) {
            Node<T> aux=first;
            while (aux.getNext() != null && aux.getNext().getData().compareTo(deleteItem) != 0) {
                aux=aux.getNext();
            }
            if (aux.getNext() != null && aux.getNext().getData().compareTo(deleteItem)==0) {
                Node<T> au=aux.getNext().getNext();
                aux.setNext(au);
                count--;
            }
        }
    }
    
    public boolean isEmpty(){
        return (first.getNext() == null);
    }
    
    public String toString() {
        String cadena="";
        Node<T> aux=first.getNext();
        while(aux != null ) {
            cadena += (aux.getData()+", ");
            aux = aux.getNext();
        }
        return cadena;
    }
}
