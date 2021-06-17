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
import pages.InsightsPage;
import pages.OurWorkPage;

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
	

	@When("user clicks on our work link")
	public void user_clicks_on_our_work_link() {
		Homepage homepage = new Homepage(driver);
		homepage.clickOnOurWorkLink();
		
	}

	@Then("our work page is opened")
	public void our_work_page_is_opened() {
		OurWorkPage workpage = new OurWorkPage(driver);
		Assert.assertEquals("OUR WORK", workpage.getHeaderText());
		String urlString = driver.getCurrentUrl();
		Assert.assertTrue(urlString.contains("https://www.candyspace.com/work"));
	}
	
	@When("user clicks on All Insights link")
	public void user_clicks_on_all_insights_link() {
		Homepage homepage = new Homepage(driver);
		homepage.clickAllInsightsLink();
	}

	@Then("Insights page is opened")
	public void insights_page_is_opened() {
		InsightsPage insightspage = new InsightsPage(driver);
		Assert.assertEquals("INSIGHTS", insightspage.getHeaderText());
		String urlString = driver.getCurrentUrl();
		Assert.assertEquals("https://insights.candyspace.com/", urlString);
	}
	
	
}
