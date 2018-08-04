package week2day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		Thread.sleep(2000);
		driver.findElementById("password").sendKeys("crmsfa");
		Thread.sleep(2000);
		driver.findElementByClassName("decorativeSubmit").click();
		Thread.sleep(2000);
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(2000);
		driver.findElementByLinkText("Create Lead").click();
		//xpath for findLink
		/*driver.findElementByXPath("(//ul[@class='shortcuts']//a)[3]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		driver.findElementByXPath("(//label[text()='First name:'])[3]/following::input").click();*/
		
		List<WebElement> ddlist = driver.findElementsByTagName("select");
		
		int ddlistSize = ddlist.size();
		
		System.out.println("The ddlistSize is--------->"+ddlistSize);
		
		driver.findElementById("createLeadForm_birthDate-button").click();
		
		  int tableRowSize = driver.findElementsByXPath("//div[@class='calendar']//tr").size();
		  
		  System.out.println("The calender row size "+tableRowSize);
		
	}

}
