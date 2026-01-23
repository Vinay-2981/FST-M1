package activities;

import static java.time.Duration.ofMillis;
import static org.openqa.selenium.interactions.PointerInput.MouseButton.LEFT;
import static org.openqa.selenium.interactions.PointerInput.Origin.viewport;
import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import examples.ActionBase;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity6 {

	AndroidDriver driver;
	WebDriverWait wait;
	
	 private final static PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
	 
	    public static void doSwipe(AppiumDriver driver, Point start, Point end, int duration) {
	        Sequence swipe = new Sequence(finger, 1)
	            .addAction(finger.createPointerMove(ofMillis(0), viewport(), start.getX(), start.getY()))
	            .addAction(finger.createPointerDown(LEFT.asArg())) //0 = Left Click
	            .addAction(finger.createPointerMove(ofMillis(duration), viewport(), end.getX(), end.getY()))
	            .addAction(finger.createPointerUp(LEFT.asArg()));
	        driver.perform(Arrays.asList(swipe));
	    }
	    @BeforeClass
	    public void setUp() throws MalformedURLException, URISyntaxException {
	        // Desired Capabilities
	        UiAutomator2Options options = new UiAutomator2Options();
	        options.setPlatformName("android");
	        options.setAutomationName("UiAutomator2");
	        options.setAppPackage("com.android.chrome");
	        options.setAppActivity("com.google.android.apps.chrome.Main");
	        options.noReset();

	        // Set the Appium server URL
	        URL serverURL = new URI("http://localhost:4723").toURL();

	        // Driver Initialization
	        driver = new AndroidDriver(serverURL, options);
	        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	        // Open the page in Chrome
	    
	        driver.get("https://training-support.net/webelements/sliders");
}
	    @Test
	    
	    public void volume75Test() {
	    	
	    	Dimension dims = driver.manage().window().getSize();
	    	System.out.println(dims.getWidth() +"," +dims.height);
	    	 int startX = (int) (0.5 *dims.getWidth());
	    	 int startY = (int) (0.77 *dims.getHeight());
	    	 Point start = new Point (startX,startY);
	    	 
	    	 int endX = (int) (0.67 *dims.getWidth());
	    	 int endY = (int) (0.5 *dims.getHeight());
	    	 Point end = new Point (startX,startY);
	    	 
	    	 doSwipe(driver, start, end, 2000);
	    	 
	    	 String volumeText = driver
	    				.findElement(AppiumBy.xpath("//android.view.View/android.widget.TextView[contains(@text, '%')]"))
	    				.getText();
	    	 
	    			// Assertions
	    			assertTrue(volumeText.contains("75%"));
	    			
	    }
	    				@Test
	    		    
	    		    public void volume25Test() {
	    		    	
	    		    	Dimension dims = driver.manage().window().getSize();
	    		    	System.out.println(dims.getWidth() +"," +dims.height);
	    		    	 int startX = (int) (0.5 *dims.getWidth());
	    		    	 int startY = (int) (0.77 *dims.getHeight());
	    		    	 Point start = new Point (startX,startY);
	    		    	 
	    		    	 int endX = (int) (0.5 *dims.getWidth());
	    		    	 int endY = (int) (0.5 *dims.getHeight());
	    		    	 Point end = new Point (startX,startY);
	    		    	 
	    		    	 ActionBase.doSwipe(driver, start, end, 2000);
	    		    	 
	    		    	 String volumeText = driver
	    		    				.findElement(AppiumBy.xpath("//android.view.View/android.widget.TextView[contains(@text, '%')]"))
	    		    				.getText();
	    		    	 
	    		    			// Assertions
	    		    			assertTrue(volumeText.contains("25%"));		
	    	 
	    }

	    
	    			@AfterClass
	    			public void tearDown() {
	    				// Close the browser
	    				driver.quit();
	    				
	    			}
	    }
