/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTable;

/**
 *
 * @author Adrian
 */
public class ExceptionIsEmpty extends Exception {
    public ExceptionIsEmpty(String msg) {
        super(msg);
    }
    
    // invoca al Constructor de la Clase Base
    public ExceptionIsEmpty() {
        super();
    }
}
