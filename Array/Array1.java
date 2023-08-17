package Array;

public class Array1 {

	public static void main(String[] args) 
	{
		int []x= {46,67,87,65,54,43};
		int[] ct=countEO(x);
		
		System.out.println("Number of even values: "+ct[0]);
		System.out.println("Number of even values: "+ct[1]);

	}
		static int[] countEO(int[] ar)
		{
			int ec=0,oc=0;
			for(int i=0;i<ar.length;i++)
			{
				if(ar[i]%2==0)
					ec++;
				else
					oc++;
				
			}
			int[] count= {ec,oc};
			return count;
		}

}
