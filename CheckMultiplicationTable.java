import java.util.Scanner;

class CheckMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object to take user input
		System.out.print("Enter the number:"); 
        int number = sc.nextInt();
		int [] table = new int[10]; // Declaring an array to store the multiplication table
		
		// Loop to calculate and display the multiplication table
		for(int i=0;i<10;i++){
			table[i]=number * (i+1);
			System.out.println(+number+ "*"+(i+1)+"="+table[i]);
			
		}
		
		
	}	
}		