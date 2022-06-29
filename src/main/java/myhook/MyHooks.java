package myhook;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import resources.utility.TestBase;

public class MyHooks extends TestBase {
	
	@Before
	public void setup()
	{
		TestBase.initialization();
	}
	
	@After
	public void teardown()
	{
		TestBase.quitedriver();
	}
	

}
