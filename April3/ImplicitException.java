package April3;

public class ImplicitException 
{
	static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("not valid");
		}
		else
			System.out.println("welcome");
	}

	public static void main(String[] args)
	{
		validate(19);
	}

}
