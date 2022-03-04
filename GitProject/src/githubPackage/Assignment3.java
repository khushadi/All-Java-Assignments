package githubPackage;

import java.util.Scanner;

public class Assignment3 {

		public static void main(String[] args) {
					
				int sumOfEvenNum=0;
				int sumOfOddNum = 0;
				int i =0;
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter your number: \n");
				int num=sc.nextInt();
				sc.close();
			
				
				if(num%2==0) {
					
				for(i=0; i<=num; i++) 
					
					if(i%2==0) {
					System.out.println(i);		
					sumOfEvenNum=sumOfEvenNum+i;
					
					}
				}
					else 
						for(int j=0; j<num; j++) {
					if(j%2!=0) {
						System.out.println(j);
						sumOfOddNum= sumOfOddNum+j;
			
				}
			}
				System.out.println("Sum of all Even numbers are: "+sumOfEvenNum);
				
				System.out.println("Sum of all Odd numbers are: "+sumOfOddNum );
				
			}
		}

