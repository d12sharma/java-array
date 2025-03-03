import java.util.Scanner;

class CheckNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Taking user input for the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the number " + (i + 1) + " : ");
            numbers[i] = sc.nextInt();
        }

        // Checking the properties of each number
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {  // Checking if number is positive
                if (numbers[i] % 2 == 0) {  // Checking if even
                    System.out.println("The Number " + numbers[i] + " is even");
                } else {  // If not even, then it's odd
                    System.out.println("The Number " + numbers[i] + " is odd");
                }
            } else if (numbers[i] == 0) {  // Checking if number is zero
                System.out.println("The Number " + numbers[i] + " is zero");
            } else {  // If not positive or zero, then it's negative
                System.out.println("The Number " + numbers[i] + " is negative");
            }
        }

        // Comparing first and last elements of the array
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("First and last element are equal");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First element is greater than last element");
        } else {
            System.out.println("Last element is greater than first element");
        }
        
    }
}
