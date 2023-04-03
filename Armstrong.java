class Armstrong
{
	public static void main(String args[])
	{	
		int n=151,r,s=0,n1,cube;
		n1=n;
		while(n>0)
		{
			r=n%10;
			cube=r*r*r;
			s=s+cube;
			n=n/10;
		}
		
		if(s==n1)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is not Armstrong");
		}
	}
}