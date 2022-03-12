package githubPackage;
//Assignment 8
interface Mybanks{
	void getBalance();
}
class BankA implements Mybanks{

	public void getBalance() {
		double preBalance = 1200.00;
		double diposit = 1000; 
		double newBalance = (preBalance+diposit);
		System.out.println("Your balance in BankA: "+newBalance);
	}
}


class BankB implements Mybanks{
	
	public void getBalance() {
		double preBalance = 4200.00;
		double diposit = 1500; 
		double newBalance = (preBalance+diposit);
		// TODO Auto-generated method stub
		System.out.println("Your balance in BankB: "+newBalance);
	}
}

class BankC implements Mybanks{
	 
	public void getBalance() {
		double preBalance = 65000.00;
		double diposit = 2000; 
		double newBalance = (preBalance+diposit);
		// TODO Auto-generated method stub
		System.out.println("Your balance in BankC: "+newBalance);
	}
}
public class Assignment8 {

	public static void main(String[] args) {
		Mybanks a = new BankA();
		a.getBalance();
	    Mybanks b = new BankB();
	    b.getBalance();
	    Mybanks  c = new BankC();
		c.getBalance();
	}

}
