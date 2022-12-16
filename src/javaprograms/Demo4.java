package javaprograms;

import java.util.Scanner;

public class Demo4
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	{
		int n=sc.nextInt();
		int star=1;
		int space=n-2;
		
	int space=n/2;
	int star=1;
	char ch='A';
	for(int i=1; i<=n; i++)
	{
		for(int j=1; j<=space; j++)
		{
			System.out.print("  ");
		}
	for(int k=1; k<=star; k++)
	{
		System.out.print((char)(k+64)+" ");
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










}
