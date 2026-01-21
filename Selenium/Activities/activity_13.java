package HelloSelinium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/tables");
		System.out.println("Title page is:" +driver.getTitle());
		
		//driver.quit();
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/thead/tr/th"));
		System.out.println("No of cols:" + cols.size());
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/thead/tr"));
		System.out.println("No of rows:" + rows.size());
		
		//driver.quit();
		
		List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[3]/td"));
        System.out.println("Third row cell values: ");
        for(WebElement cell : thirdRow) {
            System.out.println(cell.getText());
        }
		
		//driver.quit();
	
		WebElement Cellvalue = driver.findElement(By.xpath("//table[contains(@class, 'table-auto')]/thead/tr[2]/td[2]"));
		System.out.println("Second row, second cell value: " + Cellvalue.getText());
		
		driver.quit();

	}
*/
		WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/tables");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

        // Print the number of columns
        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/thead/tr/th"));
        System.out.println("Number of columns: " + cols.size());
        // Print the number of rows
        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr"));
        System.out.println("Number of rows: " + rows.size());

        // Print the cells values of the third row
        List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[3]/td"));
        System.out.println("Third row cell values: ");
        for(WebElement cell : thirdRow) {
            System.out.println(cell.getText());
        }

        // Print the cell value of the second row and second column
        WebElement cellValue = driver.findElement(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[2]/td[2]"));
        System.out.println("Second row, second cell value: " + cellValue.getText());

        // Close the browser
        driver.quit();
    }
}
