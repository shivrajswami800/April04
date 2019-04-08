package April3;

public class MultipleCatch 
{
	public static void main(String args[])
	{
		int a[]= {3,7,6,0,5};
		int b,c;
		c=0;
		
		try
		{
			b=a[2]/c;
			System.out.println(a[10]);
			
		}
		catch(ArithmeticException e)
		{
			//System.out.println("The caught Exception is:");
			System.out.println(e);
		}
		catch(Exception e)
		{
			//System.out.println("The caught Exception is:");
			System.out.println(e);
		}
	}

}
