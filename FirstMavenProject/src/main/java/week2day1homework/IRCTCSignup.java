package week2day1homework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class IRCTCSignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				//ChromeDriver driver = new ChromeDriver();
				FirefoxDriver driver = new FirefoxDriver();
				driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
				driver.manage().window().maximize();
				driver.findElementById("userRegistrationForm:userName").sendKeys("roor");
				Thread.sleep(2000);
				driver.findElementById("userRegistrationForm:password").sendKeys("crmsfa");
				Thread.sleep(2000);
				driver.findElementById("userRegistrationForm:confpasword").sendKeys("crmsfa");
				
				WebElement source = driver.findElementById("userRegistrationForm:securityQ");
				Select dd = new Select(source);
				List<WebElement> options = dd.getOptions();
				int size = options.size();
				System.out.println("size----------->"+size);
				
				dd.selectByValue("6");
				Thread.sleep(2000);
				driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("honda");
				Thread.sleep(2000);
				driver.findElementById("userRegistrationForm:firstName").sendKeys("deborah");
				Thread.sleep(2000);
				List<WebElement>  oRadioButton = driver.findElements(By.name("userRegistrationForm:gender"));
						  
				  oRadioButton.get(1).click();
				 
				 Thread.sleep(2000);
				 List<WebElement>  maritalStatus = driver.findElements(By.name("userRegistrationForm:maritalStatus"));
				  
				 maritalStatus.get(1).click();
				  
				 Thread.sleep(2000);
				 
				 WebElement dob_day = driver.findElementById("userRegistrationForm:dobDay");
				 Select dobday = new Select(dob_day); 
				 dobday.selectByValue("01");
				 WebElement dob_month = driver.findElementById("userRegistrationForm:dobMonth");
				 Select dobmonth = new Select(dob_month); 
				 dobmonth.selectByValue("OCT");
				 WebElement dob_year = driver.findElementById("userRegistrationForm:dateOfBirth");
				 Select dobyear = new Select(dob_year); 
				 dobyear.selectByValue("1987");
				 
				driver.findElementById("userRegistrationForm:occupation").click();	
				
				
				/*driver.findElementByLinkText("CRM/SFA").click();
				Thread.sleep(2000);
				driver.findElementByLinkText("Create Lead").click();
				
				driver.findElementById("createLeadForm_companyName").sendKeys("Rehoboth");
				Thread.sleep(2000);
				driver.findElementById("createLeadForm_firstName").sendKeys("venkat");
				Thread.sleep(2000);
				driver.findElementById("createLeadForm_lastName").sendKeys("krishnan");
				Thread.sleep(2000);
				
				driver.findElementByClassName("smallSubmit").click();
				//driver.findElementByLinkText("Logout").click();
				
				WebElement source = driver.findElementById("createLeadForm_dataSourceId");
				Select dd = new Select(source);
				List<WebElement> options = dd.getOptions();
				int size = options.size();
				System.out.println("size----------->"+size);
				
				dd.selectByValue("LEAD_PR");
				
				
				
				for(WebElement eachopt : options) {
					
					System.out.println("----------->"+eachopt.getText()); 
				}
				
				WebElement market = driver.findElementById("createLeadForm_marketingCampaignId");
				Select ma = new Select(market);
				List<WebElement> marketopt = ma.getOptions();
				int msize = marketopt.size();
				System.out.println("size----------->"+msize);
				ma.selectByIndex(msize-2);
				
				
		*/
		
	}

}
