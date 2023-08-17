package Array;

public class Commonelement {

	
	
	int[] intersection(int[] a,int[] b)
	{
		int[] c=new int[a.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[i])
				{
					c[k]=a[i];
					k++;
					break;
				}
			}
		}
		
		int[] rs=new int[k];
		for(int i=0;i<k;i++)
			rs[i]=c[i];
		
		
		return rs;
	}
	

}
