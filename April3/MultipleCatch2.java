package April3;

public class MultipleCatch2 
{
	public static void main(String args[])
	{
	
	try
	{
		int a=20/0;
		String s=null;
		System.out.println(s.length());
		
	}
	catch(ArithmeticException e)
	{
		System.out.println("The caught Exception is:");
		System.out.println(e);
	}
	catch(Exception e)
	{
		System.out.println("The caught Exception is:");
		System.out.println(e);
	}
}

}
