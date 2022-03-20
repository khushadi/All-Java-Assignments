package githubPackage;
//Assignment 12 Create and Raise the exception CreditsNotSuffiecientException
//if  credits are less than 50 with different caller methods. and handle them..

public class CreditsNotSuffiecientExceptionce extends Exception {

	public CreditsNotSuffiecientExceptionce(String msg) {
		 
		super(msg);
	}
	

	
	public void myDebit(double credit1, double inputamount){
		double newBalance = credit1- inputamount;
		System.out.println("New credit " + newBalance );
		

	}

}
