import java.util.Scanner;

class CheckIfStudentCanVote {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int [] studentAge = new int[10];
		
		for(int i=0;i<studentAge.length;i++){
		System.out.print("Enter the age of student " + (i+1)+ " :");
		studentAge[i]=sc.nextInt();
		}
		for(int j=0;j<studentAge.length;j++){
		if(studentAge[j]<=0){
		System.out.println("Invalid Age");
		}
		else if(studentAge[j]>=18){
		System.out.println("The student with the age "+studentAge[j]+" can vote");
		}
		else{
		System.out.println("The student with the age "+studentAge[j]+" cannot vote");
		}
		
		}
		
	}
}