package logic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class pickupdetails {
	WebDriver driver = null; 
	
	public pickupdetails(WebDriver driver) {
		this.driver= driver;
	
	}
	
	public void customer_details(String name , String customer_contact , String street , String house , String landmark , String building , String district , String city) throws InterruptedException {
		
		WebElement Name = driver.findElement(By.xpath("//input[@id='customer_name']"));
		Thread.sleep(3000);
		Name.sendKeys(name);
		Thread.sleep(3000);
	  	  WebElement contact = driver.findElement(By.xpath("//input[@id='custom-number']"));
	  	contact.sendKeys(customer_contact);
	  	Thread.sleep(3000);
	  	WebElement street_no = driver.findElement(By.xpath("//input[@id='district']"));
	  	street_no.sendKeys(street);
	  	Thread.sleep(3000);
	  	
	  	WebElement house_num = driver.findElement(By.xpath("//input[@id='pickup_address_unit_house_apartment_number']"));
	  	house_num.sendKeys(house);
	  	Thread.sleep(3000);
		
		WebElement landmarknumber = driver.findElement(By.xpath("//input[@id='pickup_address_nearest_landmark']"));
		landmarknumber.sendKeys(landmark);
	  	Thread.sleep(3000);
	  	
	  	WebElement building_num = driver.findElement(By.xpath("//input[@id='pickup_address_building_number']"));
	  	building_num.sendKeys(landmark);
	  	Thread.sleep(3000);
		
	  	WebElement distict_field = driver.findElement(By.xpath("//input[@id='pickup_address_state']"));
	  	distict_field.sendKeys(district);
	  	Thread.sleep(3000);
	  	
	  	WebElement city_drp = driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/section[1]/section[2]/section[1]/app-createticket[1]/ng-wizard[1]/div[1]/div[1]/ng-wizard-step[4]/div[1]/app-fourth-step[1]/section[1]/div[2]/div[12]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]"));
	  	city_drp.click();
	  	city_drp.sendKeys(city);
	  	city_drp.sendKeys(Keys.ENTER);
	  	Thread.sleep(3000);
		  	WebElement next = driver.findElement(By.xpath("//button[contains(text(),'Finish')]"));
		  	next.click();
	}
}
