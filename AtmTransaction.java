

import java.util.Scanner;
	public class AtmTransaction
	{
		        static Scanner input = new Scanner(System.in);
		        public static boolean cardNumbers(){
		        	System.out.println("Enter 5 digit pin no: ");
		            Scanner input = new Scanner(System.in);
		            try{
		            int num = input.nextInt(); 
		            checkNumber(num);
		            }
		            catch(Exception e){
		            	System.out.println("Wrong pin number!!!");
		                return false;  
		            }
		           return true;
		         }
		            private static void checkNumber(int num) throws Exception{

		            	    if(String.valueOf(num).length()!=5)
		            	        throw new Exception("invalid number");
		            	    else  
		            	    	System.out.println("Thank you! Your card number is valid " +num);
		            }
		               
		   public static void main(String args[] ) throws Exception
	     {             
	        int balance = 5000, withdraw, deposit;
	        Scanner s = new Scanner(System.in);
	            if(cardNumbers()){
	            System.out.println("Choose 1 for Withdraw");
	            System.out.println("Choose 2 for Deposit");
	            System.out.println("Choose 3 for Check Balance");
	            System.out.println("Choose 4 for EXIT");
	            System.out.print("Choose the operation you want to perform:");
	            while(true){
	            int n = s.nextInt();
	            switch(n)
	            {
	                case 1:
	                System.out.print("Enter money to be withdrawn:");
	                withdraw = s.nextInt();
	                if (balance - withdraw < 1000) {
	                    throw new Exception("\nINSUFFICIENT BALANCE");
	                }
	                balance = balance - withdraw;
	                System.out.println("\nTRANSACTION SUCCESSFUL. COLLECT MONEY.");
	                break;
	 
	                case 2:
	                System.out.print("Enter money to be deposited:");
	                deposit = s.nextInt();
	                balance = balance + deposit;
	                System.out.println("Your Money has been successfully depsited");
	                System.out.println("");
	                break;
	 
	                case 3:
	                System.out.println("Balance : "+balance);
	                System.out.println("");
	                break;
	 
	                case 4:
	                System.exit(0);
	            }
	        }
	    }
	}
}