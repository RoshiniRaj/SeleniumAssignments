package week5.day2.assignments;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateDataProviderLead extends BaseClass{
		@DataProvider(name="TestData")
		public Object[][] fetchData() {
			String[][] data=new String[2][7];
			
			data[0][0]="IBM";
			data[0][1]="Roshini";
			data[0][2]="Raj";
			data[0][3]="rose.raj@gmail.com";
			data[0][4]="91";
			data[0][5]="044";
			data[0][6]="2262627";
			
			data[1][0]="Infy";
			data[1][1]="Kamal";
			data[1][2]="Kumar";
			data[1][3]="kamal.kumar@gmail.com";
			data[1][4]="91";
			data[1][5]="044";
			data[1][6]="2222222";
			
			return data;
		}
		
		
		@Test(dataProvider="TestData")
		public void createLead(String CompName, String  FName,String LName, String MailID, String phCountryCd, String phAreaCd, String phNo) {
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CompName);
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FName);
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LName);
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(MailID);
			driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
			driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys(phCountryCd);
			driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys(phCountryCd);
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
			driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		}

	}

