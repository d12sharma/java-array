import java.util.Scanner;

class BMIUsingArray {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of persons: ");
		int persons = sc.nextInt();
		
		double[] height = new double[persons];
        double[] weight = new double[persons];
        double[] bmi = new double[persons];
        String[] status = new String[persons];
		
		for(int i=0;i<persons;i++){
		System.out.print("Enter the height of person "+ i+1+" ");
		height[i]=sc.nextDouble();
		System.out.print("Enter the weight of person "+ i+1+" ");
		weight[i]=sc.nextDouble();
			
		
		
		bmi[i]=weight[i]/height[i]*height[i];
		
		if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            }
			else if (bmi[i] >= 18.5 && bmi[i] < 24.9) {
                status[i] = "Normal weight";
            } 
			else if (bmi[i] >= 25 && bmi[i] < 29.9)			{
                status[i] = "Overweight";
            }
			else {
                status[i] = "Obese";
            }
		}	
			for(int k=0;k<persons;k++){
			System.out.println("Person"+(k+1)+" height is "+height[k]+" weight is "+weight[k]+"bmi is"+bmi[k]+"status is"+status[k]);
			}
			
        
	}
}