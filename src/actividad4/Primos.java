package actividad4;

import javax.swing.JOptionPane;

public class Primos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object panel = JOptionPane.showInputDialog(null, "Dime un n�mero");
		String numero = (String) panel;
		int valor = Integer.parseInt(numero);
		for (int i = 2; i < valor; i++) {
			boolean primo=true;
			for (int j = 2; j < (i-1); j++) {
				if (i%j==0) {
					primo=false;
					break;
				}
			}
			if (primo==true) {
				JOptionPane.showMessageDialog(null, i);
			}
		}
	}
}



