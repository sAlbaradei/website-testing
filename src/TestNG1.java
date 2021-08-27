import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.Reporter; 
public class TestNG1 {
	@Test
	public void testGoogle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sarah\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		Reporter.log("The browser is opened now");
		driver.manage().window().maximize(); 
		Reporter.log("The browser is maximized");
		driver.get("http://google.com");
		Reporter.log("The google website is opened now");
		driver.findElement(By.name("q")).sendKeys("Hello");
		Reporter.log("The data \"Hello\" is entered");
		driver.close();	
		} 
	}