/**
 * 
 */
package seleniumHomeWork;

import java.security.Timestamp;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 16-Au-2023
 * 
 * ===========
1. Login to https://login.salesforce.com
Username :hari.radhakrishnan@qeagle.com
Password :Leaf$1234
2. Click on toggle menu button from the left corner
3. Click view All and click Sales from App Launcher
4. Click on Accounts tab 
5. Click on New button
6. Enter 'your name' as account name                                           
7. Click save 
 * 
 * 
 * 
 */
public class SalesForceLogin {

	@Test
	public void salesForceLogin() throws Exception{
		ChromeDriver driver;
		ChromeOptions options  = new ChromeOptions();
		options.addArguments("--disable-notifications");
	    //options.setExperimentalOption("excludeSwitches", "disable-popup-blocking");
		WebDriverManager.chromedriver().setup();
		
	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver=new ChromeDriver(options);
		
		//chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
		driver.get("https://login.salesforce.com");
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf$1234");
		
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		
		
		String childWindow=driver.getWindowHandle();
		driver.switchTo().window(childWindow);
		
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
		//driver.switchTo().defaultContent();
		
		//driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		 WebElement element = driver.findElement(By.xpath("//span[text()='Accounts']"));
	      JavascriptExecutor executor = (JavascriptExecutor)driver;
	      executor.executeScript("arguments[0].click();", element);
		//driver.findElement(By.xpath("//span[text()='Accounts']")).click();
		
		driver.findElement(By.xpath("//a[@title='New']")).click();
		
		String accountWindow=driver.getWindowHandle();
		driver.switchTo().window(accountWindow);
		
		driver.findElement(By.xpath("//label[text()='Account Name']/following-sibling::div/input")).sendKeys("AbiramiV");
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		driver.close();
		
	}
}
