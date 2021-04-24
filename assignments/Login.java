package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Roshini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raj");
		
		WebElement Dropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(Dropdown);
		dd.selectByVisibleText("Partner");
		
		WebElement Dropdown5 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dd5 = new Select(Dropdown5);
		dd5.selectByVisibleText("Automobile");
		
		
		driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("130425");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kamal");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Kumar");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("123456");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("04/24/21");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("3,00,000");
		
		WebElement Dropdown2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd2 = new Select(Dropdown2);
		dd2.selectByVisibleText("Media");
		
		WebElement Dropdown3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dd3 = new Select(Dropdown3);
		dd3.selectByVisibleText("Corporation");
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("500");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("98765");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("####");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is testleaf form");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Please note this!!");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("636001");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("0427");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("help");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("Infosys.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Ganesh Murugan");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Kousalya");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Cafe Coffee Day");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("100 Wall street");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("New York");
		
		WebElement Dropdown4 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd4 = new Select(Dropdown4);
		dd4.selectByVisibleText("Texas");
		
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("78701");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("78705");
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("IBM");
		driver.findElement(By.name("submitButton")).click();
		
		String str = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(str);
		
		
		String str2 = str.replaceAll("[^a-zA-Z]", "");
		System.out.println(str2);
		
		if (str2.equals("IBM")) 
			
		{
			System.out.println("Verified");
			
		}
		else {
			System.out.println("Error");
		}
		
		driver.close();
	}

}
