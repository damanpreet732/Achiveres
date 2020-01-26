import java.util.* ;
class Achive13
{
	static boolean check(int n)
	{
		if(Math.pow(3,19)%n==0) return true ;
		return false ;
	}
	public static void main(String args[] )
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt() ;
		System.out.print(check(n));
	}
}