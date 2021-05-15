package week4.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateCaller {

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
		
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Roshini",Keys.ENTER);
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		driver.findElement(By.id("sys_user.phone")).clear();
		driver.findElement(By.id("sys_user.phone")).sendKeys("9442777552");
		driver.findElement(By.id("sysverb_update")).click();
		
		if(driver.findElement(By.xpath("//tbody[@class='list2_body']//td[text()='(944) 277-7552']")).isDisplayed()) {
			System.out.println("Caller updated successfully");
		}

	}

}
