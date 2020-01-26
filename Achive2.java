import java.util.* ;
class Achive2
{
	static void rotate (int [] arr,int n)
	{
		int narr [] = new int [arr.length] ;
		int j=0;
		for(int i=arr.length-n;i<arr.length;i++) narr[j++] = arr[i] ;
		for(int i=0;i<arr.length-n;i++) narr[j++] = arr[i] ;
		for(int i=0;i<j;i++)
		{
			System.out.print(narr[i] + " ");
		}
	}
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,6,7} ;
		int n = 3 ;
		rotate(arr,n);		
	}
}