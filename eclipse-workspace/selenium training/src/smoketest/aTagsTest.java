package smoketest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class aTagsTest {

	@Test  //testng annotation
	public void userlogin() {
		
		System.out.println("running test");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		
		//test presence of a tags
		List <WebElement> alist = (List<WebElement>) driver.findElement(By.tagName("a"));
		for(WebElement alist1: alist) {
			System.out.println(alist1.getText());
		}
		
	}
	
	@BeforeMethod
	public void setup() {
		System.out.println("starting prestepp");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("closing browser");
	}
}
