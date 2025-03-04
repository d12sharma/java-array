import java.util.Scanner;

class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter the number of students: ");
        int students = sc.nextInt();

        // Declare arrays to store marks, percentage, and grades
        double[][] marks = new double[students][3]; 
        double[] percentage = new double[students]; 
        String[] grades = new String[students];

        // Take input for marks in Physics, Chemistry, and Maths
        for (int i = 0; i < students; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            do {
                System.out.print("Physics: ");
                marks[i][0] = sc.nextDouble();
                if (marks[i][0] < 0) System.out.println("Enter a positive value!");
            } while (marks[i][0] < 0);

            do {
                System.out.print("Chemistry: ");
                marks[i][1] = sc.nextDouble();
                if (marks[i][1] < 0) System.out.println("Enter a positive value!");
            } while (marks[i][1] < 0);

            do {
                System.out.print("Maths: ");
                marks[i][2] = sc.nextDouble();
                if (marks[i][2] < 0) System.out.println("Enter a positive value!");
            } while (marks[i][2] < 0);

            // Calculate total and percentage
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = totalMarks / 3.0;

            // Determine grade based on percentage
            if (percentage[i] >= 80) grades[i] = "A";
            else if (percentage[i] >= 70) grades[i] = "B";
            else if (percentage[i] >= 60) grades[i] = "C";
            else if (percentage[i] >= 50) grades[i] = "D";
            else if (percentage[i] >= 40) grades[i] = "E";
            else grades[i] = "R";
        }

        // Display the student grade report
        System.out.println("\nStudent Grade Report:");
        
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < students; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t\t%.2f\t%.2f%%\t\t%s\n", 
                (i + 1), marks[i][0], marks[i][1], marks[i][2], percentage[i], grades[i]);
        }
        
        sc.close();
    }
}
