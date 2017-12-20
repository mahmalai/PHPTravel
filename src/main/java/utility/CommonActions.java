package utility;

import org.openqa.selenium.WebElement;

public class CommonActions{
	
	public void button_Click(WebElement e){
		
		e.click();
		
	}
	public void fill_txtbx(WebElement e, String s) {
		try{
			e.sendKeys(s);
			Log.info("Text box filled successfully");
		}catch (Exception ex){
			Log.error("Text Box not found in the page");
		}
		
	}
	public String get_txt(WebElement e){
		return e.getText();
	}

}
