package actividad1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hija hija1 = new Hija();
		hija1.contar();
		hija1.nombre("Manuel");
		System.out.println(hija1.getTexto());
		System.out.println("Edad del padre: "+hija1.getEdad());
		System.out.println(hija1.toString());
		/*Sobrecarga - overloading
		Tenemos dos métodos que se llaman igual pero
		con diferentes argumentos.
		
		Sobreescribir - overridee
		En la clase Hija tienes un método que se llama
		igual que en la clase Padre.
		*/
	}

}



