package com.testSignin;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {
	WebDriver driver;

	@Test
	public void AmazonHomepage() {
	//obj3.securitycode();
		obj1.Click();
		obj1.EnterEmail("greeshmaraj96@gmail.com");
		obj1.SubmitEmail();
		obj1.EnterPass("Greeshma@123");
		obj1.Submit();
	}

	@Test
	public void SelectProductHomePage() {
	//obj3.securitycode();
		obj1.Click();
		obj1.EnterEmail("greeshmaraj96@gmail.com");
		obj1.SubmitEmail();
		obj1.EnterPass("Greeshma@123");
		obj1.Submit();
		obj3.Searchforproduct("iphone");
		obj3.SelectProductandAddtoCart();
		obj4.WithMobileExchangeenabled();
		obj4.AddtoCart();
		obj5.FailedErrormessage();
	
		
	}
}