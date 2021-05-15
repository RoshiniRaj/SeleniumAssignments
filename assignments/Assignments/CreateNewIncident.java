package week4.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewIncident {  

	public static void main(String[] args) { 
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev103117.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("India@123");
		driver.findElement(By.id("sysverb_login")).click();
		driver.findElement(By.id("filter")).sendKeys("Incidents");
		driver.findElement(By.xpath("//div[text()='Incidents']")).click();
		driver.switchTo().frame("gsft_main");
		
		driver.findElement(By.xpath("//button[text()='New']")).click();
		String incidentnum = driver.findElement(By.id("incident.number")).getAttribute("value");
		driver.findElement(By.id("incident.short_description")).sendKeys("Testcase to create a Incident");
		driver.findElement(By.id("sysverb_insert_bottom")).click();
		driver.findElement(By.xpath("//div[@class='input-group']//input")).sendKeys(incidentnum, Keys.ENTER);
		String str = driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
		
		if (str.equals(incidentnum)) {
			System.out.println("Incident created successfully");	
		}
		else {
			System.out.println("Incident creation failed");
			
		}
		
		System.out.println(incidentnum);	

	}

}
