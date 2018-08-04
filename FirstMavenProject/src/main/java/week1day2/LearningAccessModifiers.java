package week1day2;

public class LearningAccessModifiers {
	
	static int addition(int c,int d) {
		
		int e =c+d;
		
		System.out.println("The sum of two numbers is-->"+e);
		
		return e;
	}
	
	static int subtraction(int f,int g) {
		
		int h = f-g;
		
		System.out.println("The subtraction of two numbers is-->"+h);
		
		return h;
	}
	
	static float division(int i) {
		
		float j = i/2;
		
		System.out.println("The number divided by two value is-->"+j);
		
		return j;
	}
	
	static int largestNumber(int number1,int number2) {
		
		if(number1>number2) {
			
			System.out.println("The largest number is--->"+number1);
			
			return number1;
		}else {
			
			System.out.println("The largest number is--->"+number2);
			
			return number2;
		}
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=2,b=7;
		
		addition(a,b);
		subtraction(a,b);
		division(b);
		largestNumber(a,b);
		
	}

}
