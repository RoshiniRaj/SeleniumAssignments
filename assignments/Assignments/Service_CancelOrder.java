package week4.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Service_CancelOrder {

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
		driver.findElement(By.id("filter")).sendKeys("Service catalog");
		driver.findElement(By.xpath("//div[text()='Service Catalog']")).click();
		driver.findElement(By.xpath("//div[text()='Requests']")).click();
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("", Keys.ENTER);
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		
		Select approval=new Select(driver.findElement(By.id("sc_request.approval")));
		approval.selectByVisibleText("Rejected");
		Select requestState=new Select(driver.findElement(By.id("sc_request.request_state")));
		requestState.selectByVisibleText("Closed Cancelled");

		driver.findElement(By.xpath("//button[text()='Cancel Request']")).click();
		System.out.println("The order cancelled successfully");
		driver.close();

	}

}
