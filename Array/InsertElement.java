package Array;

public class InsertElement 
{

	
	public int[] insertArr(int[] ar,int in,int ele)
	{
		if(in<0||in>ar.length)
		{
			System.out.println("index not in range");
			return ar;
		}
		
		int[] br=new int[ar.length+1];
		br[in]=ele;
		
		for(int i=0;i<ar.length;i++)
		{
			if(i<in)
				br[i]=ar[i];
			else
				
				br[i+1]=ar[i];
			
		}
		
		return br;
	
	}
}


