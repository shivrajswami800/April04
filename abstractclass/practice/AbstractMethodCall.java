package abstractclass.practice;

public class AbstractMethodCall extends TestAbstract
{
	public void display()
	{
		System.out.println("Welcome abstract method in abstract class");
	}

	public static void main(String[] args) 
	{
		AbstractMethodCall ab1 = new AbstractMethodCall();
		ab1.display();
		ab1.show();
		
	}

}
