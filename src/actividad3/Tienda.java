package actividad3;

public class Tienda {

	protected void tienda(int unidades, float precio, boolean descuento) {
		
		float total = 0;
		if (descuento) {
			total = (float) ((unidades*precio)-(unidades*precio*0.15));
		} else {
			total = unidades*precio;
		}
		System.out.println("Número de unidades: "+unidades+
				"\nPrecio del producto:"+precio+"\nEl total es "+total);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tienda principal = new Tienda();
		principal.tienda(5, 15, true);
		
	}

}


