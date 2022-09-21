package KiteApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM2 {
	 //step 1 declaration
		@FindBy(xpath = "//input[@id='pin']")private WebElement PIN;
		@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement CTNBTN;
		
		//step 2 initialization
		public POM2(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		//step 3 implementation
		public void enterPIN(String pinvalue) {
			PIN.sendKeys(pinvalue);
		}
		public void clickCTNBTN() {
			CTNBTN.click();
		}
}
