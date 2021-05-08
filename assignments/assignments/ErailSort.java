package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {

	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();	
		ChromeOptions options=new ChromeOptions();		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		driver.findElement(By.id("txtStationFrom")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("txtStationFrom")).sendKeys("Tambaram");
		driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.TAB);
        driver.findElement(By.id("txtStationTo")).clear();
		Thread.sleep(1000);

		driver.findElement(By.id("txtStationTo")).sendKeys("Salem Jn");
		driver.findElement(By.id("txtStationTo")).sendKeys(Keys.TAB);
		Thread.sleep(1000);
		driver.findElement(By.id("buttonFromTo")).click();
		
		List<WebElement> Train_Names=driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[2]"));		
		
		Set<String> SortedUniqueTrainNames=new TreeSet<String>();
		
		for(int i=0;i<=Train_Names.size()-1;i++)
			SortedUniqueTrainNames.add(Train_Names.get(i).getText());			

		List<String> TrainNamesList=new ArrayList<String>(SortedUniqueTrainNames);
		Collections.sort(TrainNamesList);
		System.out.println(TrainNamesList);
		driver.close();
		

	}

}
