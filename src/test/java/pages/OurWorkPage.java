package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OurWorkPage {

	public WebDriver driver;
	
	@FindBy(id= "hs_cos_wrapper_subheader")
	WebElement header;
	
	public OurWorkPage(WebDriver driver) {
	    this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	
	public String getHeaderText() {
		String headerText = header.getText();
		return headerText;
	}
}
