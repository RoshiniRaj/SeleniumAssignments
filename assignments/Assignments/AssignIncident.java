package week4.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignIncident {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://dev103117.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("India@123");
		driver.findElement(By.id("sysverb_login")).click();
		//Filter with Incidents
		driver.findElement(By.id("filter")).sendKeys("Incident");
		driver.findElement(By.xpath("//div[text()='Open - Unassigned']")).click();
	
		driver.switchTo().frame("gsft_main");
		
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		
		String incidentNo = driver.findElement(By.id("incident.number")).getAttribute("value");
		driver.findElement(By.id("sys_display.incident.assignment_group")).clear();
		driver.findElement(By.id("sys_display.incident.assignment_group")).sendKeys("Software",Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.id("sys_display.incident.assigned_to")).sendKeys("ITIL User",Keys.TAB);
		Thread.sleep(1500);
		
		driver.findElement(By.id("activity-stream-comments-textarea")).sendKeys("Updating incident with software group assignment");
		driver.findElement(By.xpath("//button[text()='Post']")).click();
		driver.findElement(By.id("sysverb_update_bottom")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[text()='Open']")).click();
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//div[@class='input-group']//input")).sendKeys(incidentNo,Keys.ENTER);
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
	
		String assignedGroup=driver.findElement(By.id("sys_display.incident.assignment_group")).getAttribute("value");

		if (assignedGroup.equals("Software")) {
			System.out.println("Incident is assigned");
		}

		driver.close();
	}

}
