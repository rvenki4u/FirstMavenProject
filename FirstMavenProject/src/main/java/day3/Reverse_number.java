package day3;

public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 1234;
		int reverseNumber = 0;
		int temp = 0;
		
		while(number>0) {
			
			temp = number%10;
			
			reverseNumber = reverseNumber * 10 + temp;
			
			number = number/10;
		}
System.out.println("Reversed Number is"+reverseNumber);

		String noToString=String.valueOf(number);
		char[] charNumbers=noToString.toCharArray();
		String output=null;
		for(int i=noToString.length()-1;i>0;i--)
		{
			
			System.out.println(charNumbers[i]);
			output=output+charNumbers[i];
		}
System.out.println("ReversedString"+output);
	}

}
