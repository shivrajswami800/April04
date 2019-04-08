package April3;

public class FinalBlock {

	public static void main(String[] args) 
	{
		int a;
		try
		{
		 a=10/0;
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Block Running");
		}
	}

}
