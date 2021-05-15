package week4.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateArticle {

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
		
		driver.findElement(By.id("filter")).sendKeys("Knowledge",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='My Knowledge Articles']")).click();
		driver.switchTo().frame("gsft_main");
		
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("sysverb_new")).click();
		String knowledgeNum = driver.findElement(By.id("sys_readonly.kb_knowledge.number")).getAttribute("value");
		
		driver.findElement(By.id("sys_display.kb_knowledge.kb_knowledge_base")).sendKeys("Knowledge",Keys.TAB);
		Thread.sleep(1000);
		driver.findElement(By.id("kb_knowledge.short_description")).sendKeys("This is Knowledge");
	
		driver.findElement(By.id("sysverb_insert")).click();
	    Select filter=new Select(driver.findElement(By.xpath("//span[@class='input-group-addon input-group-select']//select")));
		filter.selectByVisibleText("Number");
		driver.findElement(By.xpath("//div[@class='input-group']//input")).sendKeys(knowledgeNum,Keys.ENTER);
		
		if(driver.findElement(By.xpath("//a[@class='linked formlink']")).isDisplayed()) {
			System.out.println("Knowledge is created");
		}
		System.out.println(knowledgeNum);

	}

}
