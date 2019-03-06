class leapyear
{
	 public static void main(String args[])
	 {
		int year=1996;
		
		if((year%4)==0)
		{
			System.out.println("this is a leap year");
		}
		else if(year==2000)
		{
			if((year%8)==0)
			{
				System.out.println("this is a leap year");
			}
			else
			{
				System.out.println("this is not a leap year");
			}
		}
		else
		{
			System.out.println("this is not a leap year");
		}
		
		
	 }
}
