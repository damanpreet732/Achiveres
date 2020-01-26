import java.util.* ;
class Achive6 
{
	static  int[] specificSum (int arr[] , int sum )
	{
		int narr[] = new int[2] ;
		boolean flag = false ;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] + arr[j] == sum && flag == false )
				{
					flag = true ;
					narr[0] = i ;
					narr[1] = j ;
				}
			}
		}
		return narr ;
	}
	public static void main(String args[] )
	{
		int arr[] = {2,11,7,15} ;
		int sum = 9 ;
		int narr[] = specificSum(arr,sum );
		System.out.print(narr[0]+" "+narr[1]);
		}
}