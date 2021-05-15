package week4.Assignments;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteChange {

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
		driver.findElement(By.id("filter")).sendKeys("Change");
		driver.findElement(By.xpath("(//div[text()='Open'])[3]")).click();
		driver.switchTo().frame("gsft_main");
		
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		String changeNo = driver.findElement(By.id("change_request.number")).getAttribute("value");
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		driver.findElement(By.id("ok_button")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.xpath("//div[@class='input-group']//input"))));

		driver.findElement(By.xpath("//div[@class='input-group']//input")).sendKeys(changeNo,Keys.ENTER);			
		if (driver.findElement(By.xpath("//td[text()='No records to display']")).isDisplayed()) {
			System.out.println("Change is deleted successfully");
		}
		driver.close();

	}

}
