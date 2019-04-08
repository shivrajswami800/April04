package abstractclass.practice;

public class AbstractMethodCall2 extends TestAbstract
{
	public void display()
	{
		System.out.println("Display method second time displayed");
	}

	public static void main(String[] args) 
	{
		AbstractMethodCall2 ab2 = new AbstractMethodCall2();
		AbstractMethodCall ab1 = new AbstractMethodCall();
		ab2.display();
		ab2.show();
		ab1.display();
		ab1.show();
		
	}

}
