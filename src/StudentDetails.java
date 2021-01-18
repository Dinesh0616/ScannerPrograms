import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
	  
		Scanner sc = new Scanner (System.in);
		System.out.println("studentId");
		int  studentId = sc.nextInt();
		
		System.out.println("studentName");
		String studentName = sc.next();
		
		System.out.println("mark1");
		float mark1 = sc.nextFloat();
		
		
		System.out.println("mark2");
		double mark2 = sc.nextDouble();
		
		System.out.println("mark3");
		int mark3 = sc.nextInt();
		
		
		System.out.println("studentId :"+ studentId);
		System.out.println("studentName :" + studentName);
		System.out.println("mark1 :" + mark1);
		System.out.println("mark2 :"+ mark2);
		System.out.println("mark3 :" + mark3);
		
		float total = (float) (mark1 + mark2 + mark3) ;
	//	int total = (int) (mark1 + mark3);
		
		float average = total / 3 ;
		
		
		

	}

}
