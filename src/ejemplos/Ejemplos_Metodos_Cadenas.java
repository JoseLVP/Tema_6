package ejemplos;

public class Ejemplos_Metodos_Cadenas {

	public static void main(String[] args) {
		
		String Cadena1 = " hola mundo ";
		String Cadena2 = " HOLA MUNDO ";
		String Cadena3 = " ! QUE BIEN, POR FIN ES VIERNES ";
		String Cadena4 = " Es una Prueba ";
		String Cadena5 = " ";
		
		char letra=Cadena1.charAt(2);
		
		System.out.println("Metodo EQUALS ->\t " +Cadena1.equals(Cadena2));
			//EQUALS -> Compara 2 cadenas de caracteres para comprobar que son similares
		
		System.out.println("Metodo EQUALS ->\t " +Cadena1.equalsIgnoreCase(Cadena2));
			//EQUALS V2 -> Similar al anterior, pero en este caso, no discrimina entre mayusculas y minusculas
		
		System.out.println("Metodo CHARAT ->\t " +letra);
			//CHARAT -> Indica la letra ubicada en la cadena en funcion del valor que le indiquemos
		
		System.out.println("Metodo CONCAT ->\t" +Cadena2.concat(Cadena3));
			//CONCAT -> Une 2 cadenas de caracteres, similar al uso del "+" al imprimir datos
		
		System.out.println("Metodo STARTSWITCH ->\t "+Cadena2.startsWith("HOL"));
			//STARTSWITCH -> Verifica que el comienzo de la cadena es similar al valor indicado
		
		System.out.println("Metodo ENDSWITCH ->\t " +Cadena2.endsWith("NDO"));
			//ENDSWITCH -> Verifica que el final de la cadena es similar al valor indicado
		
		System.out.println("Metodo STRIP ->    \t " +Cadena4.strip());
			//STRIP -> Elimina los espacios vacion, tanto al principio como al final
		
		System.out.println("Metodo STRIPLEADING -> \t " +Cadena4.stripLeading());
			//STRIPLEADING -> Elimina los espacios vacios del comienzo de la Cadena
		
		System.out.println("Metodo STRIPTRAILING -> " +Cadena4.stripTrailing());
			//STRIPTRAILING -> Elimina los espacios vacios del vacio de la Cadena
		
		System.out.println("Metodo LENGTH -> \t " +Cadena2.length());
			//LENGTH -> Comprueba la longitud de la Cadena
		
		System.out.println("Metodo SUBSTRINGN -> \t" +Cadena2.substring(0));
			//SUBSTRINGN -> Obtiene una subcadena solo indicando el inicio
		
		System.out.println("Metodo SUBSTRINGN -> \t" +Cadena2.substring(5, 9));
			//SUBSTRINGN -> Obtiene una subcadena solo indicando el inicio y el final
 
		System.out.println("Metodo IsEMPTY ->  \t " +Cadena2.isEmpty());
			//isEmpty -> TRUE solo si la cadena esta Vacia completamente
		
		System.out.println("Metodo IsBLANK ->  \t " +Cadena5.isBlank());
			//IsBlank -> TRUE Solo si el espacio es 0
	}

}
