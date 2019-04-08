package April3;

public class ExceptionPropogation 
{
	public void m()
	{
		int a=60/0;
	}
	public void n()
	{
		m();
	}
	public void p()
	{
		try
		{
			n();
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
	}
	

	public static void main(String[] args) 
	{
		ExceptionPropogation  xp = new ExceptionPropogation ();
		xp.p();
		

	}

}
