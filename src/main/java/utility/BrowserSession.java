package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserSession {
	protected WebDriver driver;
	WebDriverWait myWaitVar;
	public BrowserSession() {
		// TODO Auto-generated constructor stub
	}

	public WebDriver getBrowserSession(final String browser, final String url){
		System.out.println("Browser name is"+browser);
		if (browser.contains("FireFox")){
			System.out.println("Firefox block");
			System.setProperty("webdriver.gecko.driver", "C://Users/mahmalai/Desktop/OnlineWS/selenium-test/Files/geckodriver.exe");
			
			driver = new FirefoxDriver();
			System.out.println(url);
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			System.out.println("Entering tin ");
			
			driver.get(url);
		}
		if (browser == "Chrome"){
			System.setProperty("webdriver.chrome.driver", "//Users/mahmalai/Desktop/OnlineWS/selenium-test/Files/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
		}
		
		if (browser == "IE"){
			
		}
		return driver;
	}

}
