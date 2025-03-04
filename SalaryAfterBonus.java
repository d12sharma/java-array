import java.util.Scanner;

class SalaryAfterBonus {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double [] salary = new double[10]; // declared salary with array size
		int [] yearOfService = new int[10]; // declared year of service with array size
		double oldSalary =0.0;  // declared old salary
		double newSalary=0.0;// // declared new salary
		// loop for input of salary and year of service
		for(int i=0;i<10;i++){
		System.out.println("Enter the salary of person"+(i+1)+":");
		salary[i]=sc.nextDouble();
		if(salary[i]<=0){
			System.out.println("Invalid Number! Enter the salary of person"+(i+1)+":");
			salary[i]=sc.nextDouble();
		}
		oldSalary+=salary[i];
		System.out.println("Enter the years of service of person"+(i+1)+":");
		yearOfService[i]=sc.nextInt();
		if(yearOfService[i]<=0){
			System.out.println("Invalid Number! Enter the years of service of person"+(i+1)+":");
			yearOfService[i]=sc.nextInt();
		}
		}
		// loop to find bonus and new salary
		for(int i=0;i<10;i++){
			if(yearOfService[i]>=5){
				salary[i]=salary[i]+salary[i]*5/100;
				newSalary+=salary[i];
				
			}
			else{
			salary[i]=salary[i]+salary[i]*2/100;
				newSalary+=salary[i];
				
			}
		}
		double bonus = newSalary - oldSalary; // total bonus amount 
		System.out.println("Total Bonus: "+bonus);
		System.out.println("Total Old Salary: "+oldSalary);
		System.out.println("Total New Salary: "+ newSalary);
		
		
		
		
		
		
		
	}
}