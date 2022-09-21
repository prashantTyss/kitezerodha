package KiteApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1 {
	//step 1 declaration
		@FindBy(xpath = "//input[@id='userid']")private WebElement UN;
		@FindBy(xpath = "//input[@id='password']")private WebElement PWD;
		@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement LOGBUTTON;
		
		//step 2 initialization
		public POM1(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		//step 3 implementatio
		public void enterUN(String username) {
		UN.sendKeys(username);
		}
		public void enterPWD(String passward) {
			PWD.sendKeys(passward);
		}
		public void clickLOGBUTTON() {
			LOGBUTTON.click();
		}
	}

