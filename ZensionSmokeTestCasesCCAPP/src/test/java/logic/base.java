package logic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class base {
	
	static WebDriver driver ; 
	  public static WebDriver launchbowoser() {
	 String baseUrl = "https://preprod.zensionksacc.com/#/sign-in";
	 String driverPath = "C:\\Users\\nimra.arif\\eclipse-workspace\\GradingPortal\\chromedriver.exe";
	   
	    System.setProperty("webdriver.chrome.driver", driverPath);
	 
	    ChromeOptions options = new ChromeOptions();
	    ChromeDriver driver = new ChromeDriver(options);
	    
		   // driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get(baseUrl);
			return driver;
}
}
