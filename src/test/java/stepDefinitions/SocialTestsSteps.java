package stepDefinitions;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Homepage;

public class SocialTestsSteps {
	public WebDriver driver;

	public SocialTestsSteps() {
		driver = Hook.driver;

	}

	    @Given("^user visits (.+)$")
	    public void user_visit(String page) throws Throwable {
			Homepage homepage = new Homepage(driver);
			driver.navigate().to(page);
			homepage.acceptCookies();
	    }

	    @When("^user clicks on the twitter icon$")
	    public void user_clicks_on_the_twitter_icon() throws Throwable {
	        String oldTab = driver.getWindowHandle();
	    	driver.findElement(By.cssSelector("#hs_cos_wrapper_social_links_ > a:nth-child(1)")).click();
	        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
	        newTab.remove(oldTab);
	        driver.switchTo().window(newTab.get(0));
	    }

	    @Then("^twitter page is opened$")
	    public void twitter_is_opened() throws Throwable {
			String urlString = driver.getCurrentUrl();
			Assert.assertEquals("https://twitter.com/CandyspaceLtd", urlString);
	    }
	    
	    @Then("^linkedin icon points to the correct URL$")
	    public void linkedin_page_is_opened() throws Throwable {
//			String urlString = driver.getCurrentUrl();
//			Assert.assertEquals("https://www.linkedin.com/company/candyspace-media/", urlString);
			String urlString2= driver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_social_links_\"]/a[2]")).getAttribute("href");
			Assert.assertEquals("https://www.linkedin.com/company/candyspace-media/", urlString2);
	    }

	
}
