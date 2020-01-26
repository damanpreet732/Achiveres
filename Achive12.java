import java.util.* ;
class Achive12
{
	static boolean Prime (int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false ;
			}
		}
		return true ;
	}
	public static void main(String args[] )
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int count = 0;
		for(int i=2;i<n;i++)
		{
			if(Prime(i)) //System.out.print(i +" ");
				count++;
		}
		System.out.print(count);
	}
}