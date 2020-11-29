package test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Dasshboard;
import pages.LoginPage;

public class LoginPOM {

	@Test
	public void LoginPOMframe(){
		//1. initialize driver
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		
		//2. enter login credential (login page)
		
		LoginPage logins = new LoginPage(driver);
		
		logins.setUserName("ep@testemail.com");
		logins.setPassword("ep1password");
		logins.clickSubmit();
		
		//3. get confirmation (Dashboard page)
		Dasshboard dashy = new Dasshboard(driver);
		
		String confmsg = dashy.confirmationMSG();
		System.out.println(confmsg);
		
		//assertion
		Assert.assertFalse(confmsg.contains("success"));
	}

}
