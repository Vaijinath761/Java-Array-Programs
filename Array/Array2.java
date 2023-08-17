
//WJP to sum of digits of the index

package Array;

public class Array2 {

	public static void main(String[] args) 
	{
		int []x= {46,67,87,65};
		update(x);
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		
	}
		static void update(int[] ar)
		{
			
			for(int i=0;i<ar.length;i++)
			{
				int n=ar[i],sum=0;
				
				do {
					int r=n%10;
					sum=sum+r;
					n=n/10;
				}while(n!=0);
				
				ar[i]=sum;
			
			}
			
		}

}
