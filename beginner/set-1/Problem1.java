import java.io.BufferedReader;
import java.io.InputStreamReader;
//to check a no positive ,negative ,or zero
public class Problem1 {

	public static void main(String[] args) throws Exception{
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in)); 
		try
		{
			int n=Integer.parseInt(buff.readLine());
			if(n==0)
				System.out.println("Zero");
			else if(n>0)
				System.out.println("Positive");
			else
				System.out.println("Negative");
		}
		catch(Exception e)
		{
			System.out.println("Not Valid Number");
		}
		
		buff.close();
	}

}
