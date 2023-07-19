package logic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DeviceCustomer {
	WebDriver driver = null; 

	public DeviceCustomer(WebDriver driver) {
		this.driver= driver;
	}

	
	
	public void next_check() throws InterruptedException
	{
		WebElement next = driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/section[1]/section[2]/section[1]/app-createticket[1]/ng-wizard[1]/div[1]/div[2]/div[1]/button[2]"));
		Thread.sleep(2000);
		next.click();
		Thread.sleep(2000);
	}
}
