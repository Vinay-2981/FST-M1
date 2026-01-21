package HelloSelinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class activity_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		Actions builder = new Actions (driver);
		driver.get("https://training-support.net/webelements/drag-drop");
		System.out.println("Title is :" +driver.getTitle());
		
		WebElement Football = driver.findElement(By.id("ball"));
		WebElement Dropzone1 = driver.findElement(By.id("dropzone1"));
		WebElement Dropzone2 = driver.findElement(By.id("dropzone2"));
		
		builder.dragAndDrop(Football, Dropzone2).pause(5000).build().perform();
		if(Dropzone2.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
        	System.out.println("Ball was dropped in Dropzone 2");
		}	
        builder.dragAndDrop(Football, Dropzone1).pause(5000).build().perform();
    	if(Dropzone2.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
            	System.out.println("Ball was dropped in Dropzone 1");
    	}
    	
    	driver.quit();
		
		
		

	}

}
