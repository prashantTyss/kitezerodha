package KiteApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM3 {
    //Declaration
	@FindBy(xpath = "//span[@class='user-id']")private WebElement USERID;
	
	//initialization
	public POM3(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public String verifyUSERID(String expID) {
		String actID = USERID.getText();
	return actID;
	}
	}
	
