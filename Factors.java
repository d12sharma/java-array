import java.util.Scanner; 
class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt(); // Read user input

        int maxFactor =10; // maximum factors which can be stored
		int [] factors  = new int[maxFactor]; 
		int index=0;
		// loop to store the factors in factors array
		for(int i=1;i<number;i++){
			if(number%i==0){
				
				 factors[index++]=i;
				
				
				
			
			}
		}
		System.out.println("Factors of "+number+"are :");
		// loop to print the factors
		for(int k=0;k<maxFactor;k++){
			if(factors[k]==0){
				break;
			}
		System.out.println(factors[k]);
		}
        
    }
}
