import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem5 {

	public static void main(String[] args) {
		try
		{
			BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
			int a=Integer.parseInt(buff.readLine());
			int b=Integer.parseInt(buff.readLine());
			int c=Integer.parseInt(buff.readLine());
			if((a>b)&&(a>c))
				System.out.println(a+" is large");
			else if(b>c)
				System.out.println(b+" is large");
			else
				System.out.println(c+" is large");
			buff.close();
		}
		catch(Exception e)
		{
			System.out.println("Invalid Input");
		}
		
	}

}
