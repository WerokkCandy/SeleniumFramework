package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import common.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Homepage;

public class LinkSteps extends BaseClass {
	
	private BaseClass base;
	private Homepage homepage;
	
	public LinkSteps(BaseClass base, Homepage homepage) {
		this.base = base;
		this.homepage = homepage;
	}
	
	@Given("user taps on a link")
	public void userTapsOnALink() {
		base.driver.navigate().to(baseURL);
		homepage.acceptCookies();

		base.driver.findElement(By.cssSelector("#horiz-nav-items-wrapper > div:nth-child(3) > a")).click();
	}

	@Then("correct page is opened")
	public void correctPageIsOpened() {
		String urlString = base.driver.getCurrentUrl();
		Assert.assertEquals("https://www.candyspace.com/team/", urlString);
	}

}
