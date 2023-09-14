package Number_Related;

public class Sum_Digits {

	public static void main(String[] args) {
		
		int no=12345;
		
		int sum=0;
		
		while(no>0) {
			
			
		sum=sum + no%10;   // 5 + 4 +3 + 2 +1
		no=no/10;  // 1234  123  12  1  0
			
		}
		
System.out.println(sum);
	}

}
