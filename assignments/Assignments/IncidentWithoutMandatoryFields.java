package week4.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IncidentWithoutMandatoryFields {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://dev103117.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("India@123");
		driver.findElement(By.id("sysverb_login")).click();
		driver.findElement(By.id("filter")).sendKeys("Incident");
		driver.findElement(By.xpath("//div[text()='Incidents']")).click();
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.findElement(By.id("sysverb_insert_bottom")).click();
		String str = driver.findElement(By.xpath("//span[@class='outputmsg_text']")).getText();
		
		if (str.equals("The following mandatory fields are not filled in: Short description")) {
			System.out.println("Testcase is passed");
		}
		
		driver.close();
		
		
		
		
		
		
	}

}
