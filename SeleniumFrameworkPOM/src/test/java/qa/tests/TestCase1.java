package qa.tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;

public class TestCase1 extends BaseTest {
	ElementFetch ele = new ElementFetch();
	LoginPageEvents loginPage = new LoginPageEvents();
	@Test
	public void sampleMethodForEnteringCredentials() {
		loginPage.verifyIfLoginPageIsLoaded();
		loginPage.enterCredentials();
	}

}
