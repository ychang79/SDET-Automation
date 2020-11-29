package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Expedia {
	
	@Test
	public void hotelReserve() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.expedia.com/");
		
		//wait before throsws an error. it prevents accessing element before element become available
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//1 search
		driver.findElement(By.id("tab-hotel-tab-hp")).click();
		driver.findElement(By.id("hotel-destination-hp-hotel")).sendKeys("New York, New York");
		driver.findElement(By.id("hotel-checkin-hp-hotel")).clear();
		driver.findElement(By.id("hotel-checkin-hp-hotel")).sendKeys("06/16/2020");
		driver.findElement(By.id("hotel-checkout-hp-hotel")).clear(); //clear text
		driver.findElement(By.id("hotel-checkout-hp-hotel")).sendKeys("06/26/2020");
		driver.findElement(By.xpath("//*[@id=\"gcw-hotel-form-hp-hotel\"]/div[12]/label/button")).click();
		
		
		//2 modify search result page, give credential
		driver.findElement(By.cssSelector("input[name='popularFilter'][id='popularFilter-0-129440'][value='129440']")).click();
		
		
		//3 analyze the result and make selection
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div/div[1]/main/div/div/div[2]/section[2]/ol/li[5]/div/div/a")).click();
		
		
		//4 book reservation
		
		//fill out contact / billing
		
		//get confermation
	}
}
