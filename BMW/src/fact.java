
import java.util.Scanner;
class fact
{
	public static void main(String argss[])
	{
		int a,b=0,c=1;
		System.out.println("enter the number of which u want to find factorial");
		Scanner sn=new Scanner(System.in);
		a=sn.nextInt();
		for(int i=1;i<a;i++)
		{
				c=i+1;
			b=a*c;
		
			
		}
		System.out.println("the factprial of tge number is" +b);
	}
}

