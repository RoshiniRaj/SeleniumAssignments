package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeads {
	
	public static void main(String[] args) throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.id("username")).sendKeys("DemoSalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
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
		
		driver.findElement(By.className("smallSubmit")).click();
		String str2 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(str2);
		
		if (str.equals(str2)) 
			
		{
			System.out.println("Verified");
			
		}
		else {
			System.out.println("Error");
		}
		
		driver.close();
		
		
	}
}
