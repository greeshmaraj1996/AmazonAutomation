package com.testSignin;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.SigninPage;

public class SigninTest extends BaseTest {

	@Test(enabled=false)
	public void Signin() {
		SigninPage obj1 = new SigninPage(driver);
		obj1.Click();
		obj1.EnterEmail("Email");
		obj1.SubmitEmail();
		obj1.EnterPass("Password");
		obj1.Submit();
	}

	@Test(priority=1)
	public void SigninButtonDisplayed() {
		//obj1.securitycode();
		Assert.assertEquals(obj1.VerifySigninButtonDisplayed(), true);

	}
	@Test(priority=2)
	public void EmailAlertmessageDisplayed() {
		//obj1.securitycode();
		Assert.assertEquals(obj1.VerifyAlertmessagedisplayed(),"Enter your email or mobile phone number");
	}
	@Test(priority=3)
	public void PasswordAlertmessageDisplayed() {
		//obj1.securitycode();
		obj1.Click();
		obj1.EnterEmail("Email");
		obj1.SubmitEmail();
		obj1.Submit();
		Assert.assertEquals(obj1.PasswordValidationDisplayed(),"Enter your password");
	}
}
