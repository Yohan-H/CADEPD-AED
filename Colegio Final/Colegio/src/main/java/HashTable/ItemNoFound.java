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
public class ItemNoFound extends Exception {
    public ItemNoFound(String msg) {
        super(msg);
    }
    
    // Para mostrar 1 mensaje cuando NO SE ENCUENTRE el ITEM (en la Busqueda y en la Eliminación)
    public ItemNoFound() {
        super();			
    }

}
