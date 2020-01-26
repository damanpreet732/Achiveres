import java.util.* ;
class Achive8
{
	static boolean check (int arr[] , int n)
	{
		for(int i:arr)
		{
			if(i==n) return true ;
		}
		return false ;
	}
	static int[] intersection(int []arr1,int[] arr2)
	{
		if(arr1.length < arr2.length)
		{
			int narr[] = new int[arr1.length];
			int j=0 ;
			for(int i=0;i<arr1.length;i++)
			{
				if(check(arr2,arr1[i])) narr[j++] = arr1[i];
			}
			return narr ;
		}
		int narr[] = new int[arr2.length];
		int j=0 ;
		for(int i=0;i<arr2.length;i++)
		{
			if(check(arr1,arr2[i])) narr[j++] = arr2[i];
		}
		return narr ;
		
	}
	public static void main(String args[] )
	{
		int nums1[] = {1,2,2,1} , nums2[] = {2,2} ;
		int n1[] = {4,9,5} , n2[] ={9,4,9,8,4} ;
		int nums[] = intersection(nums1,nums2);
		for(int i:nums)
		{
			if(i!=0) 	System.out.print(i+" ");
		} 
		System.out.println();
		int n[] = intersection(n1,n2);
		for(int i:n){
			if(i!=0) System.out.print(i+" ");	
		} 
	}
}