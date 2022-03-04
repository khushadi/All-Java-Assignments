package githubPackage;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		double num1, num2, result;
		int option;
		Scanner sc = new Scanner(System.in);

		System.out.println("1 for addition\n2 for Subtraction \n3 for Multiplication\n4 for Division ");
		System.out.println("Choose an option:1 2 3 or 4 : ");
		option = sc.nextInt();

		System.out.println("Enter first number: ");
		num1 = sc.nextDouble();
		System.out.println("Enter second number: ");
		num2 = sc.nextDouble();
		sc.close();

		if(option==1) {
			
		}

		switch (option) {

		case 1 :
			result = (num1 + num2);
			System.out.println("The sum of two numbers = "+result );
			
			break;
		case 2:
			result = (num1 - num2);
			System.out.println("The difference of two numbers = "+result );
			break;
		case 3:
			result = (num1 * num2);
			System.out.println("The product of two numbers = "+result );
			break;
		case 4:
			result = (num1/ num2);
			System.out.println("The quotient of two numbers = "+result );
			break;
		default:
			System.out.println("not a valid number");
			break;
		}

	}
}