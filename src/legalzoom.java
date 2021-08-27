import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.Assert;

public class legalzoom {
	@Test
	public void testLegalzoom() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sarah\\Downloads\\chromedriver.exe");
		// Open chrome browser
		WebDriver driver = new ChromeDriver();
		Reporter.log("The browser is opened now");

		// Maximize The window
		driver.manage().window().maximize();
		Reporter.log("The browser is maximized");

		// Open legal zoom website
		driver.get("https://www.legalzoom.com/");
		Reporter.log("The legal zoom website is opened now");

		// Click on Will and trusts button using absolute path
		WebElement Willandtrusts = driver
				.findElement(By.xpath("/html/body/section[1]/div[1]/div[3]/div[1]/div/div[2]/a"));
		Willandtrusts.click();
		Reporter.log("The Wills and trusts button is clicked");

		// Click on Living trust learn more button using xpath
		new WebDriverWait(driver, 20).until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@href='/personal/estate-planning/living-trust-overview.html']")))
				.click();
		Reporter.log("The Living trust learn more button is clicked");

		// Click on get started button using xpath
		WebElement getStarted = driver
				.findElement(By.xpath("//a[@data-ga-label='pricing_basic_lt_get_started_button']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", getStarted);
		Reporter.log("The get started button for Basic Living Trust is clicked");
		Reporter.log("The questionnaire page is opened");

		// Click on save and continue button using id
		driver.findElement(By.id("ctl00_cphMainContent_btnContinue2")).click();
		Reporter.log("The save and continue button is clicked");

		// Select Me only option
		WebElement optionMe = driver.findElement(By.id("chkctlgrantor_selfonly_CB"));
		optionMe.click();
		Reporter.log("The option is checked");

		// Click on save and continue button
		driver.findElement(By.id("ctl00_cphMainContent_btnContinue2")).click();

		// Enter first name
		WebElement fname = driver.findElement(By.name("grantor_first|290240"));
		fname.sendKeys("Sarah");
		Reporter.log("The first name is entered");

		// Enter last name
		WebElement lname = driver.findElement(By.name("grantor_last|290242"));
		lname.sendKeys("Sarah");
		Reporter.log("The last name is entered");

		// Select No option
		Select marry = new Select(driver.findElement(By.name("grantor_married_MC|290244")));
		marry.selectByVisibleText("No");
		Reporter.log("The no option is selected");

		// Select No option
		Select children = new Select(driver.findElement(By.name("grantor_children_MC|290247")));
		children.selectByVisibleText("No");
		Reporter.log("The no option is selected");

		// Click on save and continue button
		driver.findElement(By.id("ctl00_cphMainContent_btnContinue2")).click();

		// Select Alabama option
		Select state = new Select(driver.findElement(By.name("grantor_state|290264")));
		state.selectByVisibleText("Alabama");
		Reporter.log("The Alabama option is selected");

		// Click on save and continue button
		driver.findElement(By.id("ctl00_cphMainContent_btnContinue2")).click();
		driver.findElement(By.id("ctl00_cphMainContent_btnContinue2")).click();

		// Select Real Estate option
		WebElement property = driver.findElement(By.id("chkctlproperty_realestate_CB"));
		property.click();
		Reporter.log("The Real Estate option is checked");

		// Click on save and continue button
		driver.findElement(By.id("ctl00_cphMainContent_btnContinue2")).click();
		driver.findElement(By.id("ctl00_cphMainContent_btnContinue2")).click();
		driver.findElement(By.id("ctl00_cphMainContent_btnContinue2")).click();

		// Enter the general gift percentage
		WebElement give = driver.findElement(By.name("grantor_heir_info_percent_1|-89676"));
		give.sendKeys("100");
		Reporter.log("The 100% is entered");

		// Enter the name of gift receiver
		WebElement to = driver.findElement(By.name("grantor_heir_info_name_1|-89677"));
		to.sendKeys("Jack");
		Reporter.log("The Jack is entered");

		// Click on save and continue button
		driver.findElement(By.id("ctl00_cphMainContent_btnContinue2")).click();
		driver.findElement(By.id("ctl00_cphMainContent_btnContinue2")).click();
		driver.findElement(By.id("ctl00_cphMainContent_btnContinue2")).click();
		driver.findElement(By.id("ctl00_cphMainContent_btnContinue2")).click();
		driver.findElement(By.id("ctl00_cphMainContent_btnContinue2")).click();
		driver.findElement(By.id("ctl00_cphMainContent_btnContinue2")).click();

		// Enter the successor name
		WebElement successor = driver.findElement(By.name("first_successor_trustee|290415"));
		successor.sendKeys("Sarah Albaradeei");
		Reporter.log("The successor is entered");

		// Click on save and continue button
		driver.findElement(By.id("ctl00_cphMainContent_btnContinue2")).click();
		driver.findElement(By.id("ctl00_cphMainContent_btnContinue2")).click();
		driver.findElement(By.id("ctl00_cphMainContent_btnContinue2")).click();
		driver.findElement(By.id("ctl00_cphMainContent_btnContinue2")).click();
		driver.findElement(By.id("ctl00_cphMainContent_btnContinue2")).click();

		// Click on continue button
		WebElement Continue = driver.findElement(By.xpath("//input[@value='Continue']"));
		Continue.click();
		WebElement Continue2 = driver.findElement(By.xpath("//input[@value='Continue']"));
		Continue2.click();
		WebElement Continue3 = driver.findElement(By.id("button-next"));
		Continue3.click();
		Reporter.log("The continue button is clicked");
		Reporter.log("The Complete your order is opened");

		// Enter fist name for contact information
		WebElement Fname = driver.findElement(By.name("ctl00$cphMainContent$txt_ContactInfo_FName"));
		Fname.sendKeys("Sarah");
		Reporter.log("The first name for contact information is entered");

		// Enter last name for contact information
		WebElement Lname = driver.findElement(By.name("ctl00$cphMainContent$txt_ContactInfo_LName"));
		Lname.sendKeys("Albaradeei");
		Reporter.log("The last name for contact is entered");

		// Enter email for contact information
		WebElement email = driver.findElement(By.name("ctl00$cphMainContent$txt_ContactInfo_EmailAddress"));
		email.sendKeys("Sarah@gmail.com");
		Reporter.log("The email is entered");

		// Enter phone number for contact information
		WebElement phone = driver.findElement(By.name("ctl00$cphMainContent$txt_ContactInfo_PhoneNumber"));
		phone.sendKeys("8885128394");
		Reporter.log("The phone number is entered");

		// Enter Address for contact information
		WebElement Address = driver.findElement(By.name("ctl00$cphMainContent$txt_ContactInfo_Street1"));
		Address.sendKeys("ANDREA GARCIA 47 ANYVILLE RD NW #2 ANYTOWN AZ 01234");
		Reporter.log("The address is entered");

		// Enter zip code for contact information
		WebElement zip = driver.findElement(By.name("ctl00$cphMainContent$txt_ContactInfo_ZipCode"));
		zip.sendKeys("12345");
		Reporter.log("The zip code is entered");

		// Enter city for contact information
		WebElement city = driver.findElement(By.name("ctl00$cphMainContent$txt_ContactInfo_City"));
		city.sendKeys("NYC");
		Reporter.log("The city is entered");

		// Select the state
		Select State = new Select(driver.findElement(By.name("ctl00$cphMainContent$ddl_ContactInfo_State")));
		State.selectByVisibleText("AK");
		Reporter.log("The state option is selected");

		// Enter fist name for payment information
		WebElement payFname = driver.findElement(By.name("ctl00$cphMainContent$txt_PaymentInfo_FName"));
		payFname.sendKeys("Sarah");
		Reporter.log("The first name for payment information is entered");

		// Enter last name for payment information
		WebElement payLname = driver.findElement(By.name("ctl00$cphMainContent$txt_PaymentInfo_LName"));
		payLname.sendKeys("Sarah Albaradeei");
		Reporter.log("The last name for payment information is entered");

		// Enter wrong card number for payment information
		WebElement cardNum = driver.findElement(By.name("ctl00$cphMainContent$txt_CC_Number"));
		cardNum.sendKeys("123456");
		Reporter.log("The card nimber is entered");

		// Select the expiry month
		Select month = new Select(driver.findElement(By.name("ctl00$cphMainContent$ddl_CC_ExpirationMonth")));
		month.selectByVisibleText("May");
		Reporter.log("The month option is selected");

		// Select the expiry year
		Select year = new Select(driver.findElement(By.name("ctl00$cphMainContent$ddl_CC_ExpirationYear")));
		year.selectByVisibleText("2023");
		Reporter.log("The year option is selected");

		// Enter zip code for payment information
		WebElement payZip = driver.findElement(By.name("ctl00$cphMainContent$txt_CC_ZipCode"));
		payZip.sendKeys("12345");
		Reporter.log("The zip code for payment information is entered");

		// Enter cvv number
		WebElement cvv = driver.findElement(By.name("ctl00$cphMainContent$txt_CC_SecurityCode"));
		cvv.sendKeys("123");
		Reporter.log("The cvv is entered");

		// Check the agreement
		WebElement agree = driver.findElement(By.xpath("//label[contains(text(),'I understand')]"));
		agree.click();
		Reporter.log("The agreement is checked");

		// Click on Agree & place order button
		WebElement placeOrder = driver.findElement(By.id("ctl00_cphMainContent_imgbtn_CheckOut"));
		placeOrder.click();
		Reporter.log("The Agree & place order is clicked");

		// expected error text
		String exp = "Invalid Credit Card Number";
		// identify actual error message
		WebElement m = driver.findElement(By.id("ctl00_cphMainContent_cv_txt_CC_Number"));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		// verify error message with Assertion
		Assert.assertEquals(exp, act);

		Thread.sleep(5000);
		driver.close();
	}
}