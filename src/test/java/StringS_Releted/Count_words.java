package StringS_Releted;

public class Count_words {

	public static void main(String[] args) {
		
		String s= "Java is good Language";
		
		int count=0;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			
			if((s.charAt(i)==' ') &&(s.charAt(i+1)!=' '))
			{
				count++;
				
			}
			
		}
		System.out.println(count);
	}

}
