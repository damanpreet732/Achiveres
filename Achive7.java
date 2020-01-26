class LastElementIncrement 
{
	int arr[] = new int [0] ;
	LastElementIncrement(int arr[])
	{
		this.arr = new int[arr.length] ;
		int j = 0 ;
		for(int i : arr)
		{
			this.arr[j++] = i  ;
		}
		this.arr[this.arr.length-1]++ ;
	}

}
class Achive7  
{
	public static void main(String args[])
	{
		int arr1 [] = {1,2,3} ;
		int arr2 [] = {4,3,2,1} ;
		LastElementIncrement l = new LastElementIncrement(arr1);
		System.out.println(l.arr[l.arr.length-1]);
		LastElementIncrement l2 = new LastElementIncrement(arr2);
		System.out.print(l2.arr[l2.arr.length-1]);
	}
}