package EstructuraDatos.BST;
import Clases.Alumno;
import Vista.Notas;
import java.util.*;

public class BST implements Comparable<BST>{
	public Alumno data;
	public BST left;
	public BST right;
	public BST root;
	public int leafNodes = 0;
        ArrayList<Alumno> respuesta = new ArrayList<Alumno>();
	
	public BST(Alumno data) {
            this.data = data;
            this.left = null;
            this.right = null;
	}
	public BST(Alumno data, BST left, BST right) {
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
	public BST getLeft() {
		return left;
	}
	public void setLeft(BST left) {
		this.left = left;
	}
	public BST getRight() {
		return right;
	}
	public void setRight(BST right) {
		this.right = right;
	}
	public BST getRoot() {
		return root;
	}
	public void setRoot(BST root) {
		this.root = root;
	}
	
	public boolean isEmpty() {
		return this.root == null;
	}
	public void insert (Alumno x) {
		this.root = insertRec(x, this.root);
	}
	public BST insertRec(Alumno x, BST actual) {
		BST res = actual;
		if (actual == null) {
			res = new BST(x);
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
	
	public BST searchDNI(int dni) {
		BST resp = searchRec(dni, this.root);
		if (resp == null) {
			System.out.println("El dato " + dni + " NO se encuentra...");
		}
		return resp;
	}
	
	private BST searchRec(int dni, BST actual) {
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
	private BST removeRec(Alumno x, BST actual) {
		BST res = actual;
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
					res.data = minRecover(actual.right).data;	
					res.right = minRemove(actual.right);		
					
				}
				else {												// Caso 1 (Ninguno) y Caso 2 (1 Hijo)
					System.out.println("Caso 1 o Caso 2: ");
					res = (actual.left != null) ? actual.left : actual.right;	
				}															
				
			}
		}
		return res;			
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
	
	private BST minRecover(BST actual) {
		while (actual != null && actual.left != null)
			actual = actual.left;
		return (actual != null ? actual : null);
	
	}

	private BST minRemove(BST actual) {
		if (actual.left != null) {					
			actual.left = minRemove(actual.left);
		}
		else {										
			actual = actual.right;					 
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

