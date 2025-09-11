package Numberseries;

import java.util.Iterator;

/*WAP to display the prime number till 100*/
public class PrimeNoTill100 
{
public static void main(String[] args) 
{
	for(int j=2;j<=100;j++)
	{
		boolean flag=true;
		for(int i=2;i<j;i++)
		{
			if(j%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println(j);
		}
	}
}
}

