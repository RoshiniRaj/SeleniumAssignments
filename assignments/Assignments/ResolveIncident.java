package week4.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ResolveIncident {

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
		driver.findElement(By.xpath("//div[text()='Incidents']")).click();
	
		driver.switchTo().frame("gsft_main");
		
		driver.findElement(By.xpath("//div[@class='input-group']//input")).sendKeys("INC0011179", Keys.ENTER);
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		
		Select state=new Select(driver.findElement(By.id("incident.state")));
		state.selectByVisibleText("Resolved");
		
		driver.findElement(By.xpath("//button[text()='Resolve']")).click();		
	
		driver.findElement(By.xpath("//div[@class='input-group']//input")).sendKeys("INC0011179",Keys.ENTER);
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		
		String stateText=driver.findElement(By.xpath("//select[@id='incident.state']//option[@selected='SELECTED']")).getText();
		if (stateText.equals("Resolved")) {
			System.out.println("Incident is resolved");
		}
		

	}

}
