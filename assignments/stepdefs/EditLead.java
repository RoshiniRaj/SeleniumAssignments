package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	ChromeDriver driver;
	@Given("Launch Chrome Browser")
	
	public void launch_browser()
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@When("Load Url {string}")
	public void loadurl(String url)
	{
		driver.get(url);
	}
	
	@And ("Type username as {string}")
	public void enterusername(String username)
	{
		driver.findElementById("username").sendKeys(username);
	}
	
	@And ("Type password as {string}")
	public void enterpassword(String password)
	{
		driver.findElementById("password").sendKeys(password);
	}
	
	@And ("click Login")
	
	public void clicklogin()
	{
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	
	@And ("verify successful login")
	
	public void loginsuccess()
	{
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	@And ("Click CrmSfa link")
	public void crmsfa() throws InterruptedException
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(3000);
		
	}
	
	@And ("Click Leads Main")
	public void leadsmainclick() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
		Thread.sleep(3000);
	}
	
	@And ("Click Find Lead")
	
	public void findlead() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		Thread.sleep(3000);
	}
	@And ("select Phone Number tab")
	
	public void phonetabclick()
	{
		driver.findElement(By.xpath("//span[text() = 'Phone']")).click();
	}
	
	@And ("Enter Search Key")
	
	public void enterfname() throws InterruptedException
	{
		driver.findElement(By.name("phoneNumber")).sendKeys("9");
		Thread.sleep(3000);
	}
	
	@And ("Click Find")
	
	public void clickfind( ) throws InterruptedException
	{
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();	
		Thread.sleep(3000);
	}

	@And ("Open First value")

	public void openfirst() throws InterruptedException
	{

		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		Thread.sleep(3000);
	}

	@And ("Click Edit")
	public void leadEdit() throws InterruptedException 
	{
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(3000);
	}
	
	@And ("Edit Firstname (.*)$")
	public void fnameEdit(String fname) 
	{
		driver.findElement(By.id("updateLeadForm_firstName")).sendKeys(fname);
		
	}
	
	@And ("Edit Company (.*)$")
	public void EditCompany(String cname) 
	{
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cname);
	}
	
	@And ("Click Update")
	public void UpdateClick() throws InterruptedException 
	{
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();	
		Thread.sleep(3000);
	}
	}
