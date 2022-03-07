package githubPackage;
//Assignment 5  Multiplication of two matrices (Use arrays and for loop)
public class Assignment5 {

	public static void main(String[] args) {
		int row[][]={{1,2,3},{4,5,6},{7,8,9}};    
		int col[][]={{9,8,7},
					{6,5,4},
					{3,2,1}};   
		
		System.out.println(" row-----------");
		System.out.println(" "+row[0][0] + " - "+row[0][1]+ " - "+row[0][2]);
		System.out.println(" "+row[1][0] + " - "+row[1][1]+ " - "+row[1][2]);
		System.out.println(" "+row[2][0] + " - "+row[2][1]+ "- "+row[2][2]);
		System.out.println(" col-----------");
		System.out.println("   "+col[0][0] + " | "+col[0][1]+ " | "+col[0][2]);
		System.out.println("   "+col[1][0] + " | "+col[1][1]+ " | "+col[1][2]);
		System.out.println("   "+col[2][0] + " | "+col[2][1]+ " | "+col[2][2]+"\n");
		
		System.out.println("Multiplication of rows and columns two matrices\n");
		    
		  
		int matrix[][]=new int[3][3];   
		    
		   
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
			matrix[i][j]=0;      
		for(int k=0;k<3;k++)      
		{      
			matrix[i][j]+=row[i][k]*col[k][j];      
		}
		
		System.out.print(matrix[i][j]+" ");   
		}
		System.out.println();
		}
	}
}
