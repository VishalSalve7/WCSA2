package TestNG.Practice;

import org.testng.annotations.Test;

public class User{
  @Test(priority = 1)
  public void FirstMethod() {
	  System.out.println("First Method is Called...");
  }
  @Test(priority = 2)
  public void SecondMethod() {
	  System.out.println("Second Method is Called...");
  }
  
  @Test(priority = 3)
  public void ThrirdMethod() {
	  System.out.println("Third Method is Called...");
  }
}
