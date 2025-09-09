package Numberseries;
/* WAP to find the multiplication of the given number*/
public class MulOfDigit {
public static void main(String[] args) {
	int no=498;
	int mul=1;
	while(no!=0)
	{
		int rem=no%10;
		mul=mul*rem;
		no=no/10;
}
	System.out.println(mul);
}
}
