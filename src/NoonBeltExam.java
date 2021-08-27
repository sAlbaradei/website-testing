
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.Reporter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NoonBeltExam {
  WebDriver driver;
  @BeforeMethod
    public void f() throws InterruptedException {

    // path chromedriver
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sarah\\Downloads\\chromedriver.exe");
   // System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    
    //navigate to website 
  
    driver.get("https://www.noon.com/saudi-en/");
       driver.manage().window().maximize();
//finelement search field 
      WebElement search = driver.findElement(By.id("searchBar"));
      search.sendKeys("beauty"+Keys.ENTER);
      Reporter.log("The browser is opened now");

          Thread.sleep(2000);
        //finelement choose prodect 
          WebElement prodect = driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div[2]/div[3]/div[3]/a"));
          prodect.click();
          Thread.sleep(3000);
          Reporter.log("choose prodect");
          Thread.sleep(3000);
          //finelement add to cart  button 
          WebElement button = driver.findElement(By.className("cart-button"));
          button.click(); 
          Thread.sleep(4000);
          Reporter.log("add to card");
         
          
          //finelement cheakout buttton 
          WebElement cheakout= driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div[4]/div[2]/div/div[3]/button[1]"));
          cheakout.click();
          Thread.sleep(3000);
          Reporter.log("click on cheakout buttton");
          
          //finelement cheakout11 buttton 
          WebElement cheakout11= driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div[2]/div/div[1]/div[3]"));
          cheakout11.click();
          Thread.sleep(3000);
          Reporter.log("click on cheakout1 buttton");
          
        //finelement Email field 
          WebElement email= driver.findElement(By.xpath("//*[@id=\"formContainer\"]/div[1]/div[1]/div/input"));
          email.sendKeys("noura44aleidan@gmail.com");
          Thread.sleep(3000);
          Reporter.log("enter email");
          //finelement password  field

WebElement pass = driver.findElement(By.xpath("//*[@id=\"formContainer\"]/div[1]/div[2]/div[1]/div/input"));
          pass.sendKeys("Mohammed123123@");
          Thread.sleep(3000);
          Reporter.log("enter password");
        //finelement sumbit button 
          WebElement buttonlogin = driver.findElement(By.id("submitLoginFormBtn"));
          buttonlogin.click();  
          Thread.sleep(3000);
          Reporter.log("sumbit button ");
        //finelement follow  button  
          WebElement foolow = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/button"));
          foolow.click();  
          Thread.sleep(3000);
          Reporter.log("follow button ");
          
          // add new cared button 
          WebElement newcard = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div/div[1]/div[1]/div[2]/div/div/div[3]/button"));
          newcard.click();
          Thread.sleep(7000);
          Reporter.log("  click on (add new cared) button ");
       // enter new card number 
          WebElement newcard1 = driver.findElement(By.xpath("//*[@id=\"ccNumber\"]"));
          newcard1.sendKeys("111111111");
          Thread.sleep(7000);
          Reporter.log(" enter new card number");
          
       // using assert to verify the message 
        String actual_error=    driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div/div[1]/div[1]/div[2]/div/div/div[2]/div/form/div[1]/div[2]/p")).getText();
        
          String expected_error ="Invalid card number";
          Assert.assertEquals(actual_error, expected_error);
          System.out.println("  the Test complated it's pass  ");
          Thread.sleep(1000); 
         
  }

   @Test
    public void afterMethod() throws InterruptedException {
          
       // using assert to verify the message 
        String actual_error=    driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div/div[1]/div[1]/div[2]/div/div/div[2]/div/form/div[1]/div[2]/p")).getText();
        
          String expected_error ="Invalid card number";
          Assert.assertEquals(actual_error, expected_error);
          System.out.println("  the Test complated it's pass  ");
          Thread.sleep(1000); 
         
}
        @AfterMethod
        public void beforeMethod() throws InterruptedException {
          Thread.sleep(5000); 
           driver.quit();
        }
          
}