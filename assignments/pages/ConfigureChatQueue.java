package week6.pages;

import org.testng.annotations.Test;

import week6.assignments.LoginPage;
import week6.hooks.PreAndPost;

public class ConfigureChatQueue extends PreAndPost {
	
	
	@Test
	public void createChatQueueEntry() throws InterruptedException {
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
			.selectState("Work In Progress")
			.selectPriority("3 - Moderate")
			.clickUpdate();
	}

}
