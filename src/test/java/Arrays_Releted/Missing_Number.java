package Arrays_Releted;

public class Missing_Number {
	
	public static void main(String[] args) {
		
		
		//should not have duplicate
		//should be in range
		
		int  [] a= {1,2,3,5};
		
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			sum = sum +a[i];
			
			
		}
		System.out.println("Sum of elelemnts in arryas "+sum);
		
		int sum1=0;
		
		for(int j=1;j<=5;j++) {
			
			sum1= sum1+j;
			
		}
		System.out.println(sum1 +" Sum of all elelemnts in arrays");
		
		System.out.println("Missing no is "+ (sum1-sum));
	}

}
