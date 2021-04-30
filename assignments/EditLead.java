package week2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.id("username")).sendKeys("DemoSalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		//driver.findElement(By.name("firstName")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Rose");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		String str = driver.getTitle();
		if (str.equalsIgnoreCase("View Lead | opentaps CRM")) {
			
			System.out.println("Title Verified");
		}
		else {
			System.out.println("Title not matching");
		}
		
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Deloitte");
		driver.findElement(By.name("submitButton")).click();
		
		String str1 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(str1);
		
		
		String str2 = str1.replaceAll("[^a-zA-Z]", "");
		System.out.println(str2);
		
		if (str2.equals("Deloitte")) 
			
		{
			System.out.println("Verified");
			
		}
		else {
			System.out.println("Error");
		}
		
		driver.close();

	}

}
