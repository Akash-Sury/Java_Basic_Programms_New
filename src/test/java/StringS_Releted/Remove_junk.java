package StringS_Releted;

public class Remove_junk {
	
	public static void main(String[] args) {
		
		String s="@Ak%%%%as!!!!!H";
		
		String rep=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(rep);
		
		
		
		
		
		
		
	}

}
