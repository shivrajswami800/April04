package Costructor.Practice;

public class CopyCostructor 
{
    int x,y;
	CopyCostructor(int a,int b)
	{
		x=a;
		y=b;
	}
	CopyCostructor(CopyCostructor c)
	{
		x=c.x;
		y=c.y;
	}
	public void print()
	{
		System.out.println("The values ARE"+x+""+y);
	}
	public static void main(String[] args)
	{
		CopyCostructor cp1=new CopyCostructor(30,90);
		CopyCostructor cp2=new CopyCostructor(cp1);
		cp1.print();
		cp2.print();
		
	}
}
	
