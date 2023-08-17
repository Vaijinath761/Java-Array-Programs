package Array;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter size of the array: ");
		size=sc.nextInt();
		int a[]=new int[size];
		
		for(int i=0;i<a.length;i++)
		{
			
			a[i]=sc.nextInt();
		}
		
		System.out.println("Array elements are.......");
		//for retrieving values
		
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
			

	}

}
