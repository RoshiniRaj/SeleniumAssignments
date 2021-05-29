package week6.assignments;

import org.openqa.selenium.By;

import week6.hooks.PreAndPost;

public class CreateChangeRequestPage extends PreAndPost {
	
	public CreateChangeRequestPage switchToMainFrame() {
		driver.switchTo().frame("gsft_main");
		return this;
	}
	public ChangeRequestPage clickOnNormalButton() {
		driver.findElement(By.xpath("//span[text()='Normal']")).click();
		return new ChangeRequestPage();
	}

}
