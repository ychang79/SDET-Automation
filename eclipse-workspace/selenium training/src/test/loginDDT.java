package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginDDT {

	@Test (dataProvider = "getData")
	public void loginTest(String name, String email, String password) {
		//System.out.println("new record" + name + " " + email + " " + password);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		
		driver.findElement(By.id("MainContent_txtUserName")).sendKeys(email);
		driver.findElement(By.id("MainContent_txtPassword")).sendKeys(password);
		driver.findElement(By.name("ctl00$MainContent$btnLogin")).click();
		
		String conf = driver.findElement(By.id("conf_message")).getText();
		System.out.println(conf);
	}
	
	@DataProvider
	public String[][] getData(){
		return utilities.Excel.get("C:\\Users\\ychan\\Desktop\\automation\\original.xls");
	}
}
