package Arrays;
/*WAP to find the First maximum number in an array */
public class FirstMax 
{
	public static void main(String[] args)
	{
		int[] arr= {1,2,4,5,6,7,8};
		int Fmax=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>Fmax)
			{
				Fmax=arr[i];
			}
		}
		System.out.println(Fmax);
	}
}
