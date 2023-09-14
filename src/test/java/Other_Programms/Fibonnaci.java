package Other_Programms;

public class Fibonnaci {
	
	public static void main(String[] args) {
		
		int a=0,b=1;
		int c=0;
		
		//System.out.println(a+" "+b);
		
		for(int i=0;i<=10;i++) {
			
			c =a+b;
			a=b;
			b=c;
			
			System.out.println(c);
			
		}
		
		
		
	}

}
