package Costructor.Practice;

public class ConstructorOverload  
{
	int roll,id;String s;
	ConstructorOverload(int a,int b)
	{
		roll=a;
		id=b;
		
		System.out.println("Roll And Id are:"+roll+""+id);
	}	
	ConstructorOverload(int x,int y,String j)
	{
		roll=x;
		id=y;
		s=j;
		
		System.out.println("Roll And Id are:"+roll+""+id+""+s);
	}	
	
	public static void main(String[] args) 
	{
		ConstructorOverload s1=new ConstructorOverload(12,13);
		ConstructorOverload s2=new ConstructorOverload(12,13,"Ram"); 
				
		}

}
