package test;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


@RunWith(value = Parameterized.class)
public class NewAccountDDT {

	String name, email, phone, gender, password, country;
	
	boolean weeklyEmail, monthlyEmail, occasionalEmail;

	//run this first
	@Test
	public void newAccountTest() {
		System.out.println("thename: " + name + "   " + "theemail: " + email + phone + gender + password + country + weeklyEmail + monthlyEmail + occasionalEmail);

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		driver.findElement(By.linkText("CREATE ACCOUNT")).click();
		
		//declare elements
		WebElement nameElement = driver.findElement(By.name("ctl00$MainContent$txtFirstName"));
		WebElement emailElement = driver.findElement(By.id("MainContent_txtEmail"));
		WebElement phoneElement = driver.findElement(By.xpath("//*[@id=\"MainContent_txtHomePhone\"]"));
		WebElement passwordElement = driver.findElement(By.cssSelector("[id='MainContent_txtPassword'][name='ctl00$MainContent$txtPassword']"));
		WebElement verifypasswordElement =driver.findElement(By.name("ctl00$MainContent$txtVerifyPassword"));
		WebElement weeklyElement = driver.findElement(By.id("MainContent_checkWeeklyEmail"));
		WebElement maleRadio = driver.findElement(By.id("MainContent_Male"));
		WebElement femaleRadio = driver.findElement(By.id("MainContent_Female"));
		WebElement submitElement = driver.findElement(By.id("MainContent_btnSubmit"));
		
		//fill out form
		nameElement.sendKeys(name);
		emailElement.sendKeys(email);
		phoneElement.sendKeys(phone);
		passwordElement.sendKeys(password);
		verifypasswordElement.sendKeys(password);
		
		
		//radio button
		if(gender.equalsIgnoreCase("Male")) {
			maleRadio.click();
		}else{
			femaleRadio.click();
		}
		
		//select country
		new Select(driver.findElement(By.name("ctl00$MainContent$menuCountry"))).selectByVisibleText(country);
		//checkbox
		driver.findElement(By.id("MainContent_checkWeeklyEmail")).click();
		//submit
		submitElement.click();
	}
	
	
	//every time you run test, you run this parameter
	@Parameters
	public static List<String[]> getData(){
		//fetch data
		return utilities.CSV.get("C:\\Users\\ychan\\Desktop\\automation\\original.csv");
	}
	
	//constructor that pass parameter to test method
	public NewAccountDDT(String name, String email, String phone, String gender, String password, String country, String weeklyEmail, String monthlyEmail, String occasionalEmail) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.password = password;
		this.country = country;
		
		if(weeklyEmail.equals("True")) {
			this.weeklyEmail = true;
		}else {
			this.weeklyEmail = false;
		}
		
		if(weeklyEmail.equals("True")) {
			this.monthlyEmail = true;
		}else {
			this.monthlyEmail = false;
		}
		
		if(weeklyEmail.equals("True")) {
			this.occasionalEmail = true;
		}else {
			this.occasionalEmail = false;
		}
	}
}
