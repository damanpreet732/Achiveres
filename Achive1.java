class Achive1
{
	static int removed(int arr[] )
	{
		int temp[] = new int[arr.length] ;
		int prev = arr[0] ;
		int j = 0;
		temp[j++] = prev ;
		for(int i=1;i<arr.length-1;i++)
		{
			if(arr[i] == prev)continue ;
			prev = arr[i] ;
			temp[j++] = arr[i] ;
		}
		return j;
	}
	public static void main(String args[])
	{
		int arr[] = {0,0,1,1,1,2,2,2,3,3,4};
		System.out.println(removed(arr));
	}
}