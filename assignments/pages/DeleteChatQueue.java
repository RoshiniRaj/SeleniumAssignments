package week6.pages;

import org.testng.annotations.Test;

import week6.assignments.LoginPage;
import week6.hooks.PreAndPost;

public class DeleteChatQueue extends PreAndPost {
	
	@Test
	public void createChatQueueEntry() {
		new LoginPage()
			.moveToFrame()
			.typeUsername("admin")
			.typePassword("India@123")
			.clickLoginButton()
			.filter("My Work")
			.clickOnMyWork()
			.switchToMainFrame()
			.searchWithRequestNumber("")
			.SelectExistingChatQueueEntry()
			.clickDelete()
			.clickOnDeleteConfirmation();
	}

}
