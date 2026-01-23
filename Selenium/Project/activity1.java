package ProjectSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.testng.Assert.assertEquals;

public class activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get ("https://alchemy.hguy.co/jobs/");
		System.out.println("Title Page is : " + driver.getTitle());
		assertEquals(driver.getTitle(), "Alchemy Jobs – Job Board Application");
		driver.close();

	}

	
	}


