


public class Reversing {

	static void reverseString(String text) {
	
		String reversed = "";
		for (int i = text.length() - 1; i >= 0; i-- ) {
			reversed += text.charAt(i);
		}

		System.out.println(reversed);

	}

	public static void main(String ar[]) {
	
	reverseString("hello");

	}
}
