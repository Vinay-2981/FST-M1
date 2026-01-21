package HelloSelinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Open the training support site. (https://training-support.net)
		//Print the title of the page
		//Click the about us button
		//Print the title of the new page
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net");
		System.out.println("Page title is:" +driver.getTitle());
		driver.findElement(By.linkText("About Us")).click();
		System.out.println("New Page title is:" +driver.getTitle());	
		driver.quit();
		
	}

}
