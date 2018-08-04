package codingchallenge;

public class BalaSort {
	
	static void sort()
	{
	int[] a= {8,7,32,26,90,54};
	int temp=0;
	
	//90 8 7 32 26 54
	//90 54 8 7 26 32
	//90 54 32 7 26 8
	//90 54 32 26 7 8
	//90 54 32 26 8 7
	int j=0;
	for(int i=0;i<a.length;i++)
	{
		for(j=i+1;j<a.length;j++)
		{
			//System.out.println("Loop "+i +" " +j +" " +a[i]+" "  +a[j]);
			if(a[i]<a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			System.out.println("Loop "+i +" " +j );
			for(int x=0;x<a.length;x++)
			{
				System.out.print(a[x]+" ");
			}
		}

	}
	
}
	
	public static void main(String[] args)
	{
		BalaSort.sort();
	}
}

