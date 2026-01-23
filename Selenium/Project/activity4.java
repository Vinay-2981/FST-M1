package ProjectSelenium;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/");
		System.out.println("Title is :" +driver.getTitle());
		WebElement header2 = driver.findElement(By.xpath("//*[@id='post-16']/div/h2"));
		String expectedtitle = header2.getText();
		assertEquals(expectedtitle, "Quia quis non");
		if(expectedtitle.equals("Quia quis non"))
		{
			System.out.println("Title matches");
			
			driver.close();
		}
		else
			System.out.println("Title does not matches");
							

	}

}
