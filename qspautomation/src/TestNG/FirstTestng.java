package TestNG;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestng {
  @Test
  public void hello() {
	  Reporter.log("I Am Hello Method",true);
  }
  
  @Test
  public void bye()
  {
	  Reporter.log("I am Bye Method ",true);
  }
  
  @Test
  public void Airthmetic()
  {
	  System.out.println("I am Airthmetic exception Method ");
	  int i=20;
	  int j=0;
	  int res=i/j;
	  Reporter.log("airthemtic",true);
	  
  }
  
  
}
