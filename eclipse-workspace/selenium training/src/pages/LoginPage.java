package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	//constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setUserName(String username) {
		driver.findElement(By.id("MainContent_txtUserName")).sendKeys(username);
	}
	
	public void setPassword(String userpassword) {
		driver.findElement(By.id("MainContent_txtPassword")).sendKeys(userpassword);
	}
	
	public void clickSubmit() {
		driver.findElement(By.id("MainContent_btnLogin")).click();
	}
	
	
}