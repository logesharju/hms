package visiterpage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import HMSbase.testbase;

import HMSpage.frontoffice;
import HMSpage.homepage;
import HMSpage.loginpage;
import HMSpage.visiterpage;
import HMSutil.ReadExcel;

public class visiterpagetest extends testbase {
	loginpage login3;
	visiterpage  visiterpge;
    frontoffice frntofice;
    homepage newhomepage;
    String sheetname="sheet1";
	public visiterpagetest()
	{
		super();
	}
	 @BeforeMethod
	  public void setup()
	  {
		  initialization();
		  loginpage login3=new loginpage();
		 newhomepage=login3.login(pop.getProperty("username"), pop.getProperty("password"));
		 frntofice=newhomepage.clickfrontoffice();
		 visiterpge= frntofice.clickkvisbook();
		
		
	  }
	
	  @DataProvider 
      public Object[][] getVISTestData()
      { 
	  Object data[][] =  ReadExcel.getTestData(sheetname); 
	  return data; 
	  }
	 
     
      @Test(dataProvider="getVISTestData")
  	public void asvisclick(String args[])
  	{
    	Assert.assertTrue(visiterpge.visiterpagename());
	  	visiterpge.addvisclick();
  		Assert.assertTrue(visiterpge.addtitle());
  		visiterpge.clickaddvisiter(args);
  	}

	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
}
