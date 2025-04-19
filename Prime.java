
public class Prime {
	public static void main(String ar[]) {
		int num = 6;
		
		if(num <= 1) 
			System.out.println("Not a Prime");
		for(int i = 2; i * i <=num;i++) {
			if(num % i == 0) {
			System.out.println("Not a prime");
			return;	
			}
		}

		System.out.println("Prime Number");
	}
}
