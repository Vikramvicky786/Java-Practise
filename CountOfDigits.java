package Numberseries;
/* WAP to find the count of the given number*/
public class CountOfDigits 
{
	public static void main(String[] args) 
	{
		int no=7805;
		int count=0;
		while(no!=0)
		{
			count++;
			no=no/10;
		}
		System.out.println(count);
		}
		}
	


