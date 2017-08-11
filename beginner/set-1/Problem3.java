import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem3 {

	public static void main(String[] args) {
		try
		{
			BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
			char c=new String(buff.readLine()).charAt(0);
			if(!Character.isLetter(c))
				throw new Exception();
			c=Character.toLowerCase(c);
			if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
				System.out.println("Vowel");
			else
				System.out.println("Consonant");
			buff.close();
		}
		catch(Exception e)
		{
			System.out.println("Invalid Input");
		}
	}

}
