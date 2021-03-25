package frontoffice;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import HMSbase.testbase;
import HMSpage.frontoffice;
import HMSpage.homepage;
import HMSpage.loginpage;

public class frontofficetest extends testbase {
  frontoffice foffpag;
  homepage newhomepage;
  public frontofficetest()
  {
	  super();
  }
  @BeforeMethod
  public void setup()
  {
	  initialization();
	  loginpage login2=new loginpage();
	   //homepage newhomepage=new homepage();
	  newhomepage=login2.login(pop.getProperty("username"), pop.getProperty("password"));
	  //frontoffice newfrontoffice=new frontoffice();
	  //newfrontoffice=newhomepage.clickfrontoffice();
	  foffpag= newhomepage.clickfrontoffice();
	  
  }
  @Test
  public void validatetitle()
  {
	 
	 String actualtitle=foffpag.validatefrontpage();
  
	   String Expectedtittle="Smart Hospital Management System";
	   Assert.assertEquals(actualtitle, Expectedtittle);
	   
  }
   @Test
    public void frntoffname()
  {
 
	  boolean frntoffnamw=foffpag.frontpage1();
	  Assert.assertTrue(frntoffnamw);
  }
   @Test
   public void visbookclick()
   {
	   foffpag.clickkvisbook();
   }
   @AfterMethod
   
   public void testdown()
   {
	  driver.close(); 
   }
   
}
