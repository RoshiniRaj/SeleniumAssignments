package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nyka {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='brands']")).click();
		driver.findElement(By.xpath("//a[text()='Popular']")).click();
		
		driver.findElement(By.xpath("(//div[@id='brandCont_Popular']//li)[5]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listwindowHandles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(listwindowHandles.get(1));
		
		Thread.sleep(5000);
		String title = driver.getTitle();
		if (title.contains("L'Oreal Paris")) {
			System.out.println("Title contains 'L'oreal Paris'");
		}
		else {
			System.out.println("Title does not contain 'L'oreal Paris'");
		}
		driver.findElement(By.xpath("//span[@title='POPULARITY']")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']/following-sibling::div")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		
		Thread.sleep(3000);
		
		String filtersApplied = driver.findElement(By.xpath("//li[text()='Shampoo']")).getText();
		if (filtersApplied.contains("Shampoo")) {
			System.out.println("Shampoo filter is applied");
		}
		else {
			System.out.println("Shampoo filter is not applied");
		}
		driver.findElement(By.xpath("//span[contains(text(),'real Paris Colour Protect Shampoo')]")).click();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> listwindowHandles2 = new ArrayList<String>(windowHandles2);
		driver.switchTo().window(listwindowHandles2.get(2));
		
		driver.findElement(By.xpath("//span[text()='175ml']")).click();
		String mrp = driver.findElement(By.xpath("//div[@class='price-info']/span[2]")).getText();
		System.out.println("MRP of the product is "+mrp);
		driver.findElement(By.xpath("//div[@class='pull-left']//button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='AddBagIcon']")).click();
		Thread.sleep(3000);
		
        String grandTotal = driver.findElement(By.xpath("//div[@class='first-col']/div")).getText();
        String grandTot = grandTotal.replaceAll("[^0-9]", "");
        System.out.println("Grand total is "+grandTot);
        
        driver.findElement(By.xpath("//span[text()='Proceed']")).click();
        
        driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']")).click();
        
        String grandTotal1 = driver.findElement(By.xpath("//div[@class='payment-details-tbl grand-total-cell prl20']/div[@class = 'value']")).getText();
        String grandTot1 = grandTotal1.replaceAll("[^0-9]", "");
        
        
        if(grandTot.equals(grandTot1)) {
        	System.out.println("Grand Total matches");
        }
        else{
        	System.out.println("Grand Total does not match");
        }
 
        driver.quit();

	}

}
