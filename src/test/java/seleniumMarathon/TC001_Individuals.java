/**
 * 
 */
package seleniumMarathon;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

/**
 * 
 */
public class TC001_Individuals {
	
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver;
		String expectedName="Kumar";
		String individualName=null;
		
		
		ChromeOptions options  = new ChromeOptions();
		options.addArguments("--disable-notifications");
	    
		
	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver=new ChromeDriver(options);
		
		driver.get("https://login.salesforce.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Login
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("abiramividuthalaiselvan@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Yazhini@14");
		
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		//menu
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		Thread.sleep(3000);
		
		//view All
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		
		
		//click on Individuals
		WebElement element = driver.findElement(By.xpath("//p[@class='slds-truncate' and text()='Individuals']"));
	      JavascriptExecutor executor = (JavascriptExecutor)driver;
	      executor.executeScript("arguments[0].click();", element);
	      
	   
	      Thread.sleep(10000);
	      WebElement individual=driver.findElement(By.xpath("//a/span[text()='Individuals']/parent::a/following-sibling::one-app-nav-bar-item-dropdown/div//a"));
	      if(individual.isDisplayed())
	    	  executor.executeScript("arguments[0].click();", individual);
	      else {
	    	  driver.findElement(By.xpath("//a/span[text()='More']/parent::a/lightning-icon/span/lightning-primitive-icon")).click();
	    	  WebElement indi=driver.findElement(By.xpath("//a[@role='menuitem']/span/span[text()='Individuals']"));
	    	  executor.executeScript("arguments[0].click();", indi);
	    	  individual.click();
	      }
	    	  
	      
	      //driver.findElement(By.xpath("(//*[@class='slds-icon slds-icon-text-default slds-icon_xx-small'])[3]")).click();
	      //click on New Individuals
	      executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[text()='New Individual']")));
	      
	      
	      //switch to window
	      String newIndividualWindow=driver.getWindowHandle();
		  driver.switchTo().window(newIndividualWindow);
	      
	      //enter last name
	      driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(expectedName);
	      
	      //click save
	      driver.findElement(By.xpath("//button[@title='Save']")).click();
	      
	      //parent window
	      driver.switchTo().defaultContent();
	      
	      
	      //verify created individual name
	      individualName=driver.findElement(By.xpath("//div[@class='slds-media__body']/h1/div[2]")).getText();
	      
	     if(individualName.equals(expectedName))
	    	 System.out.println("Individual Created"+individualName);
	     else
	    	 System.out.println("Individual not created");
	     
	     driver.close();
		
	}

}
