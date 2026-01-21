package HelloSelinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("Title is:" + driver.getTitle());
		
		WebElement TextBox = driver.findElement(By.id("textInput"));
		System.out.println("Element is enabled:" + TextBox.isEnabled());
		driver.findElement(By.id("textInputButton")).click();
		System.out.println("Element is enabled:" + TextBox.isEnabled());
		TextBox.sendKeys("Input");
		System.out.println(TextBox.getDomProperty("value"));
		driver.quit();
		

	}

}
