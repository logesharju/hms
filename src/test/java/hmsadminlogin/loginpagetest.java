package hmsadminlogin;

import static org.testng.Assert.assertEquals;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import HMSbase.testbase;
import HMSpage.loginpage;

public class loginpagetest extends testbase {
       loginpage Loginpage;
       
       public loginpagetest()
       {
    	   super();
       }
       @BeforeMethod
       public void setup()
       {
    	   initialization();
    	   Loginpage=new loginpage();
       }
       @Test
       public void verifytitle()
       {
    	   String actualtitle=Loginpage.validateloginpage();
    	   String Expectedtittle="Smart Hospital : Hospital Management System";
    	   assertEquals(actualtitle, Expectedtittle);
       }
       @Test
       public void logo()
       {
    	   boolean logo=Loginpage.validatelogo();
    	   assertTrue(logo);
    	 
    	   //return log;
       }
       @Test
       public void logintest()
       {
    	   Loginpage.login(pop.getProperty("username"),pop.getProperty("password"));
    	   
    	   
       }
       
       @AfterMethod
       
       public void testdown()
       {
    	  driver.close(); 
       }
       
}
