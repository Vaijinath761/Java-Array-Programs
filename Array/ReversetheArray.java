
//WJP to reverse the integer array

package Array;

public class ReversetheArray {

	public static void main(String[] args) 
	{
		int []x= {46,67,87,65,54,43};
		
		System.out.println("before reverse: ");
		
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");//46 67 87 65 54 43
		}
		reverse(x);
		System.out.println("\nafter reverse: ");
		
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");//43 54 65 87 67 46
			
		}
		
	}
		static void reverse(int[] ar)
		{
			
			int i=0,j=ar.length-1;
			while(i<j)
			{
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
				i++;
				j--;
			}
				
		}

}
