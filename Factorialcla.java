
// Write a program for Factorial of given number
class Factorialcla
{
	public static void main(String args[])
	{
		int n,fact=1,i;
		n=Integer.parseInt(args[0]);
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of given number ="+fact);
	}
}