package EstructuraDatos.BST;
import Clases.Alumno;
import Clases.NotasMensuales;
import Vista.Notas;
import java.util.*;

public class BST<E> implements Comparable<BST>{
	public Alumno data;
	public BST<E> left;
	public BST<E> right;
	public BST<E> root;
	public int leafNodes = 0;
        ArrayList<Alumno> respuesta = new ArrayList<Alumno>();
        
	
	public BST(Alumno data) {
            this.data = data;
            this.left = null;
            this.right = null;
	}
	public BST(Alumno data, BST<E> left, BST<E> right) {
            this.data = data;
            this.left = left;
            this.right = right;
	}
	public BST() {
		this.root = null;
	}
	
	public Alumno getData() {
		return data;
	}
	public void setData(Alumno data) {
		this.data = data;
	}
	public BST<E> getLeft() {
		return left;
	}
	public void setLeft(BST<E> left) {
		this.left = left;
	}
	public BST<E> getRight() {
		return right;
	}
	public void setRight(BST<E> right) {
		this.right = right;
	}
	public BST<E> getRoot() {
		return root;
	}
	public void setRoot(BST<E> root) {
		this.root = root;
	}
	
	public boolean isEmpty() {
		return this.root == null;
	}
	public void insert (Alumno x) {
		this.root = insertRec(x, this.root);
	}
	public BST<E> insertRec(Alumno x, BST<E> actual) {
		BST<E> res = actual;
		if (actual == null) {
			res = new BST<E>(x);
		} else {
			int resC = actual.data.getDNI().compareTo(x.getDNI());
			if (resC == 0) {
				System.out.println("El dato ya fue insertado antes");
			} else if (resC < 0) {
				res.right = insertRec(x, actual.right);
			} else {
				res.left = insertRec(x, actual.left);
			}
		}
		return res;
	}
	
	public BST<E> searchDNI(int dni) {
		BST<E> resp = searchRec(dni, this.root);
		if (resp == null) {
			System.out.println("El dato " + dni + " NO se encuentra...");
		}
		return resp;
	}
	// Devuelve la Referencia de 1 Nodo o 1 Nulo
	private BST<E> searchRec(int dni, BST actual) {
		BST res = actual;
		if (actual == null)
			return null;
		else {
			int resC = actual.data.getDNI().compareTo(dni);
			if (resC < 0)
				return searchRec(dni, res.right);
			else if (resC > 0)
				return searchRec(dni, res.left);
			else 
				return res;
		}
	}
	
	public void remove(Alumno x) {
		this.root = removeRec(x, this.root);
	}
	private BST<E> removeRec(Alumno x, BST actual) {
		BST<E> res = actual;
		if (actual == null)
			System.out.println("El dato " + x + " NO se encuentra...");
		else {
			int resC = actual.data.getDNI().compareTo(x.getDNI());
			if (resC < 0)
				res.right = removeRec(x, actual.right);
			else if (resC > 0)
				res.left = removeRec(x, actual.left);
			else {
				if (actual.left != null && actual.right != null) {	// Caso 3: El actual tiene 2 Hijos
					System.out.println("Caso 3: ");
					// Se busca el Menor del Lado Derecho (osea el SUCESOR EN INORDEN)
					res.data = minRecover(actual.right).data;		// Me devuelve el Nodo que tiene el "Sucesor en InOrden" y de ese Nodo saco su 'data' que es justamente el que va a REEMPLAZAR al Nodo que quiero ELIMINAR
					res.right = minRemove(actual.right);			// Luego, Elimino ese MENOR de mi Lado Derecho (Ese MENOR podr�a tener '1 Hijo Derecho' q NO necesariamente puede ser 1 Hoja)
					// Por lo tanto: me Devuelve, en caso Tenga o No Tenga: El Hijo Derecho q tenga. (Si es NULO: Devuelve 1 "Nulo" / Si lo tiene: Devuelve la Referencia de ese Hijo Derecho) y ese Hijo Derecho se va a Convertir en 'HIJO' de mi 'PADRE' por el Lado Derecho)
					// "res.right" entonces es el "ABUELO" que lo esta ADOPTANDO al "NIETO" q tu me Devuelves, en caso EXISTA
				}
				else {												// Caso 1 (Ninguno) y Caso 2 (1 Hijo)
					System.out.println("Caso 1 o Caso 2: ");
					res = (actual.left != null) ? actual.left : actual.right;	// Verifica si se tiene 1 HIJO IZQUIERDO (Si es diferente de Nulo su Hijo Izquierdo, entonces el Padre va a ser IGUAL a ese Hijo Izquierdo
				}																// Y si NO es 1 Hijo Izquierdo, y estoy en 1 HIJO: entonces necesariamente tiene q ser el DERECHO (donde el Derecho va a ser IGUAL al Hijo de mi Padre)
				// Si NO tuviera NINGUN HIJO (�sea es HOJA): Si lo es, el Izquierdo es NULO (por lo tanto es 'false') y por lo tanto el Derecho tambien es NULO: por lo tanto el Padre va a tener 1 NULO
			}
		}
		return res;		// ese Padre se Convierte en HIJO, ya q voy a Devolverlo en 1 Punto donde la RECURSIVIDAD haya Descendido (ahora me Retorne, devuelvo a 1 Nivel Superior: entonces ese Padre ahora se Convierte en 1 HIJO de 1 NUEVO PADRE (ya sea por la Derecha o por la Izquierda)	
	}
        
        public void preOrden() {
		if (this.isEmpty())
                    System.out.println("Arbol esta Vacio...");
		else
                    preOrden(this.root);
	}
	private void preOrden(BST actual) {
		System.out.println(actual.data);	//	RAIZ
		if(actual.left != null)
                    preOrden(actual.left);						//	IZQUIERDA
		if(actual.right != null)
                    preOrden(actual.right);						//	DERECHA		
	}
        public ArrayList<Alumno> recorrer() {
            if (this.isEmpty())
                System.out.println("Arbol esta Vacio...");
            else
                recorrer(this.root);
            return respuesta;
	}
	private ArrayList<Alumno> recorrer(BST actual) {
            String primerApellido = actual.data.getPrimerApellido();
            //System.out.println(primerApellido);
            
            //Notas.tabla.addRow(new Object[]{primerApellido + " " + segundoApellido + ", " + nombreCompleto, "", "", "", "", ""});
            //Notas.tabla.addRow(new Object[]{primerApellido});
            //Notas.tabla.addRow(new Object[]{"1", "", "", ""});
            
            respuesta.add(actual.data);
            
            if(actual.left != null)
                recorrer(actual.left);						//	IZQUIERDA
            if(actual.right != null)
                recorrer(actual.right);						//	DERECHA		
            if (actual.left == null && actual.right == null) {
                //System.out.println(respuesta);
                return respuesta;
            }
            //System.out.println(respuesta);
            return null;
	}
	
	private BST<E> minRecover(BST<E> actual) {
		while (actual != null && actual.left != null)
			actual = actual.left;
		return (actual != null ? actual : null);
	
	}
	// M�todo para Hallar el Elemento Menor del Lado Derecho del Arbol y Eliminarlo
	private BST<E> minRemove(BST actual) {
		if (actual.left != null) {					// Se Busca el M�nimo
			actual.left = minRemove(actual.left);
		}
		else {										// Se Elimina el M�nimo
			actual = actual.right;					// Devuelve su Hijo Derecho Y si NO existe, Devuelve el NULO 
		}
		return actual;		
	}

	public int heightTree() {
		int h = heightRec(this.root);
		return h;
	}

	protected int heightRec(BST actual) {
		if (actual == null) {
			return -1;
		}
		else {
			int alt1 = heightRec(actual.left);
			int alt2 = heightRec(actual.right);
			if (alt1 > alt2) {
				return (alt1 + 1);
			}
			else {
				return (alt2 + 1);
			}
		}
	}
	
	public int numberLeafNodes() {
		leafNodes = numberLeafNodesRec(this.root);
		return leafNodes;

	}
	protected int numberLeafNodesRec(BST actual) {
		if (actual != null) {
			if(actual.left == null && actual.right == null)
				leafNodes++;
			numberLeafNodesRec(actual.right);
			numberLeafNodesRec(actual.left);
		}
		return leafNodes;
	}
	
	public int areaBT() {
		return numberLeafNodes() * heightTree();
	}
	
	@Override
	public int compareTo(BST b) {
		return this.areaBT() - b.areaBT();
	}
	public void addTable(){
            recorrer();
        }
}

