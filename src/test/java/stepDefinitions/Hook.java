package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import common.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BaseClass{
	
	private BaseClass base;
	
	public Hook(BaseClass base) {
		this.base = base;
	}

	@Before
	public void initDriver() {
		System.out.println("Open browser");
		base.driver = new ChromeDriver();
		base.driver.manage().window().maximize();
		base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void teardown() {
		System.out.println("Close browser");
		base.driver.quit();
	}
}