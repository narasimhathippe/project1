package javaprograms;
import java.util.Scanner;
public class V1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter an add number");
		int n=sc.nextInt();
		int space=n-2;
		int star=1;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print("* ");
			}
		for(int k=1; k<=space; k++)
			System.out.print("");
		
		}
		for(int l=star; l>=1; l--) {
			{
				int i;
				if(i<=n/2)
			System.out.print("* ");
			}
					System.out.println("");
		if(l<=n/2)
	{
		star=star-2;
		space++;
	}else {
			star=star+2; 
		space--;

		}

		}
	}


	}

}
