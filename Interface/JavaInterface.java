interface first
{
	void print();
	
}
class abc implements first
{

	
	public void print() {
		System.out.print("first interface");
		
	}
	
}
public class JavaInterface {

	public static void main(String[] args) {
		
		abc a=new abc();
		a.print();
		
	}

}
