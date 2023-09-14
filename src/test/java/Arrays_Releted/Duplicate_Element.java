package Arrays_Releted;

public class Duplicate_Element {

	public static void main(String[] args) {
		
		String [] a= {"Akash","Anil","Akash","Kapil","Vikas"};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j] ){
					
					System.out.println("Duplicate element is " + a[i]);
					
				}
				
			}
			
		}
		
		

	}

}
