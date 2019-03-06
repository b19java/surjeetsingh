import java.util.Scanner;
class stringpalindrome
{
	public static void main(String args[])
	{    
	     String rev="";
		System.out.println("enter the string you want to check");
	    Scanner sn=new Scanner(System.in);
		String s=sn.nextLine();
		int a=s.length();
		for(int i=a-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("the reverse of the string is:-"+rev);
		if(rev.equals(s))
		{
			System.out.println("the String is palindrome ");
		}
		
		else
		{
			System.out.println("the string is not palindrome");
		}
	}
}
