package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import hooks.TestNgHooks;

public class Login extends TestNgHooks {
	
	public Login typeUserName(String uid) {	
		type(locateElement("id", "username"), uid);
		return this;
	}
	
	public Login typePassword(String pwd) {
		type(locateElement("id", "password"), pwd);
		return this;
	}
	
	public Home typePasswordAndEnter() {
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("crmsfa",Keys.ENTER);
		return new Home();
	}
	
	public Home clickLoginButton() {
		click(locateElement("class", "decorativeSubmit"));
		return new Home();
	}
	
	public Login clickLoginForFailure() {
		click(locateElement("class", "decorativeSubmit"));
		return this;
	}
}
