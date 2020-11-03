package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.Timeout;
import junit.framework.Assert;

public class loginStepDefinition {
	WebDriver driver;
	
	
	@Given("^User is on login page$")
	public void user_is_on_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome86\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		
	}
	@When("^title of login page is free crm$")
	public void title_login_page_is_free_crm()
	{
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Cogmento CRM", title);
		
	}
	@Then("^user enters \\\"(.*?)\\\" and \\\"(.*?)\\\"$")
	public void user_enters_username_and_user_enters_password(String userName,String passWord)  {
		driver.findElement(By.name("email")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(passWord);
		
	}
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()
	{
		driver.findElement(By.xpath("(//div[@id=\"ui\"]//div[contains(text(),'Login')])[1]")).click();
	}
	
	@Then("^user is on homepage$")
	public void user_is_on_homepage() {
		String homepageTitle=driver.getTitle();
		System.out.println(homepageTitle);
	}
	@Then("^user moves to create new contact page$")
	public void user_moves_to_create_new_contact_page()  {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main-nav']/a[3]/span")));
		driver.findElement(By.xpath("//*[@id='main-nav']/a[3]/span")).click();
		
	    
	}

	@Then("^user is on create new contact page$")
	public void user_is_on_create_new_contact_page()  {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")));
		driver.findElement(By.xpath("//div[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")).click();
	  
	}
	@Then("^user enters contact details \\\"(.*?)\\\" and \\\"(.*?)\\\" and \\\"(.*?)\\\"$")
	public void user_enters_contact_details(String firstname,String lastname,String position)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("first_name"))));
		driver.findElement(By.name("first_name")).sendKeys(firstname);
		driver.findElement(By.name("last_name")).sendKeys(lastname);
		driver.findElement(By.name("position")).sendKeys(position);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//div[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]"))));
		driver.findElement(By.xpath("//div[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")).click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
	}

	
	@Then("^user close the browser$")
	public void user_close_the_browser() {
		driver.quit();
	
	}
}
