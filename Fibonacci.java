
public class Fibonacci {
	public static void main(String ar[]) {
	
	int series = 10;
	int a = 0,b = 1;
	for (int i = 0;i<10;i++) {
		System.out.print(a + " ");
		int temp = a + b;
		a = b;
		b = temp;
	}
	}
}
