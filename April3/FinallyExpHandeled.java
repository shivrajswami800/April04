package April3;

public class FinallyExpHandeled {

	public static void main(String[] args) 
	{
		int a;
		try
		{
			a=10/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Final Block Executed");
		}
		
	}

}
