package testJava;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class aclass {

	static WebDriver driver;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "/Users/amitparate/Downloads/chromedriver");

		driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/ajax.html");

		Thread.sleep(10000);		// java wait

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // used for all elements

		WebElement yes = driver.findElement(By.xpath("//input[@id='yes']"));
		yes.click();

		WebDriverWait wait = new WebDriverWait(driver, 10); // used for specific element
		wait.until(ExpectedConditions.visibilityOf(yes));

		yes.click();
		
		
		
		

		
		
		
		
	}
	
	
	
	
	
	
}
