package Array;

public class FrequencyOfArrayElements {

	public static void main(String[] args) {
		

	}
	
	void printFrequency(int a[])
	{
		boolean rs[] =new boolean[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(rs[i]==false);
			{
				int count=1;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
					rs[j]=true;
					}
				}
				System.out.println(a[i]+" ---->"+count);
			}
			
		}
	}
	
	
	

}



/*
 * if all the elements are positive

 void printFrequency(int [] a)
 {
 
 int big=a[0];
 for(int i=o;i<a.length;i++)
 
 
 if(a[i]>big)
 big=a[i];
 
 
 int[] count=new int[big+1];
 
 
 for(int i=0;i<a.length;i++)
 {
 count[a[i]]++;
 }
 
 
 for(int i=0
 
 

  
     */
