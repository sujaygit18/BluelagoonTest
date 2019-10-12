package sample;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AutomateBlueLagoon {
	@Test
	public void firstRun() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver76.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://acme-test.uipath.com/account/login");
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementById("buttonLogin").click();
		WebElement vendor = driver.findElementByXPath("(//button[contains(@class,'btn btn-default')])[5]");
		Actions builder = new Actions(driver);
		builder.moveToElement(vendor).perform();
		driver.findElementByLinkText("Search for Vendor").click();
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		driver.findElementById("buttonSearch").click();
		String gName = driver.findElementByXPath("//td[text()='France']").getText();
		System.out.println(gName);
		driver.findElementByLinkText("Log Out").click();
		driver.close(); 
		
		
		
		
		
		
		

	}

}
