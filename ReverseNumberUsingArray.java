import java.util.Scanner;

class ReverseNumberUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        

        int count = 0;
        long temp = number;

        // Count the number of digits
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] array = new int[count];
        int index = 0;

        // Store number in the array
        while (number > 0) {
            array[index++] = (int)(number % 10);
            number /= 10;
        }

        // print the array 
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(array[i]);
        }
    }
}
