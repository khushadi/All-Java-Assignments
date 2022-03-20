package githubPackage;

//Assignment 12 Create and Raise the exception CreditsNotSuffiecientException
//if  credits are less than 50 with different caller methods. and handle them..

import java.util.Scanner;
public class MyException {
	


	public static void main(String[] args)
   {
	double credit =50;
	double amount = 0; 
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of credit: ");
		amount = sc.nextInt();
		sc.close();
	
	
		try {
			
			if ( credit< amount ) {
				
				throw new CreditsNotSuffiecientExceptionce("Your credit should be less then 50 ");
		}
	else
	{
		CreditsNotSuffiecientExceptionce c = new CreditsNotSuffiecientExceptionce(null);
		c.myDebit(credit, amount);
		System.out.println("Initial credit was "+ credit);
	}
	
}
	catch(CreditsNotSuffiecientExceptionce ce) {
	System.out.println("error ..\n Exceed credit limit-  "+ ce.getMessage());

   }

	
	}

	private static void MyException() {
		// TODO Auto-generated method stub
		
	}

	 
}