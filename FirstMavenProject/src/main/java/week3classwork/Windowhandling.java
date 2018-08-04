package week3classwork;

import java.util.*;

import org.openqa.selenium.chrome.ChromeDriver;

class Windowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.manage().window().maximize();
		
		driver.findElementByLinkText("Contact Us").click();
		Set<String> window =  driver.getWindowHandles();
		List<String> listofwin = new ArrayList<String>();
		listofwin.addAll(window);
		
		driver.switchTo().window(listofwin.get(1));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(listofwin.get(0));
		driver.close();
	
		

	}

}
