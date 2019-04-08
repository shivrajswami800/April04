import java.util.Scanner;

public class Secind_Large_no {

	public static void main(String[] args) {
		int n,max;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total num of element:\t");
		n= sc.nextInt();
		
		int a[]= new int[n];
		System.out.println("Enter all the Elements:\n");
		
		for(int i=0; i<n; i++)
		{
			a[i]= sc.nextInt();
		}
		
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(a[i]>a[j])
				{
					max = a[i];
					a[i]=a[j];
					a[j]=max;
				}
			}
		}
		System.out.println("Second Largest Number is:\t"+a[n-2]);
	}
	}

}
