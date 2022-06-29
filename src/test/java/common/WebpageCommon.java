package common;

import org.openqa.selenium.By;

import resources.utility.TestBase;

public class WebpageCommon extends TestBase {
	
	public static String pagetitle = "//div//h3";
	
	public String getpagetitle()
	{
		String pageTitle = driver.findElement(By.xpath(pagetitle)).getText();
		return pageTitle;
	}

}
