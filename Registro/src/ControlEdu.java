import javax.swing.JOptionPane;

public class ControlEdu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] prueba = new int[5];
		for( int x=0;x<5;x++) {
			prueba [x]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento "));
		} 

		
		for (int i=0;i<5;i++) {
			System.out.println (prueba[i]);}
		}

	}

