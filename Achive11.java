import java.util.* ;
class Achive11 
{
	static void represent(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 && i%5==0){System.out.println("FizzBuzz");continue ;}
			if(i%5==0){System.out.println("Buzz");continue ;}
			if(i%3==0){System.out.println("Fizz");continue ;}
			else System.out.println(i);
		}
	}
	public static void main(String args [] )
	{
		Scanner input = new Scanner (System.in);
		int n = input.nextInt();
		represent(n);
	}
}