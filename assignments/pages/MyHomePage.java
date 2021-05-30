package pages;

import hooks.TestNgHooks;

public class MyHomePage extends TestNgHooks{
	
	public MyLeadsPage clickLeadsTab() {
		click(locateElement("link", "Leads"));
		return new MyLeadsPage();
	}

}
