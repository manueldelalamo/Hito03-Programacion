package actividad2;

public class Principal implements Iparametros {

	@Override
	public void escribir() {
		// TODO Auto-generated method stub
		System.out.println("Estoy escribiendo");
	}

	@Override
	public void cantar(String cancion) {
		// TODO Auto-generated method stub
		System.out.println("Estoy cantando la canción "+cancion);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal prueba = new Principal();
		prueba.escribir();
		prueba.cantar("Circles");
	}

}



