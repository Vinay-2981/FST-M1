package ProjectSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class activity9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.findElement(By.name("wp-submit")).click();
		driver.findElement(By.xpath("//*[@id='menu-posts-job_listing']/a")).click();
		//*[@id="menu-posts-job_listing"]/a
		driver.findElement(By.linkText("Add New")).click();	
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[@aria-label='Close dialog']")).click();
		
		driver.findElement(By.className("editor-post-title__input")).sendKeys("Test Automation1");
		//driver.findElement(By.id("block-ebca1908-f01c-4ec8-87d5-cf92dc99e37f")).sendKeys("Test Automation1");
		
		driver.findElement(By.xpath("//button[text() = 'Publish…']")).click();
		
		driver.findElement(By.xpath("//button[text() = 'Publish']")).click();
		
		driver.findElement(By.xpath("//*[@aria-label='View Posts']")).click();
		

		String title = driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText();
		  System.out.println(title);
		 
		
	}

}
