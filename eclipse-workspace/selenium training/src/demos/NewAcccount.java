package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class NewAcccount{

	public static void main(String[] args) {
		String name = "James";
		String email = "test@gmail.com";
		String password = "12345";
		String country = "Israel";
		String phoneNumber = "6783219874";
		String gender = "Female";
		String weeklyEmail;
		String monthlyEmail;
		String occassionalEmailString;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		
		//click create account
		//chrome brower takes uppercase html
		driver.findElement(By.linkText("CREATE ACCOUNT")).click();
		
		//fill out form
		//name and id is unique so its priority pick
		driver.findElement(By.name("ctl00$MainContent$txtFirstName")).sendKeys(name);
		driver.findElement(By.id("MainContent_txtEmail")).sendKeys(email);
		
		//xpath is item locator (can be changed often)
		driver.findElement(By.xpath("//*[@id=\"MainContent_txtHomePhone\"]")).sendKeys(phoneNumber);
		
		//css selector
		driver.findElement(By.cssSelector("[id='MainContent_txtPassword'][name='ctl00$MainContent$txtPassword']")).sendKeys(password);
		
		driver.findElement(By.name("ctl00$MainContent$txtVerifyPassword")).sendKeys(password);
		
		//radio button
		if(gender.equalsIgnoreCase("Male")) {
			driver.findElement(By.id("MainContent_Male")).click();
		}else {
			driver.findElement(By.id("MainContent_Female")).click();
		}
		//driver.findElement(By.cssSelector("[id='MainContent_Male'][type='radio']")).click();
		
		//drop down menu
		new Select(driver.findElement(By.name("ctl00$MainContent$menuCountry"))).selectByVisibleText(country);
		
		//check box
		driver.findElement(By.id("MainContent_checkWeeklyEmail")).click();
		
		//submit
		driver.findElement(By.id("MainContent_btnSubmit")).click();
		
		//confirmation
		String conf = driver.findElement(By.id("MainContent_lblTransactionResult")).getText();
		System.out.println(conf);
		
		
	}

}

