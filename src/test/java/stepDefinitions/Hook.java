package stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
	public static WebDriver driver;
	public static String baseURL = "https://www.candyspace.com/";

	
	@Before
	public void initDriver() {
		System.out.println("Open browser");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void teardown() {
		System.out.println("Close browser");
		driver.quit();
	}
}