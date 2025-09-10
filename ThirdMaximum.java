package Arrays;
/*WAP to find the third maximum number present in an array*/
public class ThirdMax {
public static void main(String[] args) {
	int[] arr= {431,54,6,7,8,4,41,5};
	int Fmax=0,Smax=0,Tmax=0;
	for(int i=0;i<arr.length;i++)
		{
		if(arr[i]>Fmax)
		{
			Tmax=Smax;
			Smax=Fmax;
			Fmax=arr[i];
		}
		else if(arr[i]>Smax)
		{
			Tmax=Smax;
			Smax=arr[i];
		}
		else if(arr[i]>Tmax)
		{
			Tmax=arr[i];
		}
		}
	System.out.println(Tmax);
		}
}
