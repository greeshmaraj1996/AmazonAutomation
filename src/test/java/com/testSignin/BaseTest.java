package com.testSignin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import com.pages.CartPage;
import com.pages.HomePage;
import com.pages.ProductPage;
import com.pages.SigninPage;

public class BaseTest {
	WebDriver driver;
	SigninPage obj1;
	HomePage obj3;
	ProductPage obj4;
	CartPage obj5;

	
	@BeforeMethod
	public void SetUp() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		obj1=new SigninPage(driver);
		obj3=new HomePage(driver);
		obj4=new ProductPage(driver);
		obj5=new CartPage(driver);
		
	}
	
	
	//  @AfterMethod public void TearDown() { driver.close(); }
	 
}
