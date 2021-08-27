import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert; 

public class annTestNG {

	public String baseUrl = "https://www.youtube.com/";
	String driverPath = "C:\\Users\\Sarah\\Downloads\\chromedriver.exe";
	public WebDriver driver ;

	@BeforeTest
	public void launchBrowser() {
		System.out.println("Launching Chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void testGoogle() {
		String expectedTitle = "YouTube";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle); 
	} 

	@Test 
	public void testLogin() throws InterruptedException{
		WebElement SignIn = driver.findElement(By.xpath("//*[@id=\"buttons\"]/ytd-button-renderer/a"));
		SignIn.click();

		WebElement Email = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		Email.click();
		Email.sendKeys("razan");

		WebElement Next = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
		Next.click();
		Thread.sleep(4000);
	} 

	@AfterMethod
	public void testMessage() {
		String actual_error = driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[2]/div[2]/div")).getText();
		String expected_error = "Couldn’t find your Google Account";
		Assert.assertEquals(actual_error, expected_error);
	}

	@AfterTest
	public void terminateBrowser() {
		System.out.println("Test is complated ");
		driver.close();
	}
}
