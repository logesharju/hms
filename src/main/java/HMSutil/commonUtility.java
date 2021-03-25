package HMSutil;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import HMSbase.testbase;

public class commonUtility extends testbase{
	
	public static void upload()
	{
		try {
			Runtime.getRuntime().exec("./src/test/resources/fileopload.exe"+" "+"E:\\logesh\\sample.pdf");
			//Runtime.getRuntime().exec("/src/test/resources/fileopload.exe"+" "+"file");
			 Thread.sleep(4000);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//Script for Screenshot on fail

	public static void takescreenshot()
	{
	  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  String currentDir = System.getProperty("user.dir");
	  File destination=new File(currentDir+"./screenshot/"+System.currentTimeMillis()+".png");
	  
	    try {
			FileHandler.copy(scrFile,destination );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	 
	}
	public static void mouseclick(WebElement el)
	{
	  Actions action=new Actions(driver);
	  action.click(el).build().perform();
	}
	
}
