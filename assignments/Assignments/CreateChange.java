package week4.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateChange {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev103117.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//CHG0030796
		
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("India@123");
		driver.findElement(By.id("sysverb_login")).click();
		driver.findElement(By.id("filter")).sendKeys("Change");
		driver.findElement(By.xpath("(//div[text()='Create New'])[3]")).click();
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//span[text()='Normal']")).click();
		String str = driver.findElement(By.id("change_request.number")).getAttribute("value");
		System.out.println(str);
		driver.findElement(By.id("sysverb_insert_bottom")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//div[text()='Open'])[3]")).click();
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(str, Keys.ENTER);
		String text = driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
		if (text.equals(str)){
			System.out.println("Change is created");	
		}

	}

}
