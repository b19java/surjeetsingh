
import java.util.Scanner;
class digits
{
	public static void main(String args[])
	{
		String s="8729020735";
         	
          int count=0;
		  System.out.println("enter the digit you want to find the aappearance of which");
		  Scanner sn=new Scanner(System.in);
		  String s4=sn.nextLine();
		  String[] s2=s.split("");
          for(int i=0;i<s2.length;i++)
		  {
			  if(s2[i].equals(s4))
              {              
		        count=count+1;
		      }
			  
		  }
                System.out.println("the occurence of the word "+s4+ " is "+count+ " times");			  
		  }
		  
    }		


