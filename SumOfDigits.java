package Numberseries;
/*WAP to find the sum of the given number*/
public class SumOfDigits 
{
	public static void main(String[] args) 
	{
		int no=7852;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
			System.out.println(sum);
		}
	}
