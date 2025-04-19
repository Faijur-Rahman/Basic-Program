

public class Swap {
	public static void main(String ar[]) {
		int a = 10,b = 20;
		
		System.out.println("Before Swapping a: " + a + " b: " + b );

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Swap number a: " + a + " b: " + b);
	}
}
