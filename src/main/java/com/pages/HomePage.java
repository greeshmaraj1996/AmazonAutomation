package com.pages;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	By AddtoCart = By.id("a-autoid-1-announce");
	By Searchitem = By.id("twotabsearchtextbox");
	By Submitsearch = By.id("nav-search-submit-button");
	

	public void securitycode() {
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter the security code");
		String accesscode = ab.nextLine();
		driver.findElement(By.id("captchacharacters")).sendKeys(accesscode);
		driver.findElement(By.cssSelector("button[class='a-button-text']")).click();
	}

	public void Searchforproduct(String item) {
		driver.findElement(Searchitem).sendKeys(item);
		driver.findElement(Submitsearch).click();
	}

	public void SelectProductandAddtoCart() {
		String mainpage = driver.getWindowHandle();
		System.out.println("mainpageurl" + mainpage);

		WebElement scroll = driver.findElement(By.xpath("//span[normalize-space()='Apple iPhone 13 (128GB) - Starlight']"));
		Actions action = new Actions(driver);
		action.scrollToElement(scroll).perform();
		scroll.click();

		Set<String> allpages = driver.getWindowHandles();

		for (String page : allpages) {

			if (!page.equals(mainpage)) {
				driver.switchTo().window(page);
				break;
			}
		}
		driver.findElement(By.xpath("(//i[@class='a-icon a-accordion-radio a-icon-radio-inactive'])[1]")).click();
		
		//driver.findElement(By.id("add-to-wishlist-button-submit")).click();
		//driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
		
	}
	

}
