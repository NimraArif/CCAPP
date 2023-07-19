package logic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DamageDevice {
	WebDriver driver = null; 

	
	
	
  public DamageDevice(WebDriver driver) {
		// TODO Auto-generated constructor stub
	  this.driver = driver;
	}
 public void damage_detail_screen(String fault  , String nature, String cut_comments) throws InterruptedException {
	 Thread.sleep(3000);
	  	
	 WebElement fault_drp = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main[1]/section[1]/section[2]/section[1]/app-createticket[1]/ng-wizard[1]/div[1]/div[1]/ng-wizard-step[3]/div[1]/app-third-step[1]/section[1]/div[1]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]"));
	 fault_drp.sendKeys(fault);
	  	fault_drp.sendKeys(Keys.ENTER);
	  	  Thread.sleep(3000);
	
		  WebElement dates = driver.findElement(By.xpath("//input[@id='date-of-incident']"));
		dates.sendKeys("03/01/2023, 5:00 AM");
	  	  Thread.sleep(3000);
		
	  	
		  
		  Thread.sleep(3000);
		  WebElement comments = driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/section[1]/section[2]/section[1]/app-createticket[1]/ng-wizard[1]/div[1]/div[1]/ng-wizard-step[3]/div[1]/app-third-step[1]/section[1]/div[1]/div[2]/div[2]/div[1]/textarea[1]"));
		  comments.sendKeys(cut_comments);
		  
		  Thread.sleep(3000);
		  WebElement nature_defects = driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/section[1]/section[2]/section[1]/app-createticket[1]/ng-wizard[1]/div[1]/div[1]/ng-wizard-step[3]/div[1]/app-third-step[1]/section[1]/div[1]/div[1]/div[2]/div[1]/textarea[1]"));
		  nature_defects.sendKeys(nature);  
		  Thread.sleep(3000);
		  
		  WebElement check1 = driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/section[1]/section[2]/section[1]/app-createticket[1]/ng-wizard[1]/div[1]/div[1]/ng-wizard-step[3]/div[1]/app-third-step[1]/section[1]/div[1]/div[2]/div[3]/div[1]/mat-checkbox[1]/label[1]/span[1]"));
		  check1.click();
		  WebElement check2 = driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/section[1]/section[2]/section[1]/app-createticket[1]/ng-wizard[1]/div[1]/div[1]/ng-wizard-step[3]/div[1]/app-third-step[1]/section[1]/div[1]/div[2]/div[3]/div[2]/mat-checkbox[1]/label[1]/span[1]"));
		  check2.click();
		  WebElement check3 = driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/section[1]/section[2]/section[1]/app-createticket[1]/ng-wizard[1]/div[1]/div[1]/ng-wizard-step[3]/div[1]/app-third-step[1]/section[1]/div[1]/div[2]/div[3]/div[3]/mat-checkbox[1]/label[1]/span[1]"));
		  check3.click();
		  WebElement check4 = driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/section[1]/section[2]/section[1]/app-createticket[1]/ng-wizard[1]/div[1]/div[1]/ng-wizard-step[3]/div[1]/app-third-step[1]/section[1]/div[1]/div[2]/div[3]/div[4]/mat-checkbox[1]/label[1]/span[1]"));
		  check4.click();
		  Thread.sleep(3000);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,1000)");
		  Thread.sleep(3000);
		  	WebElement next = driver.findElement(By.xpath("//body/app-root[1]/app-main[1]/section[1]/section[2]/section[1]/app-createticket[1]/ng-wizard[1]/div[1]/div[2]/div[1]/button[2]"));
			  Thread.sleep(1000);
		  	next.click();
	
}
}
