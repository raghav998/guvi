import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem4 {

	public static void main(String[] args) {
		try
		{
			BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
			char c=new String(buff.readLine()).charAt(0);
			if(Character.isAlphabetic(c))
				System.out.println("Its is Alphabet");
			else
				System.out.println("Its is not Alphabet");
			buff.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
