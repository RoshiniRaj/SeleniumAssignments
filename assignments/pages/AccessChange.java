package week6.pages;

import org.testng.annotations.Test;

import week6.assignments.LoginPage;
import week6.hooks.PreAndPost;

public class AccessChange extends PreAndPost {
	
	@Test
	public void createChange() throws InterruptedException {
		new LoginPage()
			.moveToFrame()
			.typeUsername("admin")
			.typePassword("India@123")
			.clickLoginButton()
			.filter("Change")
			.openChange()
			.switchToFrame()
			.selectSearchWithNumber()
			.typeChangeID("")
			.selectChangeToBeOpened()
			.selectStatusAsAssess()
			.typeAssignmentGroup("Software")
			.typeAssignedTo("ITIL User")
			.clickUpdate();
	}

}
