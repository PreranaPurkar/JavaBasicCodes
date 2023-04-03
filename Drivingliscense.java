// Write a program for Driving license
class Drivinglicense
{
	public static void main(String args[])
	{
		int age;
		char gender;
		System.out.println("Gender M / F");
		char=Charactor.parseChar(args[0]);
		System.out.println("Age=");
		age=Integer.parseInt(args[1]);
		if(gender == 'm')
		{
			if(age>=18)
			{
				System.out.println("\nDriving allowed for Male");
			}
			else
			{
				System.out.println("\nDriving not allowed for Male");
			}
		}
		else
		{
			if(age>=22)
			{
				printf("\nDriving allowed for Female");
			}
			else
			{
				printf("\nDriving not allowed for Female");
			}
		}
	}
}



		
		
