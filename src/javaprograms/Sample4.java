package javaprograms;

public class Sample4 {

	public static void main(String[] args) {
	
	
		int space=n/2;
		int star=1;
		int x=1;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print("  ");
			}
		for(int k=1; k<=star; k++)
			if(k%2==1)
		{
			System.out.print(x+" ");
			x++;
			
		}else {
					System.out.println("_");
		}
		System.out.println();
		if(i<=n/2)
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
