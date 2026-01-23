package ProjectSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class activity7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/");
		driver.findElement(By.linkText("Post a Job")).click();
		driver.findElement(By.id("create_account_email")).sendKeys("abc3@gmail.com");
		driver.findElement(By.name("job_title")).sendKeys("Test Automation1");
		Select dropdown = new Select(driver.findElement(By.id("job_type")));
		dropdown.selectByVisibleText("Internship");
		driver.switchTo().frame("job_description_ifr");
		  driver.findElement(By.xpath("//*[@id='tinymce']")).sendKeys("tets");
		  driver.switchTo().defaultContent();  
		driver.findElement(By.id("application")).sendKeys("https://alchemy.hguy.co/jobs/");
		driver.findElement(By.id("company_name")).sendKeys("Alchemy.com");
		driver.findElement(By.id("company_website")).sendKeys("https://alchemy.hguy.co/jobs/");
		driver.findElement(By.id("company_tagline")).sendKeys("Automation Tester");
		driver.findElement(By.id("company_twitter")).sendKeys("Alchemy.com");
		driver.findElement(By.className("button")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("job_preview_submit_button")).click();
		
		driver.findElement(By.linkText("Jobs")).click();
		driver.findElement(By.id("search_keywords")).sendKeys("Test Automation1");
		
		driver.findElement(By.xpath("//input[@value ='Search Jobs']")).click();
		
		
		List<WebElement> jobopenings = driver.findElements(By.xpath("//ul[@class='job_listings']"));
		
		String title = jobopenings.get(0).getText();
		
	if (title.equals("Test Automation1"))
	System.out.println("Job Listed :");
		else
		System.out.println("Job not Listed :");	
	}

}
