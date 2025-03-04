import java.util.Scanner;

class FindLargestAndSecondLargest {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = sc.nextInt();
	int maxDigits=10;
	int [] array = new int[maxDigits];
	int index=0;
	int largest=Integer.MIN_VALUE;
	int secondLargest=Integer.MIN_VALUE;
	
	
	while(number>0){
		if(index==maxDigits-1){
		break;
		}
		array[index++]=number%10;
		number=number/10;
		
	}
	for(int i=0;i<array.length;i++){
	if(array[i]>largest){
	 
	 secondLargest=largest;
	 largest=array[i];
	
		
	}
	else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
		
	}
	System.out.print("the largest number is :"+largest);
	System.out.print("the second largest is :"+secondLargest);
	}
}