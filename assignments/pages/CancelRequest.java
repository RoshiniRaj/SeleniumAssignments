package week6.pages;

import org.testng.annotations.Test;

import week6.assignments.LoginPage;

public class CancelRequest {
	@Test
	public void cancelRequestTest() {
		new LoginPage()
			.moveToFrame()
			.typeUsername("admin")
			.typePassword("India@123")
			.clickLoginButton()
			.filter("My Work")
			.clickOnMyWork()
			.switchToMainFrame()
			.searchWithRequestNumber("")
			.SelectExistingRequest()
			.clickOnCancelRequest();
	}

}
