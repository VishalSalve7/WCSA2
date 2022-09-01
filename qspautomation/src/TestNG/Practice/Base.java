package TestNG.Practice;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Base {
  @BeforeMethod
  public void Login() 
  {
	  System.out.println("Login Page");
  }
  
  @AfterMethod
  public void Logout()
  {
	  System.out.println("Logout Page");
  }
  
  @BeforeClass
  public void launchBrowser()
  {
	  System.out.println("Launching a browser");
  }
  
  @AfterClass
  public void closeBrowser()
  {
	  System.out.println("closing a browser");
  }
  
}
