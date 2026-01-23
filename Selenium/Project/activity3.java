package ProjectSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get ("https://alchemy.hguy.co/jobs/");
		System.out.println("Title Page is : " +driver.getTitle());
		String url = driver.findElement(By.tagName("img")).getAttribute("src");
		System.out.println("Url of the image is :"+url);
		driver.close();

	}

}
