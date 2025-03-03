import java.util.Scanner;

class CheckNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int [] numbers = new int[5];
		for(int i=0;i<numbers.length;i++){
		System.out.print("Enter the number " + (i+1)+ " :");
		numbers[i]=sc.nextInt();
		}
		for(int i=0;i<numbers.length;i++){
		if(numbers[i]>0){
			if(numbers[i]%2==0){
				System.out.println("The Number "+numbers[i]+" is even");
			}
			else{
				System.out.println("The Number "+numbers[i]+" is odd");
			}
		}
			else if (numbers[i]==0){
			System.out.println("The Number "+numbers[i]+" is zero");
			}
			else{
				System.out.println("The Number "+numbers[i]+" is negative");
				}
			
			
		}
		if(numbers[0]==numbers[numbers.length-1]){
			System.out.println("First and last element is equal");
		}
		else if (numbers[0]>=numbers[numbers.length-1]){
			System.out.println("First element is greater than last element");
		}
		else {
			System.out.println("last element is greater than first element");
		}
		
	}	
}