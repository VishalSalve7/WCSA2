package TestNG;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OrangeHrmAssertion {
  WebDriver driver;
	@BeforeMethod
  public void setUp() 
  {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }
	
	@Test
	public void OrangeLogin() throws InterruptedException
	{
	String loginTitle = driver.getTitle();
	SoftAssert sa = new SoftAssert();
	sa.assertEquals(loginTitle, "OrangeHRM");
	Reporter.log("Login Ttitle is Displayed",true);
	
	//---------------------------------------------//
	
	boolean statusOfUsername = driver.findElement(By.name("username")).isDisplayed();
	Assert.assertEquals(statusOfUsername, true);
	Reporter.log("Username text box is displayed",true);
	driver.findElement(By.name("username")).sendKeys("Admin");
	
	//--------------------------------------------------------//
	
	boolean statusOfPassword = driver.findElement(By.name("password")).isDisplayed();
	Assert.assertEquals(statusOfPassword , true);
	Reporter.log("Password text box is displayed",true);
	driver.findElement(By.name("password")).sendKeys("admin123");

	//---------------------------------------------------------------//
	
	boolean statusOfLoginButton= driver.findElement(By.xpath(" //button[.=' Login ']")).isDisplayed();
	Assert.assertEquals(statusOfLoginButton, true);
	Reporter.log("Login Button is displayed",true);
	driver.findElement(By.xpath("//button[.=' Login ']")).click();
	Thread.sleep(5000);
	
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
