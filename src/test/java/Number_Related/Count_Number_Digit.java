package Number_Related;

public class Count_Number_Digit {
	
	public static void main(String[] args) {
		
		int no =123456;
		
		int count =0;
		
		while(no>0) {
			
			no=no/10;
			count++;
			
		}
		
		System.out.println("No of digit"  + count);
		
	}

}
