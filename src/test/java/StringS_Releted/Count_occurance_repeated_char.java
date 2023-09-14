package StringS_Releted;

public class Count_occurance_repeated_char {
	
	public static void main(String[] args) {
		
		String s="Java is good Java";
		
		int total =s.length();  // Total lenght
		
		int removedCount =s.replace("a", "").length();  //length after removing a
		
		int count =total-removedCount;
		System.out.println(count);
		
		
		
		
		
		
		
	}

}
