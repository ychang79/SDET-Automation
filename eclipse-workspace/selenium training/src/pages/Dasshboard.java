package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dasshboard {
	WebDriver driver;
	
	public Dasshboard(WebDriver driver) {
		this.driver = driver;
	}
	
	public void changePassword() {
		driver.findElement(By.linkText("Change password")).click();
	}
	
	public String confirmationMSG() {
		return driver.findElement(By.id("conf_message")).getText();
	}
}
