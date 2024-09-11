package qa.tests;

import org.testng.annotations.Test;


import base.BaseTest;
import pageEvents.LoginPageEvents1;
import utils.ElementFetch;

public class TestCase2 extends BaseTest{
	
	ElementFetch ele = new ElementFetch();
	LoginPageEvents1 loginPage1 = new LoginPageEvents1();
	@Test
	public void sampleMethodForEnteringCredentials() {
		loginPage1.enterInvalidCredentials();
		loginPage1.verifyIfPopUpMessageIsDisplayed();
	}

}

