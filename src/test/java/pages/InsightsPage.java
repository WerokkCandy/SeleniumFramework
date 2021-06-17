package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsightsPage {

	public WebDriver driver;
	
	@FindBy(id = "hs_cos_wrapper_module_1556191387704302_")
	WebElement heading;
	
	public InsightsPage(WebDriver driver) {
	    this.driver = driver;
        PageFactory.initElements(driver, this);

	}
	
	public String getHeaderText() {
		String headerText = heading.getText();
		return headerText;
	}
}
