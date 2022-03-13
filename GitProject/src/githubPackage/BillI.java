package githubPackage;

public interface BillI {
	double calcBill(int unit);
	void printBill(double amount);
	void calcBill(double internet);
}
abstract class AC implements BillI{

	public static void main(String[] args) {

		PowerBillC  c = new PowerBillC();
		c.calcBill(0);
		c.printBill(0);
		c.calcBill(0);
		WaterBillC  w = new WaterBillC();
		w.calcBill(0);
		w.printBill(0);
		w.calcBill(0);
	}
}	
class PowerBillC implements BillI{

	@Override
	public double calcBill(int unit) {
		double powerUnit = (unit*3 + (unit- 50)*2);
		return powerUnit ;

}

	@Override
	public void calcBill(double internet) {
		internet = 0;
	}	

	@Override
	public void printBill(double amount) {
		double totalamount = calcBill(60);
		System.out.println("Total amount for power service: "+ totalamount);
	}
}
class WaterBillC implements BillI{

	@Override
	public double calcBill(int unit) {
		double  water =  (unit*2.00 + (unit- 50)*2); 
		return water;
	}

	@Override
	public void calcBill(double internet) {
		internet = 50.00;
	}

	@Override
	public void printBill(double amount) {
		double totalwater = calcBill(85);
		double totalInternet = calcBill(50);
		System.out.println("Total amount for water bill: "+ totalwater);
		System.out.println("Total amount for internet service : "+ totalInternet);
	}
}
