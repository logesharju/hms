package homepage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import HMSbase.testbase;
import HMSpage.homepage;
import HMSpage.loginpage;

public class homepagetest extends testbase {
	homepage newhomepage;
	public homepagetest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		  initialization();
		  loginpage login1=new loginpage();
		  newhomepage=login1.login(pop.getProperty("username"),pop.getProperty("password"));
		  //newhomepage=new homepage();
	}
	  @Test
	  public void validatetitle()
	  {
		  String actualtitle=newhomepage.validatehomepage();
   	   String Expectedtittle="Smart Hospital Management System";
   	   Assert.assertEquals(actualtitle, Expectedtittle);
   	   
	  }
      
	@Test
      public void homepagetitle()
      {
    	  boolean homepagetitle=newhomepage.homepage1();
    	  Assert.assertTrue(homepagetitle);
      }
	@AfterMethod
    
    public void testdown()
    {
 	  driver.close(); 
    }
    
}
