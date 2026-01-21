package HelloSelinium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/alerts");
		System.out.println("Page title: " + driver.getTitle());
		
		driver.findElement(By.id("confirmation")).click();
		Alert confirmAlert = driver.switchTo().alert();
		
		String alertText = confirmAlert.getText();
        System.out.println("Text in alert: " + alertText);
        confirmAlert.accept();
        
        System.out.println(driver.findElement(By.id("result")).getText());
        
        driver.quit();

	}

}
