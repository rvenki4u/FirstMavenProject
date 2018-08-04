package codingchallenge;

import java.util.Scanner;

public class Largestnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
	  int 	n1 = s.nextInt();
	  int 	n2 = s.nextInt();
	  int 	n3 = s.nextInt();
	  
	  if((n1>n2)&&(n1>n3)) {
		  
		  System.out.println("The greatest number is"+n1);
			  
	  }else if (n2>n3) {
		  
		  System.out.println("The greatest number is"+n2);
	  }else  {
		  
		  System.out.println("The greatest number is"+n3);
	  		}
	}

}
