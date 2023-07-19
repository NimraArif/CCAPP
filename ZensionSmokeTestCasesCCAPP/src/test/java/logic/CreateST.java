package logic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreateST {
	WebDriver driver = null; 

	public CreateST(WebDriver driver) {
		this.driver= driver;
	}

	
	public void IMEI_Validity_Fun(String IMEI_Number) throws InterruptedException {
		
		Thread.sleep(2000);
		
		WebElement create_button = driver.findElement(By.xpath("//button[contains(text(),'Create Service Ticket')]"));

		Thread.sleep(2000);
		create_button.click();
		Thread.sleep(2000);
		
		WebElement IMEI = driver.findElement(By.name("imei"));
		IMEI.sendKeys(IMEI_Number);
		
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
		
		Thread.sleep(000);
		
		submit.click();
		
		
		Thread.sleep(5000);
	}
	
	public void next_check() throws InterruptedException
	{
		WebElement next = driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/section[1]/section[2]/section[1]/app-createticket[1]/ng-wizard[1]/div[1]/div[2]/div[1]/button[2]"));
		Thread.sleep(2000);
		next.click();
		
	}
	
	public void cancel () throws InterruptedException
	{
		WebElement next = driver.findElement(By.xpath("//button[contains(text(),'Cancel')]"));
		Thread.sleep(2000);
		next.click();
	}
}
