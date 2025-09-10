package Numberseries;
/*WAP to check the given number is Armstrong or not.
 * 135-------->1³+3³+5³=135*/

public class Armstrong
{
public static void main(String[] args)
{
	int no=371;
	int num=no,copy=no,sum=0,count=0;
	while(num!=0)
	{
		num=num/10;
		count++;
	}
	while (no!=0)
	{
		int rem=no%10;
		sum+= Math.pow(rem, count);
		no=no/10;
	}
	if(copy==sum)
	{
		System.out.println(copy +" is an armstrong number");
	}
	else
	{
		System.out.println(copy +" is not an armstrong number");
	}
}}

















