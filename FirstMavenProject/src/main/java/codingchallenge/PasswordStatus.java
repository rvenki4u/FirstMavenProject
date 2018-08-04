package codingchallenge;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PasswordStatus {
	
	private Pattern pattern;
	private Matcher matcher;
	
	public static final String PASSWORD_PATTERN = "((?=.*\\\\d)(?=.*[a-z])(?=.*[A-Z]).{10,20})";
	
	public  PasswordStatus() {
		
		pattern = pattern.compile(PASSWORD_PATTERN);
		
	}
	
	public boolean validate(final String password) {
		matcher = pattern.matcher(password);
		
		return matcher.matches();

		}
	
}
