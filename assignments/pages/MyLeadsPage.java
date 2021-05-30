package pages;

import hooks.TestNgHooks;

public class MyLeadsPage extends TestNgHooks {
	public CreateLeadPage clickCreateLeadMenu() {
		click(locateElement("link", "Create Lead"));
		return new CreateLeadPage();
	}

}
