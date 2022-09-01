package TestNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DescriptionFlag1 {
	
  @Test(description = "This Test Is Used For Perform Valid Logid Page")
  public void validActiTime() {
	  Reporter.log("Valid Login is performed",true);
  }
  
  @Test(description = "This Test Is Used For Perform inValid Logid Page")
  public void inValidActiTime() {
	  Reporter.log("InValid Login is performed",true);
  }
}
