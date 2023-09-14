package StringS_Releted;

public class Duplicate_Charcter {

	public static void main(String[] args) {

		String s="m##aheshbabu@####";

		String rep=s.replaceAll("[^0-9A-Za-z]", "");
		
		System.out.println(rep);



	}

}
