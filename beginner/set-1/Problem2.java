import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem2 {

	public static void main(String[] args){
			try
			{
				BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
				int n=Integer.valueOf(buff.readLine());
				if(n%2==0)
					System.out.println("Even");
				else
					System.out.println("Odd");
				buff.close();
			}
			catch(Exception e)
			{
				System.out.println("Invalid Input");
			}
			
	}

}
