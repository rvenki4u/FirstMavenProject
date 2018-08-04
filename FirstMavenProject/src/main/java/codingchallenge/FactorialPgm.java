package codingchallenge;

import java.util.Scanner;

public class FactorialPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5 = 5*4*3*2*1
		System.out.println("Enter the number to find factorial");
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		
		 
		int prod = 1;
		if(n!=1 &&n!=0 )
		{
			while(n>0){
			
			prod = prod * n;
			n=n-1;
			}

		}
		System.out.println("The factorial no is--->"+prod);
		
		}
}
