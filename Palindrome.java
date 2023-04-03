//Write a program for Palindrome Number
class Palindrome
{
	public static void main(String args[])
	{
		int n=121,r,s=0,n1;
		n=Integer.parseInt(args[0]);
		n1=n;
		while(n>0)
		{
			r=n%10;
			s=s*10+r;
			n=n/10;
		}
		if(s==n1)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number  is not Palindrome");
		}
	}
}
