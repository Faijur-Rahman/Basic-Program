

public class Armstrong {
	public static void main(String ar[]) {

	int num = 407;
	int sum = 0; 
	int original = num;
	while(num != 0){
		int rem = num % 10;
		num = num / 10;
		sum += rem * rem * rem;	
		
	}

	System.out.println(sum);

	if (original == sum) {
		System.out.println("Armstrong");
	}
	else {
		System.out.println("Not a Armstrong");
	}

	}
}
