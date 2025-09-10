package Numberseries;
/*WAP to check if the number is disarium or not
 * ex: 135 ---------1+3²+5³=(135)*/
public class DisariumNumber
{
public static void main(String[] args) 
{
	int no=135;
	int num=no,sum=0,count=0,copy=no;
	while(num!=0)
	{
		num=num/10;
		count++;
	}
	num=no;
	while(no!=0)
	{
		int rem=no%10;
		sum =(int)(sum + Math.pow(rem,count));
		count--;
		no=no/10;
	}
	if (copy==sum)
	{
		System.out.println(num+" is a Disarium number");
	}
	else 
	{
		System.out.println(num+" is not a disarium number");
	}
}
}
