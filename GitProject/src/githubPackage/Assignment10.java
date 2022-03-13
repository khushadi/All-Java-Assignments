package githubPackage;
//Assignment 10 : create an abstract class named Restaurant....
abstract class Resturant{
	public static void name(String a){
		System.out.println(a);
	}
	abstract void totalPrice();
	abstract void menu();
}
class McDonald extends Resturant{

	void menu() {
		String menu1 = "1.Cheese Burger.";
		String menu2 = "2.Chicken Sandwitch.";
		String menu3 = "3.French Fries.";
		String menu4 = "4.Kids meal.";

		System.out.println("McDonald's Menu:");
		System.out.println(menu1+" "+menu2+" "+menu3+" "+menu4);
	}
	public double calculateTax(double tax, double cost) {
		tax = .06*cost;
		cost= cost+tax;
		return tax;
	}
	void totalPrice() {

		double cost = 450; 
		double taxamount = calculateTax(.06, cost);
		double totalsale = (cost + calculateTax(.06, cost));
		System.out.println("Meal price = "+cost);
		System.out.println("Sale tax = "+ taxamount);
		System.out.println("Total price including tax = "+totalsale );
	}
}


class KFC extends Resturant{
	void menu() {
		String menu1 = "1.KFC Chicken Sandwitch Combo.";
		String menu2 = "2.Sandwitch and Tenders Meal.";
		String menu3 = "3.Crispy fried chicken.";
		String menu4 = "4.Drinks.";

		System.out.println("KFC Menu");
		System.out.println(menu1+" "+menu2+" "+menu3+" "+menu4);
	}
	public double calculateTax(double tax, double cost) {
		tax = .06*cost;
		cost= cost+tax;
		return tax;
	}

	void totalPrice() {

		double cost = 280; 
		double taxamount = calculateTax(.06, cost);
		double totalsale = (cost + calculateTax(.06, cost));

		System.out.println("Meal price ="+cost);
		System.out.println("Sale tax = "+ taxamount);
		System.out.println("Total price including tax = "+totalsale );
	}

}

public class Assignment10 {

	public static void main(String[] args) {
		McDonald m = new McDonald();
		Resturant.name("McDonald Restaurant");
		m.menu();
		m.totalPrice();
		KFC k = new KFC();
		Resturant.name("\nKFC Restaurant");
		k.menu();
		k.totalPrice();

	}

}

