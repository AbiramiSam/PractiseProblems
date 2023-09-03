/**
 * 
 */
package seleniumMarathon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * 
 */
public class TC002_Individuals {
	
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver;
		String expectedName="Ganesh Kumar";
		String individualName=null;
		
		
		ChromeOptions options  = new ChromeOptions();
		options.addArguments("--disable-notifications");
	    
		
	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver=new ChromeDriver(options);
		
		//Lauch URL:
		driver.get("https://login.salesforce.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Login
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("abiramividuthalaiselvan@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Yazhini@14");
		
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		//menu
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		//Thread.sleep(3000);
		
		//view All
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		
		
		//click on Individuals
		WebElement element = driver.findElement(By.xpath("//p[@class='slds-truncate' and text()='Individuals']"));
	      JavascriptExecutor executor = (JavascriptExecutor)driver;
	      executor.executeScript("arguments[0].click();", element);
	      
	      Thread.sleep(5000);
	      
			/*
			 * WebElement individual=driver.findElement(By.xpath(
			 * "//a/span[text()='Individuals']/parent::a/following-sibling::one-app-nav-bar-item-dropdown/div//a"
			 * )); if(individual.isDisplayed()) individual.click(); else {
			 * driver.findElement(By.xpath(
			 * "//a/span[text()='More']/parent::a/lightning-icon/span/lightning-primitive-icon"
			 * )).click(); driver.findElement(By.xpath(
			 * "//a[@role='menuitem']/span/span[text()='Individuals']")).click();
			 * individual.click(); }
			 */
	      
	      //search Kumar text
	      driver.findElement(By.xpath("//input[@name='Individual-search-input']")).sendKeys("Kumar",Keys.ENTER);
	      
	      Thread.sleep(5000);
	      
	      //click dropdown
	      driver.findElement(By.xpath("(//td[@class='slds-cell-edit cellContainer']/span/div/a)[1]")).click();
	      
	      Thread.sleep(5000);
	      
	      //Click on Edit
	      driver.findElement(By.xpath("(//body[@class='desktop']/div[8]/div/ul/li/a)[1]")).click();
	      
	      //switch to window
	      String newIndividualWindow=driver.getWindowHandle();
		  driver.switchTo().window(newIndividualWindow);
		  
		  //Click Salutations dropdown
		  driver.findElement(By.xpath("(//div[@class='uiPopupTrigger'])[2]")).click();
		  
		  //Click Mr.
		  driver.findElement(By.xpath("//li[@class='uiMenuItem uiRadioMenuItem']/a[text()='Mr.']")).click();
		  
		  //Enter First Name Ganesh
		  driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Ganesh",Keys.ENTER);
		  
		  
		  //click save
	      driver.findElement(By.xpath("//button[@title='Save']")).click();
	      
	      //parent window
	      driver.switchTo().defaultContent();
	    	
	      Thread.sleep(3000);
	      
	      driver.navigate().refresh();
	      
	      Thread.sleep(5000);
	      
	    //verify created individual name
	     individualName=driver.findElement(By.xpath("(//a[@data-refid='recordId'])[1]")).getText();
	     System.out.println(individualName);
	      
	     if(individualName.equals(expectedName))
	    	 System.out.println("Individual Name"+individualName);
	     else
	    	 System.out.println("Individual not created");
	     
	     driver.close();
	}


}
