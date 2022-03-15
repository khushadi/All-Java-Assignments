package githubPackage;


public abstract class Shape{
		double length =14; 
		double width =8;
		double height =12;
		double base =6;
		
		public abstract void printArea();

		public static void main(String[] args) {
			 Shape s;
			 s =new Rectangle();
			 s.printArea();

			 s =new Triangle();
			 s.printArea();

			 s =new Circle();
			 s.printArea();

		}
	}
	class Rectangle extends Shape{
		
		
		@Override
		public void printArea() {
			
			double area= length*width;
		      
	        System.out.println("Area of Rectangle = " + area);
			
		}
		 
	}
	class Triangle extends Shape{
		
		@Override
		public void printArea() {

		double	area = (base * height)/2;
		System.out.println("Area of Triangle is = " + area);
		}
		
	}
	class Circle extends Shape{
		
		
		@Override
		public void printArea() {
			int circumference = 20;
			double area = (circumference * circumference) /(4* Math.PI);

			System.out.println("Area of a Circle = " + area);
		
	}
}
