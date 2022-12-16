package javaprograms;

import java.util.Scanner;

public class demo {
	

private static int i;

public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int star=1;
	int space=n/2;
	for(int i=1; i<=n; i++)
	{
	for(int j=i; j<=space; j++)
		System.out.print("");
	}
	for(int k=1; k<=star; k++) {
		
		System.out.print(i%2+"");
	}
	System.out.println();
	if(i<=n/2) {
		star=star+2;
		space--;
	}else {
		star=star-2;
		space++;
	}
}
}
