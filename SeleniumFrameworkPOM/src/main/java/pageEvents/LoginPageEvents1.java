package pageEvents;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import  org.testng.Assert;
import org.testng.IAnnotationTransformer;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.BaseTest;
import pageObjects.LoginPageElements1;
import utils.ElementFetch;

public class LoginPageEvents1 {
	ElementFetch ele = new ElementFetch();
	
	public void enterInvalidCredentials() {
		
		ele.getWebElement("XPATH", LoginPageElements1.email1).sendKeys("abc@gmail.com");
		ele.getWebElement("XPATH", LoginPageElements1.passwordField1).sendKeys("abjbjb");
		ele.getWebElement("XPATH", LoginPageElements1.loginText1).click();
		
	}
	public void verifyIfPopUpMessageIsDisplayed()  {
		
		
		Assert.assertTrue(ele.getWebElements("XPATH", LoginPageElements1.popUpMessage1).size()==0, "Element not found");
		
	}
	
	
}
