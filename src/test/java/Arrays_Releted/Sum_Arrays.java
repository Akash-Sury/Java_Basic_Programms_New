package Arrays_Releted;

public class Sum_Arrays {
	
	public static void main(String[] args) {
		
		int [] a= {1,2,3,4,5};
		
		int sum=0;
		int sum1=0;
		
		for(int i=0;i<a.length;i++) {     // lenght is 5   but index starts from zero
			
			sum=sum+a[i];
			
			
		}
		
		System.out.println(sum);
		
		// 2  for Each loop
		
		for (int value : a) {
			
			sum1=sum1 + value;
			
		}
		System.out.println(sum);
		
		
	}

}
