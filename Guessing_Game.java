//Guessing Number .



import java.util.Scanner;

public class Guessing_Game {
	
	  public static void main(String[] args)
	  {
	  
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number which you want to guess :");
		int a=sc.nextInt() ;
		int i  ;
		int c=0;
		System.out.println("Enter the number for gussing..");
		for(i=1;i<=100;i++)
		{
			int n=sc.nextInt();
			 if(a>n)
			{
				System.out.println("number is less pls try again....");
				c++;
			}
			else if(a<n)
			{
				System.out.println("number is greater pls try again ....");
				c++;
			}
			else {
				 c++;
				 System.out.println("congratulations ...Your guessing number is correct");
				 System.exit(0);
			    }
		}
		
		
		
	  }
		  
	

}
