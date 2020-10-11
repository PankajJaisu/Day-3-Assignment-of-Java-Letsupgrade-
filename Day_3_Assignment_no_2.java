import java.util.Scanner;
public class Day_3_Assignment_no_2
{
	public static void main(String Args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Employee Information");
		System.out.print("Enter Name:");
		String Name=sc.next();
		System.out.print("Enter Date of birth:");
		int dateofbirth=sc.nextInt();
		System.out.print("Enter Month of birth:");
		int monthofbirth=sc.nextInt();
		System.out.print("Enter Year of birth:");
		int yearofbirth=sc.nextInt();
		System.out.print("Enter Monthly Salary:");
		float  monthlysalary=sc.nextFloat();
		double  annualsalary=monthlysalary*12.0;
		double tax=0.0;
		if(annualsalary>=500000)
		{
			 tax=0.2*500000;
		}
		else if(annualsalary>=400000)
		{
			tax=0.15*400000;
		}
		else if(annualsalary>=300000)
		{	 
		tax=0.1*200000;

		}
		else if(annualsalary>=200000)
		{
			tax=0.05*200000;
		}
		else 
		{
			System.out.println("Congratulation You Don't have you to pay\n Because your Annual Salary is less than 2L ");
		}
	
		
		System.out.println("Name:"+Name);
		int age=2020-yearofbirth;
		System.out.println("Age:"+age);
		System.out.println("Your Annual Salary:"+annualsalary);
		System.out.println("Tax:"+tax);
	}

}