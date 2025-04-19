


public class Reversing {

	static void reverseString(String text) {
		System.out.println("Before reversing: " + text);
		String reversed = "";
		for (int i = text.length() - 1; i >= 0; i-- ) {
			reversed += text.charAt(i);
		}

		System.out.println("After reverse: " + reversed);

	}

	static void reverseNumber(int num) {
	
		int reversed =0;
		System.out.println("Before reverse: " + num);
		while(num != 0) {
			
			int rem = num % 10;
			reversed = reversed * 10 + rem;
			num /= 10;

		}
		System.out.println("After reverse: " + reversed);
	}

	public static void main(String ar[]) {
	
	reverseString("hello");
	reverseNumber(345);
	}
}
