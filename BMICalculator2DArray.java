import java.util.Scanner;

class BMICalculator2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of persons
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        // Multi-dimensional array to store height, weight, and BMI
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Take input for height and weight, ensuring positive values
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for person " + (i + 1));

            do {
                System.out.print("Enter height (in meters, positive value): ");
                personData[i][0] = sc.nextDouble();
            } while (personData[i][0] <= 0);

            do {
                System.out.print("Enter weight (in kg, positive value): ");
                personData[i][1] = sc.nextDouble();
            } while (personData[i][1] <= 0);

            // Calculate BMI and store in 2D array
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            // Determine weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        
    }
}
