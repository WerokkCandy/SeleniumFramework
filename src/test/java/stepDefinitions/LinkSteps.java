package stepDefinitions;

import javax.accessibility.AccessibleStateSet;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import common.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Homepage;

public class LinkSteps  {
	public WebDriver driver;

	public LinkSteps() {
		driver = Hook.driver;

	}
	
	@Given("homepage is open")
	public void homepageIsOpen() {
		Homepage homepage = new Homepage(driver);
		driver.navigate().to(Hook.baseURL);
		homepage.acceptCookies();
	}
	
	@When("user taps on a link")
	public void userTapsOnALink() {
		Homepage homepage = new Homepage(driver);
		homepage.navigateToTeamPage();
	}

	@Then("correct page is opened")
	public void correctPageIsOpened() {
		String urlString = driver.getCurrentUrl();
		Assert.assertEquals("https://www.candyspace.com/team/", urlString);
	}
	
	@When("user taps on live chat button")
	public void userTapsLiveChatButton(){
		Homepage homepage = new Homepage(driver);
		driver.switchTo().frame(0);
		homepage.openLiveChat();
	}
	@Then("live chat window is opened")
	public void liveChatWindowIsOpened() {
		Homepage homepage = new Homepage(driver);
		homepage.assertChatWindow();		
	}
	

}
