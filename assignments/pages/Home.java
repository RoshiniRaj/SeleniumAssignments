package pages;

import hooks.TestNgHooks;

public class Home extends TestNgHooks {
	
	public Login clickLogoutButton() {
		click(locateElement("class", "decorativeSubmit"));
		return new Login();
	}
	
	public Home getMessage() {
		verifyPartialText(locateElement("tag", "h2"), "Welcome");
		return this;
	}
	
	public MyHomePage clickCrmsfaLink() {
		click(locateElement("link", "CRM/SFA"));
		return new MyHomePage();
	}
	
	
	
	

}
