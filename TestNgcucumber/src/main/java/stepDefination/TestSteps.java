package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	
	public static WebDriver driver;
	
	@Given("^Enter gmail URL$")
	public void Enter_gmail_URL() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");		
		Thread.sleep(5000);
		driver=new ChromeDriver();
  	}	
	
	@When("^Enter User ID and Click$")
	public void Enter_User_ID_and_Click() throws Throwable {
		Thread.sleep(5000);
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("85sachin");
		driver.findElement(By.xpath("//*[@id='identifierNext']/span/span")).click();
	}
	
	@Then("^Enter Password ID and Click$")
	public void Enter_Password_ID_and_Click() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("golmaal2016");
		driver.findElement(By.xpath("//*[@id='passwordNext']/span/span")).click();	
	}	
}
