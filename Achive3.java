class Achive3 
{
	/*
	static boolean check (int arr[] , int n)
	{
		for(int i:arr)
		{
			if(i==n) return true ;
		}
		return false ;
	}
	static int diffNos(int arr)
	{
		int narr[] = new int[arr.length];
		int j=0 ;
		for(int i:arr)
		{
			if(!check(narr,i)) narr[j++] = i;
		}
		return j ;
	}*/
	static int single(int arr[])
	{
		int no = -1 ;
		for(int i=0;i<arr.length;i++)
		{
			boolean flag = true ;
			int count = 0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i] == arr[j] )
				{
					count ++ ;
					if(count == 2 )	flag = false ;
				}
			}
			if(flag)
			{
				no =  arr[i] ;
			}
		}
		return no ;
	}
	public static void main(String args[] )
	{
		int arr[] = {2,2,1} ;
		System.out.print(single(arr));
	}
}