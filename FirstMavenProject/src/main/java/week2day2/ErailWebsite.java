package week2day2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ErailWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://erail.in/");
		
		
	}

}
