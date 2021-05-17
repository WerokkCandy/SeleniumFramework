package pages;

import org.openqa.selenium.By;

import common.BaseClass;

public class Homepage extends BaseClass {
	
	private BaseClass base;
	
	public Homepage(BaseClass base) {
		this.base = base;
	}
	
	public void acceptCookies() {
		try {
			base.driver.findElement(By.id("hs-eu-confirmation-button")).click();
		} catch (Exception e) {
			System.out.println("Cookies have been accepted already!");
		}
	}
}
