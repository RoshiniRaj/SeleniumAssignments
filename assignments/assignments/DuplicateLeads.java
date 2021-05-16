package week5.day1.assignments;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DuplicateLeads extends BaseClass {
	@Test
	
	public void duplicateLead() throws InterruptedException {
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String str = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]")).getText();
		System.out.println("First Name " + str);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String str1 = driver.getTitle();
		if (str1.equalsIgnoreCase("Duplicate Lead | opentaps CRM")) {
			
			System.out.println("Title Verified");
		}
		else {
			System.out.println("Title not matching");
		}
		
		
	}
}
