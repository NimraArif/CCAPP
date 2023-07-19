package logic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class loginclass {
	
	WebDriver driver = null; 

	public loginclass(WebDriver driver) {
		this.driver= driver;
	}

	public void login_page(String ChannelPartner , String username , String password) throws InterruptedException {
		
		Thread.sleep(2000);
		
		WebElement channel_partner = driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));

		Thread.sleep(2000);
		channel_partner.click();
	  	Thread.sleep(2000);
	  	channel_partner.sendKeys(ChannelPartner);
	  	channel_partner.sendKeys(Keys.ENTER);
	  	Thread.sleep(1000);
		WebElement username_page = driver.findElement(By.id("username"));

		Thread.sleep(2000);
		username_page.sendKeys(username);
		Thread.sleep(1000);
		
		
		WebElement password_page = driver.findElement(By.id("password"));
		password_page.sendKeys(password);
		Thread.sleep(1000);
		
		WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		login.click();
		
		
	}
}
