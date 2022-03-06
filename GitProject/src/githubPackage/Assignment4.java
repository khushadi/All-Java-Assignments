package githubPackage;

//Assignment-4  Print the number of pattern using for loop
public class Assignment4 {

	public static void main(String[] args) {
					
		 for (int i = 1; i <= 5; i++) {

		      for (int j = i; j >0; j--) {
		        System.out.print(""+j);
		      }
		       for (int k = 2; k <=i; k++) {
		    	   System.out.print("" +k);  
		   
		      }
		     System.out.println("\n");
		    }
	
	}

}
