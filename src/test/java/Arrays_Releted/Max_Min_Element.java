package Arrays_Releted;

public class Max_Min_Element {

	public static void main(String[] args) {

		int [] a= {1,2,3,4,5};

		int max=a[0];

		for(int i=1;i<a.length;i++) {

			if(a[i]>max) {

				max=a[i];
			}

		}
		System.out.println(max);


		int min=a[0];

		for(int i=1;i<a.length;i++) {

			if(a[i]<min) {

				min=a[i];
			}

		}
		System.out.println(min);



	}

}
