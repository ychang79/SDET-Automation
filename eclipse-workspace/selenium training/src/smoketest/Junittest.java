/**
 * 
 */
package smoketest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junittest{

	@Test //annotation
	public void Junittest(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "SDET Training | Account Management";
		
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		//Assert.fail("intetntloianly failed");
		
		System.out.println("runnig middle test");
	}

	@Before //run this before @Test
	public void setUp() {
		System.out.println("setting up");
	}
	
	@After
	public void afterMath() {
		System.out.println("after test close");
	}
}
