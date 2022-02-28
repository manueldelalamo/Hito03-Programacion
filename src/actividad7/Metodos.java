package actividad7;

public class Metodos {

	String dia = null;
	double min = 0;
	double max = 0;
	
	public Metodos(String dia, double min, double max) {
		super();
		this.dia = dia;
		this.min = min;
		this.max = max;
	}

	@Override
	public String toString() {
		return "Metodos [dia=" + dia + ", min=" + min + ", max=" + max + "]";
	}
	
	
}


