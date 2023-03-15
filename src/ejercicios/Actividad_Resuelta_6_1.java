package ejercicios;

public class Actividad_Resuelta_6_1 {

	public static void main(String[] args) {
		
		//Bucle que muestra los codigos unicode desde 0x0000 a 0xFFFF
		
		
		
		for (int codePoint=0x0000; codePoint<=0xFFFFF; codePoint++){
			
			String codigo = Integer.toHexString(codePoint);
			System.out.println("\\u"+codigo+": "+(char) codePoint);
			
			
		}
		

	}

}
