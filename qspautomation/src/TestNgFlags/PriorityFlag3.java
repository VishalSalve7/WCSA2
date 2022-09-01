package TestNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityFlag3 {
  @Test
  public void k() 
  {
	  Reporter.log("k method",true);
  }
  
  @Test
  public void s() 
  {
	  Reporter.log("s method",true);
  }
  
  @Test
  public void f() 
  {
	  Reporter.log("f method",true);
  }
  
  @Test
  public void x() 
  {
	  Reporter.log("x method",true);
  }
  
  @Test(priority = 1)
  public void e() {
	  Reporter.log("e method",true);
  }
  
  @Test(priority = 2)
  public void z() {
	  Reporter.log("z method",true);
  }
  
  @Test(priority = 3)
  public void g() {
	  Reporter.log("g method",true);
  }
  
  @Test(priority = 6)
  public void q() {
	  Reporter.log("q method",true);
  }
  
  @Test(priority = -1)
  public void w() {
	  Reporter.log("w method",true);
  }
  
}
