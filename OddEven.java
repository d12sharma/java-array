import java.util.*;

class OddEven{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int number = sc.nextInt(); // taking input from user
		
		if(number<=0){
			System.out.print("Input is not a Natural Number ");
			System.exit(0); // if not a natural number system will exit the code
			
		}
		
		
		int [] odd = new int [(number+1)/2]; // taking size of odd array
		int [] even = new int [(number/2)]; // taking size of even array
		int oddNumber = 0;
		int evenNumber = 0;
		// loop to iterate odd numbers in odd array and even number in even array
		for(int i=1 ;i<=number;i++){ 
			if(i%2==0){
				even[evenNumber]=i;
				evenNumber++;
			}
			else{
				odd[oddNumber]=i;
				oddNumber++;
			}
		}
		// printing odd numbers
		System.out.println("Odd Numbers");
		for(int j=0;j<odd.length;j++){
			System.out.println(odd[j]);
		}
		//printing even numbers
		System.out.println("Even Numbers");
		for(int k=0;k<even.length;k++){
			System.out.println(even[k]);
		}
		
		
		
		
	}
}