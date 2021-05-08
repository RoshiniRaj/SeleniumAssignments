package week3.assignments;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumMap {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MS");
		driver.findElement(By.xpath("//div[text()='Chennai Egmore']")).click();
	    driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("MDU");
		driver.findElement(By.xpath("//div[text()='Madurai Jn']")).click();
	    driver.findElement(By.id("chkSelectDateOnly")).click();
		Thread.sleep(1000);
		
		Map<String, String> map = new HashMap<String, String>();
		List<WebElement> train = driver.findElements(By.xpath("//table[@class = 'DataTable TrainList TrainListHeader']"));
		
			for (WebElement row : train) 
		{
		List<WebElement> column = row.findElements(By.tagName("td"));
		
			for (WebElement columns : column) 
			{
				if (columns.getText().startsWith("M")) 
				{
					map.put(columns.getText(), columns.getText());
				}
			}
		}
		System.out.println(map.values());

		driver.close();
		

	}

}
