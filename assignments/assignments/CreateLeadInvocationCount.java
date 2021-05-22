package week5.day2.assignments;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLeadInvocationCount extends BaseClass {
	@Test(invocationCount=3)
	public void createLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("IBM");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Roshini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raj");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rose.raj@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("2262627");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

	}

}