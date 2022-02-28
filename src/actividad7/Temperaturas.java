package actividad7;

public class Temperaturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] dias = {"Lunes","Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
		
		for (int i = 0; i < dias.length; i++) {
			Metodos dia = new Metodos(dias[i],Math.round((long) (Math.random() * 10)),Math.round((long) (Math.random() * 20+10)));
			System.out.println(dia.toString());
		}
		
	}

}



