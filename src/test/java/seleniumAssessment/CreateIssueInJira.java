/**
 * 
 */
package seleniumAssessment;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * 
 */
public class CreateIssueInJira {
	@Test
	public void createIssue() throws InterruptedException {
		ChromeDriver driver;
		ChromeOptions options  = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		
		driver.get("https://api-training.atlassian.net/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//enter username
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@testleaf.com");
		
		//continue
		driver.findElement(By.xpath("//button[@id='login-submit']/span")).click();
		
		//password
		driver.findElement(By.name("password")).sendKeys("India@123");
		
		//login
		driver.findElement(By.xpath("//button[@id='login-submit']/span")).click();
		
		
		//select sdet5
		driver.findElement(By.xpath("//section[@class='sc-1fzefp1-0 iTjhUU']/div[2]/section/div[1]/a")).click();
		
		Thread.sleep(3000);
		
		//click create
		driver.findElement(By.xpath("//button[@id='createGlobalItem']/span")).click();
		
		//switch window
		 String createIssueWindow=driver.getWindowHandle();
		 driver.switchTo().window(createIssueWindow);
		 
		 driver.findElement(By.name("summary")).sendKeys("Abirami_issue");
		 
		 //click create
		 driver.findElement(By.xpath("//button[@form='issue-create.ui.modal.create-form']/span")).click();
		 
		 driver.switchTo().defaultContent();
		 
		 //backlog
		 driver.findElement(By.xpath("//span[@class='css-g7kw2k' and text()='Backlog']")).click();
		 
		 //search
		 driver.findElement(By.xpath("//input[@aria-label='Search backlog']")).sendKeys("Abirami_issue");
		 
		 Thread.sleep(3000);
		
		//get text
		String issueName=driver.findElement(By.xpath("//div[@class='sc-7879o9-0 AtOns']")).getAttribute("aria-label");
		
		
		if(issueName.contains("Abirami_issue"))
			System.out.println("Issue created");
		else
			System.out.println("issue not created");
		
		
		driver.close();
	}

}
