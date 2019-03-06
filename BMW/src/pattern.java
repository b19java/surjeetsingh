 class pattern
 {
	 public static void main(String args[])
	 {
		 int i,j,k=1;
		 char c='a';
		/* int c1=(int) c;*/
		 
		 for(i=1;i<=7;i++)
		 {
			 for(j=1;j<=4;j++)
			 {
				 if(i>=j && i+j>=8)
				 {
					 
					 System.out.print(c++ +" ");
					  
				 }
			    else
				{
					System.out.print("  ");
				}
			 }
			 c--;
			 for(j=5;j<=7;j++)
			 {
				 if(i>=j && i+j>=8)
				 {
					 
					 System.out.print(--c +" ");
					  
				 }
				 else
				{
					System.out.print("  ");
				}
			 }
			 System.out.println("");
			 c='a';
		 }
	 }
 }
