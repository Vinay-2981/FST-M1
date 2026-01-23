package ProjectSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/");
		System.err.println("Page Title is : "+ driver.getTitle());
		driver.findElement(By.linkText("Jobs")).click();
		String jobtitle = driver.getTitle();
		System.out.println("Job title is :" + jobtitle);
		driver.close();
		
	}

}
