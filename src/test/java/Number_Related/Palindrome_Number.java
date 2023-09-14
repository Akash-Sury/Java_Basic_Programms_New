package Number_Related;

public class Palindrome_Number {

	public static void main(String[] args) {
		
		int no=12321;
		
		int rev =0;
		
		while(no!=0) {
			
			rev= rev*10+no%10;
			no=no/10;
			
			
		}
		System.out.println(rev);
		
		if(no==rev) {
			System.out.println("The no is palindrome");
			
		}else
		{
			System.out.println("No not palindrome number");
			
		}
		

	}

}
