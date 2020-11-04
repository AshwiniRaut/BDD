package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class dealsStepDefinition1 {
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
	@Then("^user enters username and password$")
	public void user_enters_username_and_user_enters_password(DataTable credentials)  {
		List<List<String>> dealsCredentials = credentials.raw();
		driver.findElement(By.name("email")).sendKeys(dealsCredentials.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(dealsCredentials.get(0).get(1));
		
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
	
	@Then("^user moves to deals page$")
	public void user_moves_to_deals_page()  {
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id=\"main-nav\"]/a[5]/span")));
		driver.findElement(By.xpath("//div[@id=\"main-nav\"]/a[5]/span")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a[3]/button")));
		driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a[3]/button")).click();
	   
	}

	@Then("^user create new deal$")
	public void user_create_new_deal(DataTable arg1) throws InterruptedException {
		List<List<String>> list=arg1.raw();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("title")));
	   driver.findElement(By.name("title")).sendKeys(list.get(0).get(0));
	   Thread.sleep(1000);
	 /*  driver.findElement(By.xpath("//div[@name='company']")).sendKeys(list.get(0).get(1));
	   Thread.sleep(1000);*/
	   driver.findElement(By.xpath("//input[@name='amount']")).sendKeys(list.get(0).get(2));
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//input[@name='commission']")).sendKeys(list.get(0).get(3));
	   Thread.sleep(1000);
	   WebDriverWait wait1=new WebDriverWait(driver,20);
	   wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")));
	   driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")).click();
	   
	}
	
	@Then("^user close the browser$")
	public void user_close_the_browser() {
		driver.quit();
	
	}

}
