package Number_Related;

public class Reverse_Number {

	public static void main(String[] args) {


		int no=12345;
		int rev =0;


		while(no!=0) {

			rev=rev*10 + no%10;  // 0+12345%10=5
			no=no/10;     // 12345/10=1234

		}
		System.out.println(rev);

	}


}
