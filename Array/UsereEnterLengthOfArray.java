package Array;
import java.util.Scanner;
public class UsereEnterLengthOfArray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n=sc.nextInt();//4
		double[] wt=new double[n];
		System.out.println("enter "+n+" weights");
		for(int i=0;i<wt.length;i++)
		{
			wt[i]=sc.nextDouble();
		}
			System.out.println("user entered array: ");
			
			for(int i=0;i<wt.length;i++)
			{
				System.out.print(wt[i]+" ");
			}

	}

}
