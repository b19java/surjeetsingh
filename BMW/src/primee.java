 import java.util.Scanner;
 class primee
 {
	 public static void  main(String args[])
	 {    int count=0;
		 int a,b,i,remain;
		 boolean bool=true;
		
		 System.out.println("enter the number to check prime");
		 Scanner sn=new Scanner(System.in);
		 a=sn.nextInt();
		 if(a<=1)
		 {
			 System.out.println("this is not prime number");
		 }
		 for( i=2;i<a;i++)
		 {
		     
			 remain=a%i;
			 if(remain==0)
			 {
				 bool=false;
				 break;
				  
			 }
			 else
			 {
				 bool=true;
				
			 }
		 }
		 if(bool==true)
		 {
			 System.out.println("the number is prime"   );
		 }
		 else{
			 System.out.println("the number is not prime");
		 }
	 }
 }
				 
