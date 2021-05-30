package pages;

import hooks.TestNgHooks;

public class ViewLeadPage extends TestNgHooks {
	
	public ViewLeadPage verifyLeadIsCreated() {
		verifyPartialTitle("View Lead");
		return this;
	}

}
