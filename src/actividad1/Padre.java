package actividad1;

public class Padre {

	private String texto = "Hola caracola de la clase Padre";
	private int edad = 45;
	private boolean casado = true;
	
	public Padre(String texto, int edad, boolean casado) {
		super();
		this.texto = texto;
		this.edad = edad;
		this.casado = casado;
	}
	
	public Padre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTexto() {
		return texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	
	//sobreescritura
	public void contar() {
		System.out.println("Contando desde la clase Padre");
	}

	@Override
	public String toString() {
		return "Padre [texto=" + texto + ", edad=" + edad + ", casado=" + casado + "]";
	}
	
	
}



