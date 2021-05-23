package stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	ChromeDriver driver;
	
	@Given("Launch Chrome browser")
	public void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@When ("Load URL {string}")
	public void LoadURL(String url) {
		driver.get(url);
	}
	@And("Type username as {string}")
	public void typeUserName(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	@And("Type password as {string}")
	public void typePassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@And("Click Login Button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@And("Verify Login is successful")
	public void isSuccess() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		
	}
	@And("Click Lead")
	public void clickLead() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@And("Create Lead")
	public void createLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
	@And("Create Companyname (.*)$")
	public void createCompantName(String companyName){
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
	}
	
	@And("Create Firstname (.*)$")
	public void createFirstName(String firstName) {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	}
	
	@And("Create Lastname (.*)$")
	public void createLastName(String lastName) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}
	
	@Then("Submit Lead")
	public void submitLead() {
	driver.findElement(By.name("submitButton")).click();
	}
		
}
