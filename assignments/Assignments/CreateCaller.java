package week4.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCaller {

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
		
		driver.findElement(By.id("filter")).sendKeys("Callers",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Callers']")).click();
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.findElement(By.id("sys_user.first_name")).sendKeys("Roshini");
		driver.findElement(By.id("sys_user.last_name")).sendKeys("Raj");
		driver.findElement(By.id("sys_user.title")).sendKeys("Ms");
		driver.findElement(By.id("sys_user.email")).sendKeys("roshiniraju.gsr@gmail.com");
		driver.findElement(By.id("sys_user.phone")).sendKeys("8072316133");
		driver.findElement(By.id("sys_user.mobile_phone")).sendKeys("8072316133");
		driver.findElement(By.id("sysverb_insert")).click();
		System.out.println("Caller created successfully");
		

	}

}
