import java.util.Scanner;

class CheckMultipleValues{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double  [] numbers = new double[10];
	int i=0;
	int sum=0;
	
	// Using an infinite while loop to take user input
	while(true){
		if(i==10){
			break;
		}
		System.out.print("Enter the Number "+(i+1)+" : ");
		numbers[i]=sc.nextDouble();
		// Breaking the loop if the user enters 0 or a negative number
		if(numbers[i]==0 || numbers[i]<0){
			break;
			}
		i++;
		}
		// Loop to print entered numbers and calculate their sum
		for(int j=0;j<i;j++){
			System.out.println(numbers[j]);
			sum+=numbers[j];
		}
		System.out.println("The Sum is :"+sum);
	}
}	