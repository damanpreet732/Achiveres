import java.util.* ;
class Achive10
{
	static int stockProfit(int arr[])
	{
		int totprofit = 0;
		for(int i=0;i<arr.length-1;i++)
		{
			int profit = 0;
			int diff = arr[i+1] - arr[i] ;
			if(diff<0)
			{
				continue ;
			}
			profit = diff ;
			int j = i+ 1;
			for(;j<arr.length;j++)
			{
				diff = arr[j] - arr[i] ;
				if(diff < profit)
				{
					break ;	
				}
				profit = diff ;
			}
			//System.out.print(profit+" ");
			i = j-1 ;
			totprofit += profit ;
		}
		//System.out.println();
		return totprofit ;
	}
	public static void main(String args[] )
	{
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		int stock[] = new int [n] ;
		for(int i=0;i<n;i++)
		{
			stock[i] = in.nextInt();
		}
		System.out.print(stockProfit(stock));
	}
}