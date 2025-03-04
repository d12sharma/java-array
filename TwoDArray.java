import java.util.*;

class TwoDArray {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter the columns: ");
		int columns = sc.nextInt();
		
		
		
		int [][] matrix= new int [rows][columns]; // intializing 2 d array
		int [] array = new int[rows*columns]; // intializing 1 d array
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
			System.out.print("Enter the number "+i+j+" :"); 
			matrix[i][j] = sc.nextInt(); // taking input from user for 2 d array
			}
		}
			System.out.println("The 1D array is: ");
			for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
			array[i+j] = matrix[i][j]; // converting 2 d array to 1 d array
			System.out.print(+array[i+j]+" ");  // printing 1 d array
			
			}
			}
			
	}
}