import java.util.Scanner;

public class question7 {

	public static void main(String[] args) 
	{
		int num1,num2;
		
		 char ch;
		 
		 int result=0 ;
	        @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
	        System.out.println("choose the first no.");
	        num1 = sc.nextInt();
	        System.out.println("choose the second no.");
	        num2 = sc.nextInt();
	        System.out.println("enter the operation");
	        ch = sc.next().charAt(0);
	         switch(ch)
	         {
	         case('+'):
	         {
	        	 result= num1+num2;
	        	 System.out.println("The result is"+result);
	         }
	         case('-'):
	         {
	        	 result= num1-num2;
	        	 System.out.println("The result is"+result);
	          }
	         case('*'):
	         {
	        	 result= num1*num2;
	        	 System.out.println("The result is"+result);
	         }
	         case('/'):
	         {
	        	 result= num1/num2;
	        	 System.out.println("The result is"+result);
	         }
	        
	    }
	}
	
}

