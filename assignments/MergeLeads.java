package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeLeads {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		 driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		 
		 driver.findElement(By.xpath("//span[text()='From Contact']/following::img")).click();
		 
		 Set<String> windowHandles = driver.getWindowHandles();
		 List<String> listWindowHandles = new ArrayList<String>(windowHandles);
		 driver.switchTo().window(listWindowHandles.get(1));
		 
		 Thread.sleep(5000);
		
		 driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).click();
		  
		 driver.switchTo().window(listWindowHandles.get(0));
		 driver.findElement(By.xpath("(//span[text()='From Contact']/following::img)[2]")).click();
		 
		 Set<String> windowHandles1 = driver.getWindowHandles();
		 List<String> listWindowHandles1 = new ArrayList<String>(windowHandles1);
		 driver.switchTo().window(listWindowHandles1.get(1));
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();
		 driver.switchTo().window(listWindowHandles.get(0));
		 driver.findElement(By.xpath("//a[text()='Merge']")).click();
		 
		 Alert alert = driver.switchTo().alert();
		 alert.accept();
		 Thread.sleep(5000);
		 
		 String title = driver.getTitle();
		 System.out.println(title);

	}

}
