package ejemplos;

public class Clase_Character {

	public static void main(String[] args) {
		
		char a = '8';
		char b = 'c';
		char c = ' ';
		char d = '&';
		char e = '\t';
		
		
		System.out.println(Character.isDigit(b));
		System.out.println(Character.isLetterOrDigit(b));
		System.out.println(Character.isLetter(a));
		System.out.println(Character.isUpperCase(a));
		System.out.println(Character.isWhitespace(e));

	}

}
