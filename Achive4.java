class Achive4
{
	static int []  shiftZerosToEnd(int arr[])
	{
		int narr [] = new int [arr.length] ;
		int j = 0 ;
		for(int i:arr)
		{
			if(i != 0)
			{
				narr[j++] = i;
			}
		}
		for(;j<arr.length;j++)
		{
			narr[j] = 0; 
		}
		return narr ;
	}
	public static void main(String args [] )
	{
		int arr[] = {0,1,0,3,12} ;
		arr = shiftZerosToEnd(arr);
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
	}
}