import java.util.Scanner;
public class Day_3_Assignment_no_1
{
	public static void main(String Args[])
	{
		Scanner sc=new Scanner(System.in);
		double a[]=new double[6];
		int sum=0;
		for(int i=0;i<=4;i++)
		{
			int  f=i+1;
		System.out.print("Enter Subject "+f+" Marks out of 100:");
		a[i]=sc.nextInt();
		}
		for(int i=0;i<=4;i++)
		{
		sum+=a[i];
		}
		double percent=(sum)/5.0;
		System.out.println("Percentage="+percent+"%");	
		if(percent>75)
			System.out.println("Grade:Distinction");
		
		else if(percent>60)
			System.out.println("Grade:First Class");
		else if(percent>50)
			System.out.println("Grade:Second Class");
		else if(percent>40)
			System.out.println("Grade:Third Class");
		else
			System.out.println("Grade:Fail");
}

}