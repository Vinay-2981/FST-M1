package ProjectSelenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get ("https://alchemy.hguy.co/jobs/");
		System.out.println("Title page is : " +driver.getTitle());
		WebElement heading = driver.findElement(By.className("entry-title"));
		String Expectedheading=heading.getText();
		assertEquals(Expectedheading, "Welcome to Alchemy Jobs");
		String header = "Welcome to Alchemy Jobs";
		if(Expectedheading.equals(header) )	
		{
			System.out.println("Title matches");	

		}
		else
		{
			System.out.println("Title  does not matches");	
	}
		driver.close();
		
		

	}

}
