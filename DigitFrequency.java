import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        sc.close();

        int[] frequency = new int[10]; // Array to store frequency 
        long temp = number;

        // Count frequency of each digit
        while (temp > 0) {
            int digit = (int)(temp % 10);
            frequency[digit]++; 
            temp /= 10; 
        }

        // Display the frequency of each digit
        System.out.println("\nDigit\tFrequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + "\t" + frequency[i]);
            }
        }
    }
}
