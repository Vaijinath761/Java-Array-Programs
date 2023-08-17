package Array;

public class MergeSortedFormat {

	public static void main(String[] args) 
	{
		

	}
	public int[] mergeSrt(int[]a,int[]b)
	{
		int[] c=new int[a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length&&i<b.length)
		{
			if(a[i]<b[j])
			c[k++]=a[i++];
			
			else
			c[k++]=b[j++];
			
		}
		while(i<a.length)
			c[k++]=a[i++];
		
		while(i<b.length)
			c[k++]=b[j++];
		
		return c;
	}

}
