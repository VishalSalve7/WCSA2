package TestNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledFlag2 {
  
	@Test(enabled = false)
	public void Method1 () 
	{
		Reporter.log("i am method 1",true);
	}
	
	@Test(enabled = true)
	public void Method2 () 
	{
		Reporter.log("i am method 2",true);
	}
	
	@Test
	public void Method3 () 
	{
		Reporter.log("i am method 3",true);
	}
	
	
}
