import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		Scanner s = new Scanner (System.in);
		
		      System.out.println("empId");
		      int empId = scn.nextInt();
		      
		      System.out.println("empName");
		      String empName = scn.next();
		      
		      System.out.println("empEmail");
		      String empEmail = s.nextLine();
		      
		     
		      System.out.println("empphoneno");
		      long empphoneno = scn.nextLong();
		      
		      System.out.println("empSalary");
		      double empSalary = scn.nextDouble();
		      
		      System.out.println("empGender");
		      char empGender = scn.next().charAt(0);
		      
		      System.out.println("\n\n\n");
		      System.out.println("emp Id:"+ empId);
		      System.out.println("empName:" + empName);
		      System.out.println("empEmail :" + empEmail );
		      System.out.println("empPhoneno :"+ empphoneno);
		      System.out.println("empSalary :" + empSalary);
		
		


	}

	private static String nextLine() {
		// TODO Auto-generated method stub
		return null;
	}

}


/*empId
empName
empEmail
empPhoneno
empSalary
empGender
empCity

Scanner scan = new Scanner(System.in);
int age = scan.nextInt();
String F_Name =scan.next();
float total = scan.nextFloat(); */
