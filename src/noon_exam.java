
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class noon_exam {
	@Test
	public void noonTest() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sarah\\Downloads\\chromedriver.exe");
		// Open chrome browser
		WebDriver driver = new ChromeDriver();
		Reporter.log("The browser is opened now");

		// Maximize The window
		driver.manage().window().maximize();
		Reporter.log("The browser is maximized");

		// Open walmart website
		driver.get("https://www.noon.com/saudi-en/");
		Reporter.log("The noon website is opened now");

		// Get the search box element and send an item
		WebElement search = driver.findElement(By.id("searchBar"));
		search.sendKeys("laptop");
		driver.findElement(By.xpath("//*[@id=\"searchBar\"]")).sendKeys(Keys.ENTER);
		Reporter.log("Searched for an item and click enter");

		Thread.sleep(3000);

		// Click on a laptop item
		WebElement laptop = driver
				.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div[2]/div[3]/div[3]/a"));
		laptop.click();
		Thread.sleep(5000);
		Reporter.log("Clicked on a laptop");

		WebElement cart = driver.findElement(By.className("cart-button"));
		cart.click();
		Thread.sleep(5000);
		Reporter.log("Added item to the cart");

		// Click on checkout button
		WebElement checkout = driver
				.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div[4]/div[2]/div/div[3]/button[1]"));
		checkout.click();
		Thread.sleep(3000);
		Reporter.log("Clicked on checkout button");

		// Click on buy button
		WebElement buy = driver
				.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div[1]/div[3]/button"));
		buy.click();
		Thread.sleep(3000);
		Reporter.log("Clicked on buy button");

		// Enter email address
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("sara.abdulla_b@hotmail.com");
		Thread.sleep(3000);
		Reporter.log("Entered an email");

		// Enter the passowrd
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("1s2a3r4a");
		Thread.sleep(3000);
		Reporter.log("Entered a pass");

		// Click on sign in button
		WebElement signin = driver.findElement(By.id("submitLoginFormBtn"));
		signin.click();
		Thread.sleep(3000);
		Reporter.log("Clicked on sign in button");

		// Click on Continue button
		WebElement con = driver.findElement(By.xpath("//button[@aria-label='Continue']"));
		con.click();
		Thread.sleep(3000);
		Reporter.log("Clicked on Continue button");

		// Click on add new card button
		WebElement addcard = driver.findElement(By.xpath("//button[@aria-label='Add a New Card']"));
		addcard.click();
		Thread.sleep(3000);
		Reporter.log("Clicked on add new card button");

		// Enter wrong card number
		WebElement card = driver.findElement(By.id("ccNumber"));
		card.sendKeys("12345667");
		Thread.sleep(3000);
		Reporter.log("Entered wrong card number");

		// expected error text
		String exp = "Invalid card number";
		// identify actual error message
		WebElement m = driver.findElement(By.className("textError"));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		// verify error message with Assertion
		Assert.assertEquals(exp, act);

		driver.quit();
	}
}
