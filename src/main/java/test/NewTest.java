package test;

import java.util.prefs.BackingStoreException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import pageObjects.BaseClass;
import pageObjects.PHPTravels;
import utility.BrowserSession;

public class NewTest extends BrowserSession {

   
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  
  }
  
  @BeforeClass
  @Parameters({"browser", "url"})
  public void beforeTest1(String browser, String url) {
	  
	  WebDriver driver= getBrowserSession(browser, url);
	  
	  new BaseClass(driver);
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
	  //Call method for opening browser 
	  
	  
  }

  @AfterSuite
  public void afterSuite() {
	  //close browser session
  }
  
  @Test
  public void test01(){
	  
	PHPTravels phpPage=new PHPTravels(driver);
	phpPage.phpLink().click();
	  
	  
  }

}
