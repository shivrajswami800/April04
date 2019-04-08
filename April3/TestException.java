package April3;

public class TestException 
{
	public static void main(String args[])
	{
		int a,b,c;
		a=100;
		b=0;
		try
		{
			c=a/b;	
		}
		catch(Exception e)
		{
			System.out.println("The Caught Exception is:");
			System.out.println(e);
		}
		
	}

}
