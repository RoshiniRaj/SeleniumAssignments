package week5.day1.assignments;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EditLead extends BaseClass {
	@Test

	public void editLead() throws InterruptedException {
        
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Roshini");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Deloitte");
		driver.findElement(By.name("submitButton")).click();
		
	}

}
