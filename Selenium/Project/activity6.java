package ProjectSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/");
		driver.findElement(By.linkText("Jobs")).click();
		driver.findElement(By.id("search_keywords")).sendKeys("Banking");
		//driver.findElement(By.className("full-time"));
		driver.findElement(By.xpath("//input[@value ='Search Jobs']")).click();
		//List jobopenings = driver.findElements(By.xpath("//*[@class='job_listings']/li"));
		List<WebElement> jobopenings = driver.findElements(By.xpath("//ul[@class='job_listings']"));
		//*[@id="post-7"]/div/div/ul/li[1]/a/div[1]/h3
		//driver.findElement(By.linkText("Senior Banking")).click();
		jobopenings.get(0).click();
		
		driver.findElement(By.xpath("//input[@value = 'Apply for job']")).click();
		String email=driver.findElement(By.className("job_application_email")).getText();
		System.out.println("Print Email:" +email);
		driver.close();
		
		
		
	}
	

}
