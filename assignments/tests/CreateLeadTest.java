package tests;

import org.testng.annotations.Test;

import hooks.TestNgHooks;
import pages.Login;

public class CreateLeadTest extends TestNgHooks{
	@Test(dataProvider="readExcelData")
	public void createLead(String compName,String fName,String lName,String MailID, String phCountryCd, String phAreaCd, String phNo) {
		new Login()
		.typeUserName("DemoSalesManager")
		.typePassword("crmsfa")
		.clickLoginButton()
		.getMessage()
		.clickCrmsfaLink()
		.clickLeadsTab()
		.clickCreateLeadMenu()
		.typeCompanyName(compName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.typeEmail(MailID)
		.typePhoneCountry(phCountryCd)
		.typePhoneArea(phAreaCd)
		.typePhoneNumber(phNo)
		.clickCreateLeadButton()
		.verifyLeadIsCreated();
	}
}
