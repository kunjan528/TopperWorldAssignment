import java.util.Scanner;

public class ATM_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int balance = 100000 ;
		int withdraw ,deposit ;
		
		Scanner sc = new Scanner(System.in) ;
		
		while(true)
		{
			 System.out.println("Automated Teller Machine");
			 System.out.println("Choose 1 for Withdraw : :") ;
			 System.out.println("Choose 2 for Deposit :");
			 System.out.println("Choose 3 for Check Balance :");
			 System.out.println("choose 4 for EXIT :") ;
			 
			 System.out.println("Choose the option you want to perform :") ;
			 
			 int choice = sc.nextInt();
			 switch(choice)
			 {
				 case 1 : System.out.println("Enter money to be withraw :") ;
				 
						 withdraw = sc.nextInt();
						 if(balance >=withdraw)
						 {
							 balance = balance - withdraw ;
							 System.out.println("Please Collect your Money :");
						 }
						 else
						 {
							 System.out.println("Insufficient Balance :"); 
						 }
						 
						 System.out.println("-------------------------") ;
						 
						  break ;
				  
				 case 2 : System.out.println("Enter money to be deposited :");
				   
							 deposit = sc.nextInt() ;
							 balance = balance + deposit ;
							 
							 System.out.println("Your money has been successfully deposited .");
							 
							 System.out.println("-------------------------") ;
							 
							 break ;
							 
							 
				 case 3 :  System.out.println("Balance :" +balance );
				           
				           System.out.println("-------------------------") ;
				           
				           break ;
				           
				           
				 case 4 : System.gc();
				 
				         
				 
			  
			 }
			 
		}
		

	}

}