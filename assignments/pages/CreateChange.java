package week6.pages;

import org.testng.annotations.Test;

import week6.assignments.LoginPage;
import week6.hooks.PreAndPost;

public class CreateChange extends PreAndPost {
	
	@Test
	public void createChange() {
		new LoginPage()
			.moveToFrame()
			.typeUsername("admin")
			.typePassword("India@123")
			.clickLoginButton()
			.filter("Change")
			.clickOnChange()
			.switchToMainFrame()
			.clickOnNormalButton()
			.typeShortDespriptions()
			.clickSubmit();
	}

}
