// Write a program for student information get five subject marks,calculate the total and percentage

class Studeinfo
{
	public static void main(String args[])
	{
		int math,chem,phy,bio,geo,total;
		double per;
		math=Integer.parseInt(args[0]);
		chem=Integer.parseInt(args[1]);
		phy =Integer.parseInt(args[2]);
		bio=Integer.parseInt(args[3]);
		geo=Integer.parseInt(args[4]);
		total=math+chem+phy+bio+geo;
		System.out.println("Total="+total);
		per=total/5;
		System.out.println("Percentage="+per);
		if(per>=35 && per<55)
		{
			System.out.println("Student is Pass with D Grade");
		}
		else if(per>=55 && per<65)
		{
			System.out.println("Student is Pass with C Grade"); 
		}
		else if(per>=65 && per<75)
		{
			System.out.println("Student is Pass with B Grade");
		}
		else if(per>=75 && per<85)
		{
			System.out.println("Student is Pass wiht A Grade");
		}
		else if(per>=85 && per<100)
		{
			System.out.println("Student is Pass with A+ Grade");
		}
		else
		{
			System.out.println("Student is Fail");

		}
	}
}