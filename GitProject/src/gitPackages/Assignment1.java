package gitPackages;



	//Java Program To Calculate Electricity Bill 
	import java.util.Scanner;

	public class Assignment1 {

		public static void main(String[] args) {

			double units;
			 
			   Scanner sc=new Scanner(System.in);
		 
			   System.out.println("Enter number of units: ");
			   units=sc.nextInt();
			   sc.close();
			   
			   totalBill(units);  
		 
		} 	   
		     	   
		 public static void totalBill(double units)
					 {  
			 double billpay=0;
		     	   
		           if(units >0 && units<=50)
				billpay= (units*1.00);
		           
		           else if(units> 50 && units<=100)
		        	   billpay = 50*1.00 + (units- 50)*2; 
			          	 
		    	    else if(units> 100 && units<=200)
		    	    	billpay = 50*1.00 + 50*2.00 +(units -100)*3;  	
		             
		    	    
		    	    else if(units>200 && units<=400)
		    	   billpay=50*1.00 + 50*2.00  + 100*3+(units -200)*4 ;
					 
		    	    else if (units>400)
		    	   billpay=50*1.00 + 50*2.00 +100*3.00 + 200*4.00 +(units - 400)*5; 
		       
		              System.out.println("Bill to pay : " + billpay); 
		   } 


	}
