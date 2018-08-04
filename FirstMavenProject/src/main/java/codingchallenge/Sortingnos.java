package codingchallenge;

public class Sortingnos {
	
	public int[] sortArray(int []a) {
		
		int temp = 0;
		//int length = a.length;
				
		//System.out.println(length);
		/*for(int i=0;i<length;i++) {
			
			for(int j=1;j<=length;j++) {
			
			if(a[i]<a[j]) {
				
				temp=a[j+1];
				a[j+1]=a[i];
				a[i]=temp;
						
				}
			}
			
		}*/
		for (int i = 0; i < a.length; i++)
		{
		       for(int j = 0; j < a.length; j++)
		       {
		                if(a[i] < a[j + 1])
		                {
		                            temp = a [j + 1];
		                            a [j + 1]= a [i];
		                            a [i] = temp;
		                }
		       }
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {12,56,23,57,32};
		Sortingnos sn = new Sortingnos();
		
		int []b = sn.sortArray(a);
		
		for(int c=0;c<=b.length;c++) {
			
			System.out.print(b[c]);
			
		}

	}

}
