package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.xpath("//input[@class='inputLogin']")).sendKeys("DemoSalesmanager");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//div[@id='label']//a[1]")).click();
		driver.findElement(By.xpath("(//div[@class='x-panel-header']//a)[2]")).click();
		driver.findElement(By.xpath("//a[@id='ext-gen861']")).click();
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		driver.findElement(By.linkText("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a")).click();
		driver.findElement(By.className("buttonDangerous")).click();

	}

}
