package codingchallenge;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String s = "abba";
            
            String reverse = "";
            
            
           for(int n=s.length()-1;n>=0;n--) {
        	   
        	   reverse = reverse+s.charAt(n);
        	   
           } 
           System.out.println(reverse);
           if(s.equals(reverse)) {
        	   
        	   System.out.println("This String is Palindrome");
           }else {
        	   
        	   System.out.println("This String is not a Palindrome");
           }
        	   
	}

}
