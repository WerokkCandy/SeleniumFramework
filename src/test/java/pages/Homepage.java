package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	public WebDriver driver;
	
	@FindBy(id = "hs-eu-confirmation-button") 
	WebElement cookieAcceptButton;
	
	@FindBy(css = "#horiz-nav-items-wrapper > div:nth-child(3) > a") 
	WebElement teamLink;
	
	@FindBy(css = "body > div > div.Application__WidgetAppContainer-sc-1f2l0a1-0.dvBAhE.widget-app-container > span > div > button")
	WebElement liveChatButton;
	
	@FindBy(xpath = "//*[@id=\"cta_button_709096_e2862d20-c64a-48af-b655-f30b6ca55e9c\"]/div/div/span")
	WebElement ourWorkLink;
	
	@FindBy(css = "div.portfolio_bottom > a > div > div")
	WebElement allInsightsLink;
	

	
	public Homepage(WebDriver driver) {
	    this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	
	public void acceptCookies()  {
		cookieAcceptButton.click();
	}
	
	public void navigateToTeamPage() {
		teamLink.click();
	}
	
	public void openLiveChat() {
		liveChatButton.click();
	}
	
	public void assertChatWindow() {
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"current-view-component\"]/div/div/div[2]/div/div[2]/div[2]/div[1]/div")).isDisplayed());
	}
	
	public void clickOnOurWorkLink() {
		 ourWorkLink.click();
	}
	
	public void clickAllInsightsLink() {
		allInsightsLink.click();
	}
	
}
