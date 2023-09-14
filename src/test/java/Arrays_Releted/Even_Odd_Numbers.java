package Arrays_Releted;

public class Even_Odd_Numbers {

	public static void main(String[] args) {


		int [] a= {1,2,3,4,5,6};

		//even numbers

		for(int i=0;i<a.length;i++) {

			if(a[i]%2==0) {

				System.out.println("Even Number " + a[i]);

			}

		}

		// Odd numbers

		for(int i=0;i<a.length;i++) {

			if(a[i]%2!=0) {

				System.out.println("Odd Number " + a[i]);

			}

		}
		
		for (int value : a) {
			
			if(value%2==0) {
				System.out.println(value);
			}
			
		}


	}

}
