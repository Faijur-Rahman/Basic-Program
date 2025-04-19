

public class SumOfDigits {
	public static void main(String ar[]) {
	
		int num = 453;
		int sum = 0;
		while (num != 0) {
		
			int rem = num % 10;
			sum += rem;

			num /= 10;
		}	

		System.out.println(sum);

	}
}
