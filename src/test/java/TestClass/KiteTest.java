package TestClass;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import BaseClass.KiteBase1;
import KiteApp.POM1;
import KiteApp.POM2;
import KiteApp.POM3;
import UtilityClass.KiteUtility1;

public class KiteTest extends KiteBase1{
//declare all useful members as global
	POM1 login1;
	POM2 login2;
	POM3 home;
	
	@BeforeClass
	public void openBrowser()throws Throwable {
	initilizeBrowser();
	
	//all objects of pom class
	login1=new POM1(driver);
	login2=new POM2(driver);
	home=new POM3(driver);
	}
	
	@BeforeMethod
	public void loginToApp() throws Throwable {
		//enter UN
		login1.enterUN(KiteUtility1.getTD(0, 0));
		
		System.out.println((KiteUtility1.getTD(0, 0)));
		
	//enter pwd
		login1.enterPWD(KiteUtility1.getTD(0, 1));
		 
		System.out.println((KiteUtility1.getTD(0, 1)));
		
		
		//click on login button
		login1.clickLOGBUTTON();
		
		//enter pin
		login2.enterPIN(KiteUtility1.getTD(0, 2));
		
		System.out.println((KiteUtility1.getTD(0, 2)));
		 
		//click on continue button
		login2.clickCTNBTN();
	}
	@Test
	public void verifyuserID() throws Throwable {
		Reporter.log("running verify user id",true);
		String actId = home.verifyUSERID(null);
		String expId = KiteUtility1.getTD(0, 0);
		Assert.assertEquals(expId,actId,"both are diffrent tc is failed");
		
	}
	@AfterMethod
	public void logoutApp() {
		Reporter.log("logout the application",true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("close the app",true);
		
	}
	}
