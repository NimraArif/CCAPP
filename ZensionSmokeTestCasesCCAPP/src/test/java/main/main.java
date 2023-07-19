package main;

import java.util.List;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import logic.base;
import logic.loginclass;
import logic.CreateST;
import logic.DeviceCustomer;
import logic.DamageDevice;
import logic.pickupdetails;

public class main {
	loginclass login1;
	 base basech;
	 CreateST st;
	 DamageDevice Damage;
	 DeviceCustomer dc;
	 pickupdetails pick;
	   JavascriptExecutor js;

	// grade ungraded_screen;

  private WebDriver driver;		
  
	
	@BeforeTest
	public void launch() {
		  // Reporter.log("We are going to login");
		    driver = base.launchbowoser();
	        login1 = new loginclass(driver);
	        st = new CreateST(driver);
	        js = (JavascriptExecutor) driver;
	        dc = new DeviceCustomer(driver);
	        Damage = new DamageDevice(driver);
	        pick =  new  pickupdetails(driver);
	       // ungraded_screen = new grade(driver);
	        
	    }
	
	 @Test(priority = 0)
	    public void Successfull_Login() throws InterruptedException {
	  	  
		 login1.login_page("Virgin Megastore","Lamiaa.Abdullah" , "123");
	  	 String title = "Call Center Application"; 
	  	 String actual = driver.getTitle();
	  	 
	 if(!title.equals(actual)) {
		 System.out.println("Failed!!!");
	
	 }
	 else {
		 System.out.println("PASS");
			
		 Reporter.log("Login is successfull");
	  	
	    }
	 }
	 @Test(priority = 1)
	    public void CreateST() throws InterruptedException {
	  	  
		 st.IMEI_Validity_Fun("356310708182095");	  
		 Thread.sleep(5000);
	    /*String url =  driver.getCurrentUrl();
	    Thread.sleep(10000);
	    js.executeScript("window.scrollBy(0,1000)");
	   
		Thread.sleep(5000);
		 Boolean check = checkNextButtonExists (driver, url);
		 
		 if (check == true) {
			 
			 st.next_check();
		 }
	
		 
		 //boolean check = validateToastMessageAppearance("Device is Eligible");
		 else {
			 System.out.println("Fail");
			 st.cancel();}
		 }*/
		 Thread.sleep(5000);
		 st.next_check();
		 Thread.sleep(2000);
	 }
		 
		 
		 
	
	/* if(check) {
		 System.out.println("Pass!!!");
		 
			st.next_check();
	
	 }
	 else {
		 System.out.println("Fail");
		 st.cancel();}
	 }
	 */
	 
	 @Test(priority = 2)
	    public void DeviceCustomer() throws InterruptedException {
		 Thread.sleep(2000);
		 dc.next_check();
	 }
	 @Test(priority = 5)
	    public void Damage() throws InterruptedException {
		 	Damage.damage_detail_screen("Touchscreen", "Severe", "Tested");
	 }
	 @Test(priority = 6)
	 public void pick() throws InterruptedException {
		  	
		  	pick.customer_details("nimra","+32132130000", "34", "10 B", "RT", "3", "Punjab", "Riyadh");
		  
		  }
	 
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}
	
	public boolean validateToastMessageAppearance(String message) throws InterruptedException{
		Thread.sleep(10000);
		WebElement msg = driver.findElement(By.id("//body/div[1]/div[1]/div[1]"));
		String toastMessage = msg.getText();
		boolean messageMatches = toastMessage.equals(message);
		return messageMatches;
	}
	 public int countButtons() {
		 
		 List<WebElement> buttons = driver.findElements(By.xpath("//body/app-root[1]/app-main[1]/section[1]/section[2]/section[1]/app-createticket[1]/ng-wizard[1]/div[1]/div[2]"));

	        // Get the count of the buttons
	        int buttonCount = buttons.size();
	        return buttonCount;
	 }

		    public static boolean checkNextButtonExists(WebDriver driver2, String url) {
		 

		        boolean buttonExists;
		        try {
		        	driver2.findElement(By.xpath("//button[contains(text(),'Next')]"));
		            buttonExists = true;
		        } catch (NoSuchElementException e) {
		            buttonExists = false;
		        }
		        System.out.println("Hi, Next Button " + buttonExists);
		        return buttonExists;
		    }
	
}
