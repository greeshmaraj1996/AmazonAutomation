package com.pages;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninPage {

	WebDriver driver;

	public SigninPage(WebDriver driver) {
		this.driver = driver;
	}

	By Signin = By.id("nav-link-accountList-nav-line-1");
	By Email=By.id("ap_email");
	By submitEmail = By.id("continue");
	By password=By.id("ap_password");
	By submit=By.id("signInSubmit");
	By EmailalertText=By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div[2]/div[1]/form/div/div/div/div[1]/div[1]/div/div");
	By PasswordAlertText=By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[2]/div/form/div/div[1]/div[2]/div/div");

	public void Click() {
		driver.findElement(Signin).click();
	}
	
	public void EnterEmail(String mail) {
		driver.findElement(Email).sendKeys(mail);	
	}

	public void SubmitEmail() {
		driver.findElement(submitEmail).click();
	}
	public void EnterPass(String pass) {
		driver.findElement(password).sendKeys(pass);	
	}
	public void Submit() {
		driver.findElement(submit).click();
	}
	
	
	public boolean VerifySigninButtonDisplayed() 
	{
		return driver.findElement(Signin).isDisplayed();
	}
	public String VerifyAlertmessagedisplayed() {
		driver.findElement(Signin).click();
		driver.findElement(submitEmail).click();
		return driver.findElement(EmailalertText).getText();
	}
	public String PasswordValidationDisplayed() {
		
		return driver.findElement(PasswordAlertText).getText();
	}
	public void securitycode() 
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the security code");
		String accesscode=ab.nextLine();
		driver.findElement(By.id("captchacharacters")).sendKeys(accesscode);
		driver.findElement(By.cssSelector("button[class='a-button-text']")).click();
	}
}
