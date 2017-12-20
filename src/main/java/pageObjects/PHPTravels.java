package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PHPTravels extends BaseClass{
	
	public PHPTravels(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private static WebElement element=null;
	
	public WebElement phpLink(){
		
		element=driver.findElement(By.xpath("//*[@href='//www.phptravels.net']"));
		return element;
	}
	
	

}
