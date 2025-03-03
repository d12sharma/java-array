import java.util.Scanner;

class MeanOfHeights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object to take user input
		double[] heights = new double[11]; // Declaring an array to store heights of 11 players
		double sum =0;
	
		// Loop to take height inputs from the user
		for(int i=0;i<heights.length;i++){
		System.out.print("Enter the height of player "+(i+1)+" :");
		heights[i] = sc.nextDouble();
		sum+=heights[i];
		}
		// Calculating the mean  height
		double mean = sum / heights.length;
		System.out.println("The mean is : "+ mean);
		
		
		
	}	
}		