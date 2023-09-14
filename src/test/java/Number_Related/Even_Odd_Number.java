package Number_Related;

public class Even_Odd_Number {

	public static void main(String[] args) {

		int no=12345;

		int even_count=0;
		int odd_count=0;
		
		while(no>0) {
			
			int rem=no%10;    //5
			
			if(rem%2==0) {
				
				even_count++;
				
			}
			else
			{
				
				odd_count++;
			}
			no=no/10;
			
			
		}
System.out.println(even_count);
System.out.println(odd_count);

	}

}
