package activities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;


public class Activity1 {

	AppiumDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setUp() throws MalformedURLException, URISyntaxException {
		//set file path
		File appfile = new File("src/test/resources/Calculator.apk");
		//Capabilities
		UiAutomator2Options caps = new UiAutomator2Options();
		caps.setPlatformName("android");
		caps.setAutomationName("UiAutomator2");
		caps.setApp(appfile.getAbsolutePath());
		caps.noReset();
		
		URL serverUrl = new URI("http://localhost:4723").toURL();
		driver = new AndroidDriver(serverUrl,caps);
		
	}	
	
	@Test
	public void multiplyTest() {
        // Perform the calculation
        driver.findElement(AppiumBy.id("digit_7")).click();
        driver.findElement(AppiumBy.accessibilityId("multiply")).click();
        driver.findElement(AppiumBy.id("digit_6")).click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();
 
        // Find the result
        String result = driver.findElement(AppiumBy.id("result_final")).getText();
 
        // Assertion
        Assert.assertEquals(result, "42");
    }
		
@AfterClass 
	public void tearDown() {
	driver.quit();
}



}


