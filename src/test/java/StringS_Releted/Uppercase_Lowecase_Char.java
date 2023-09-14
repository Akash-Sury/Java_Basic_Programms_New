package StringS_Releted;

public class Uppercase_Lowecase_Char {

	public static void main(String[] args) {
		String s= "AkasH";

		int uppercase=0;
		int lowecase=0;

		for(int i=0;i<s.length();i++) {

			char ch=s.charAt(i);

			if(Character.isUpperCase(ch)) {

				uppercase++;

			}else if(Character.isLowerCase(ch))

			{
				lowecase++;

			}


		}



		System.out.println(uppercase+"  " + lowecase);

	}

}
