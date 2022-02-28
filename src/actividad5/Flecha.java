package actividad5;

import java.util.Arrays;

public class Flecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Long TiempoInicio, TiempoFin, tiempo;
		TiempoInicio = System.currentTimeMillis();
		
		int[] numeros = {4,7,1,9,5,2,8,6,3};
		
		int tradicional = 0;
		int funcion = 0;
		
		//Utilizando un m�todo tradicional (for)
		for (int i = 0; i < numeros.length; i++) {
			tradicional += numeros[i];
		}
		
		TiempoFin = System.currentTimeMillis();
		tiempo = TiempoFin - TiempoInicio;
		System.out.println("Tiempo de ejecuci�n del m�todo tradicional: " + tiempo);
		
		
		Long TiempoInicio1, TiempoFin1, tiempo1;
		TiempoInicio1 = System.currentTimeMillis();
		
		//Utilizando una funci�n
		funcion = Arrays.stream(numeros).sum();
		
		TiempoFin1 = System.currentTimeMillis();
		tiempo1 = TiempoFin1 - TiempoInicio1;
		System.out.println("Tiempo de ejecuci�n con una funci�n: " + tiempo1);
		
	}

}




