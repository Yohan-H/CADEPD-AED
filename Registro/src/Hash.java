import java.util.ArrayList;


	public class Hash {
		int longS=1;
		int prueba=0;
		ArrayList<Empleado> tabla;
		ArrayList<LinkedList<Empleado>> ListEmpleado;
		int m;
		boolean tipo;
		public Hash(int a,boolean tipo) {
			this.tipo=tipo;
			inicializador(a, tipo);
			/*this.m=a;
			this.tabla=new ArrayList<Empleado>(m);
			for (int i=0; i<m; i++) {
				this.tabla.add(new Empleado(0, null));
				
			}*/
		}
		
		public void insert(String nombre,int codigo) {
			if (tipo==true) insertarConCuadratica(nombre, codigo);
			else insertLL(nombre, codigo);	
			prueba=longS;
			
		}
		public void remove(int codigo) {
			if (tipo==true) removeTrue(codigo);
			else removeLL(codigo);
		}
		public void search(int codigo) {
			if (tipo==true) searchTrue(codigo);
			else searchLL(codigo);
		}

		private void searchLL(int codigo) {
			int f=funcionHash(codigo);
			String algo=ListEmpleado.get(f).search(new Empleado(codigo,""));
			if (algo!=null) System.out.println(algo+" Se encuentra en la posicion "+f);
			else System.out.println(algo+" NO EXISTE ");
		}
		//serchTrue hash cerrado direccAbierto
		private void searchTrue(int codigo) {
			
			int f=cuadratica(funcionHash(codigo),codigo, false);
			if (f!=-1) System.out.println(tabla.get(f).nombre +" "+codigo+" Se encuentra en la posicion "+f);
			else System.out.println(codigo+" NO EXISTE ");
		}
		private void removeLL(int codigo) {
			int f=funcionHash(codigo);
			ListEmpleado.get(f).deleteNode(new Empleado(codigo," " ));
		}
		private void removeTrue(int codigo) {
			int f=cuadratica(funcionHash(codigo),codigo, false);
			if (f!=-1) tabla.set(f, null);
		}
		private void insertLL(String nombre,int codigo) {
			int f=funcionHash(codigo);
			ListEmpleado.get(f).inser(new Empleado(codigo,nombre));

			System.out.println(ListEmpleado.get(f));}
		
		private int cuadratica(int pos,int ele,boolean f) {
			
			int inicial=pos,con=1;
			do {
				if (tabla.get(pos)!=null &&tabla.get(pos).codigo==ele) {
					if (f)return -1;
					else return pos;
				}
				if (f==true && tabla.get(pos)==null) {
					return pos;
				}
				else {
					pos=(pos+(con*con))%m;
					con++;
					longS=con;
				}
			}while(inicial!=pos);
			return -1;
		}
		
		private void insertarConCuadratica(String nombre,int codigo) {
			int indice=cuadratica(funcionHash(codigo), codigo,true);
			if (indice==-1) {
				System.out.println("Ya existe o esta lleno");
			}
			else {
				tabla.set(indice, new Empleado(codigo,nombre));
			}
		}
		private int funcionHash(int e) {
			return e %m;
		}
		private void inicializador(int a,boolean tipo) {
			if (tipo==true) {
				m=nuevoM(a);			
			tabla=new ArrayList<Empleado>(m);
			for (int i=0;i<m;i++) {
				tabla.add(0,null);
			}}
			else {
				m=a;
				ListEmpleado=new ArrayList<LinkedList<Empleado>>(m);
				for (int i=0;i<m;i++) {
					ListEmpleado.add(new LinkedList<Empleado>());
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
			if (tipo) return toST();
		
			return toSLL();
	}
		public String toST() {
			String cadena="D.REAL\t D.HASH\t Codigo\t Nombre\t Longitut Busqueda\n";
			for (int i=0;i<tabla.size();i++) {
				cadena +=i+"-->\t";
				if (tabla.get(i)==null)cadena+="empty\t empty\t empty";
				else cadena+=funcionHash(tabla.get(i).codigo)+"\t "+tabla.get(i).codigo+"\t "+tabla.get(i).nombre +"\t"+ prueba;
				cadena+="\n";
			}
			return cadena;
		}
		public String toSLL() {
			String cadena="D.REAL\t Elementos\n";
			for (int i=0;i<ListEmpleado.size();i++) {
				cadena +=i+"-->\t";
				if (ListEmpleado.get(i).isEmpty())cadena+="\tempty";
				else cadena+=ListEmpleado.get(i).toString();
				cadena+="\n";
			}
			return cadena;
		}

	}
