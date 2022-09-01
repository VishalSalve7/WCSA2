package TestNG.Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Operations {
  @Test
  public void createUser() {
	  
	  String expected="Create a user";
	  String actual="Create a user";
	  
	  Assert.assertEquals(actual, expected);;
	  System.out.println("Creating a user...");
  }
  @Test (dependsOnMethods = {"createUse"})
  public void editUser()
  {
	  System.out.println("Editing the User....");
  }
  
  @Test (dependsOnMethods = {"editUser"})
  public void deleteUser()
  {
	  System.out.println("deleting the User....");
  }
}
