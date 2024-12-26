package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
	
	WebDriver driver;
	public CartPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By FailedText=By.xpath("//div[contains(text(),'Failed to add one or more items to cart')]");
	By Checkout=By.xpath("//input[@aria-labelledby='attach-sidesheet-checkout-button-announce']");
	By Otheritem=By.id("attach_accessory_dp_0-1");
	
	public void FailedErrormessage() {
		new WebDriverWait(driver,Duration.ofSeconds(2)).until(ExpectedConditions.elementToBeClickable(Otheritem));
		driver.switchTo().newWindow(WindowType.TAB).findElement(Otheritem).click();
		//String Errormessage = driver.findElement(FailedText).getText();
		//System.out.println(Errormessage);
		//driver.findElement(Otheritem).click();
		//driver.switchTo().newWindow(WindowType.TAB).findElement(Otheritem).click();
	}
	public void Checkout() {
		driver.findElement(Checkout).click();
	}
}
