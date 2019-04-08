package April3;

public class NestedTry {

	public static void main(String[] args)
	{
			int a,b,c;
			int s[]= new int[5];
			try
			{
				try
				{
					a=20/0;
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				
				try
				{
					System.out.println(s[10]);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			catch(Exception e)
			{
				System.out.println("Exception Handelled");
			}
		
	}

}
