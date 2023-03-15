package ejemplos;

import java.util.Scanner;

public class Conversion_Entre_Caracteres {

	public static void main(String[] args) {

		char Letra1 = 'a', Letra2;

		Letra2 = Character.toUpperCase(Letra1); // LowerCase para convertirla en Minuscula

		System.out.println("Letra Original -> " + Letra1);
		System.out.println("Letra Convertida -> " + Letra2);

		// Aunque declaremos el valor en Mayuscula/Minuscula, podemos convertirlo con
		// esta funcion, en caso de que nos haga falta

		String cadena1 = "hola mundo";
		String cadena2 = "HOLA MUNDO";

		System.out.println(cadena1.equals(cadena2)); // False
		System.out.println(cadena1.equalsIgnoreCase(cadena2)); // True

		// Normalmente si distingue entre mayusculas y minusculas, salvo si usamos el
		// Ignore Case

		System.out.println(cambio(cadena1));
		
		char letra=cadena1.charAt(5);
		System.out.println(letra);
	}

	static String cambio(String Palabra) {
		
		String Conversion="Adios";
		return Conversion;
		
	
		
	}
	
}
