package week4.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateProposal {

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
		
		driver.findElement(By.id("filter")).sendKeys("Proposal",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='My Proposals']")).click();
		driver.switchTo().frame("gsft_main");
		
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("",Keys.ENTER);
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		driver.findElement(By.id("sys_display.std_change_proposal.assignment_group")).clear();
		driver.findElement(By.id("sys_display.std_change_proposal.assignment_group")).sendKeys("Change Management",Keys.TAB);

		Select status=new Select(driver.findElement(By.id("std_change_proposal.state")));
		status.selectByVisibleText("In Progress");
		
		driver.findElement(By.id("sys_display.std_change_proposal.category")).sendKeys("Template Management",Keys.TAB);
		driver.findElement(By.xpath("//span[text()='Change Request values']")).click();
		driver.findElement(By.xpath("//input[@class='pull-left form-control filter-reference-input']")).sendKeys("Hardware",Keys.TAB);
		driver.findElement(By.xpath("(//textarea[@class='filerTableInput form-control'])[5]")).sendKeys("This is Justification");
		driver.findElement(By.xpath("(//textarea[@class='filerTableInput form-control'])[6]")).sendKeys("This is Risk");		
		Thread.sleep(2000);
		driver.findElement(By.id("sysverb_update")).click();
	
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("",Keys.ENTER);
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		String assignmentGroup = driver.findElement(By.id("sys_display.std_change_proposal.assignment_group")).getAttribute("value");
		String category = driver.findElement(By.id("sys_display.std_change_proposal.category")).getAttribute("value");
		String state = driver.findElement(By.xpath("//select[@id='std_change_proposal.state']//option[@selected='SELECTED']")).getText();
		
		if (assignmentGroup.equals("Change Management")&&category.equals("Template Management")&&state.equals("In Progress")) {
			System.out.println("Proposal updated successfully");
		}
			
		
	}

}
