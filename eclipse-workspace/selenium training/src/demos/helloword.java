package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class helloword {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		
		//click create account
		//chrome brower takes uppercase html
		driver.findElement(By.linkText("CREATE ACCOUNT")).click();
		
		//fill out form
		//name and id is unique so its priority pick
		driver.findElement(By.name("ctl00$MainContent$txtFirstName")).sendKeys("James");
		driver.findElement(By.id("MainContent_txtEmail")).sendKeys("test@gmail.com");
		
		//xpath is item locator (can be changed often)
		driver.findElement(By.xpath("//*[@id=\"MainContent_txtHomePhone\"]")).sendKeys("6783219874");
		
		//css selector
		driver.findElement(By.cssSelector("[id='MainContent_txtPassword'][name='ctl00$MainContent$txtPassword']")).sendKeys("12345");
		
		driver.findElement(By.name("ctl00$MainContent$txtVerifyPassword")).sendKeys("12345");
		
		//radio button
		driver.findElement(By.id("MainContent_Female")).click();
		//driver.findElement(By.cssSelector("[id='MainContent_Male'][type='radio']")).click();
		
		//drop down menu
		new Select(driver.findElement(By.name("ctl00$MainContent$menuCountry"))).selectByVisibleText("Israel");
		
		//check box
		driver.findElement(By.id("MainContent_checkWeeklyEmail")).click();
		
		//submit
		driver.findElement(By.id("MainContent_btnSubmit")).click();
		
		//confirmation
		String conf = driver.findElement(By.id("MainContent_lblTransactionResult")).getText();
		System.out.println(conf);
		
		
	}

}

