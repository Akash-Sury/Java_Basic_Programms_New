package StringS_Releted;

public class Palindrome_String {

	public static void main(String[] args) {
		
		String s= "AkakA";
		
		String rev="";
		char [] c =s.toCharArray();
		int len =c.length;
		
		for(int i=len-1;i>=0;i--) {
			
			rev= rev+c[i];
			
		}
		System.out.println(rev);
		if(s.equals(rev)) {
			
			System.out.println("String is palindrome");
			
		}
		else
		{
			
			System.out.println("String is not palindrome");
		}

	}

}
