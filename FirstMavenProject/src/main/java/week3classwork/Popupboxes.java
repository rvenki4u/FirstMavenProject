package week3classwork;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popupboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		//Goto the iframe of popup button
		//driver.switchTo().frame("iframeResult");
		//clicking tryit button
		//driver.findElementByXPath("//button[text()='Try it']").click();
		List<WebElement> we = driver.findElements(By.tagName("iframe"));
		//we.get(1).findElements("//button[text()='Try it']")
		//driver.findElementByXPath("//button[text()='Try it']").click();
		//going to popup
		Alert alert = driver.switchTo().alert();
		String name = alert.getText();
		System.out.println("name--------->"+name);
		alert.sendKeys("hari");
		alert.accept();
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().sendKeys("prabhakar");
		driver.close();
	}

}
