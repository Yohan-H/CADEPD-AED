import java.util.*;



public class Menu {
	
	static Scanner sc = new Scanner(System.in);
	
	//	Hecho por: Adrian Valencia
	public static void main(String[] args) {
		boolean salir = false; 
		while (!salir){
			int opcion = menuPrinicipal();
			switch(opcion) {
				case 1:
					print("\n\n\n\n\n\n");
					boolean retroceder1 = false;
					while (!retroceder1) {
						opcion = menuEstudiantes();
						switch(opcion) {
							case 1:
								print("Matricular");
								break;
							case 2:
								print("Buscar");
								break;
							case 3:
								print("Eliminar");
								break;
							case 4:
								print("Modificar");
								break;
							case 0:
								print("Retroceder");
								retroceder1 = true;
						}
					}
					break;
				case 2:
					print("\n\n\n\n\n\n");
					boolean retroceder2 = false;
					while (!retroceder2) {
						opcion = menuNotas();
						switch(opcion) {
							case 1:
								print("Ingresar");
								break;
							case 2:
								print("Mostrar");
								break;
							case 3:
								print("Modificar");
								break;
							case 0:
								print("Retroceder");
								retroceder2 = true;
						}
					}
					break;
				case 3:
					print("\n\n\n\n\n\n");
					boolean retroceder3 = false;
					while (!retroceder3) {
						opcion = menuAsistencia();
						switch(opcion) {
							case 1:
								print("Ingresar");
								break;
							case 2:
								print("Mostrar");
								break;
							case 3:
								print("Modificar");
								break;
							case 0:
								print("Retroceder");
								retroceder3 = true;
						}
					}
					break;
				case 4:
					print("\n\n\n\n\n\n");
					boolean retroceder4 = false;
					while (!retroceder4) {
						opcion = menuProfesor();
						switch(opcion) {
							case 1:
								print("Mostrar");
								break;
							case 2:
								print("Modificar");
								break;
							case 0:
								print("Retroceder");
								retroceder4 = true;
						}
					}
					break;
				case 0:
					print("\n\n\n\n\n\n");
					print("Salir");
					salir = true;
			}
			
		}
	}
	
	public static void print(Object x) {
		System.out.println(x);
	}

	//	Hecho por: Yohan Hilpa Perez
	public static int menuPrinicipal() {
		
		print("MENÚ");
		print("Seleccione el módulo");
		print("1. Módulo Estudiantes");
		print("2. Módulo Notas");
		print("3. Módulo Asistencia");
		print("4. Módulo Profesor");
		System.out.println();
		print("0. Salir");
		
		int opcion = sc.nextInt();
		return opcion;
	}

	//	Hecho por: Cristhian Pumacayo
	public static int menuEstudiantes() {
		
		print("MÓDULO ESTUDIANTES");
		print("Seleccione la operación");
		print("1. Matricular");
		print("2. Buscar");
		print("3. Eliminar");
		print("4. Modificar");
		System.out.println();
		print("0. Retroceder");
		
		int opcion = sc.nextInt();
		return opcion;
	}

	//	Hecho por: Adrian Valencia
	public static int menuNotas() {
		
		print("MÓDULO NOTAS");
		print("Seleccione la operación");
		print("1. Ingresar");
		print("2. Mostrar");
		print("3. Modificar");
		System.out.println();
		print("0. Retroceder");
		
		int opcion = sc.nextInt();
		return opcion;
	}

	//	Hecho por: Yohan Hilpa
	public static int menuAsistencia() {
		
		print("MÓDULO ASISTENCIA");
		print("Seleccione la operación");
		print("1. Ingresar");
		print("2. Mostrar");
		print("3. Modificar");
		System.out.println();
		print("0. Retroceder");
		
		int opcion = sc.nextInt();
		return opcion;
	}


	//	Hecho por: Betsy Vargas
	public static int menuProfesor() {
		Scanner sc = new Scanner(System.in);
		
		print("MÓDULO PROFESOR");
		print("Seleccione la operación");
		print("1. Mostrar");
		print("2. Modificar");
		System.out.println();
		print("0. Retroceder");
		
		int opcion = sc.nextInt();
		return opcion;
	}
}

