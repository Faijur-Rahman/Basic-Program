import java.util.Scanner;

public class Palindrome{
	public static void main(String ar[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Word to check: ");
		String original = sc.next();
	
		String reversed ="";

		for(int i = original.length() - 1;i >=0;i--) {
			
			reversed += original.charAt(i); 
			
		}

		System.out.println(reversed);

		if(original.equals(reversed))
			System.out.println("its palindrome");
		else 
			System.out.println("Not a palindrome");		



	}
}
