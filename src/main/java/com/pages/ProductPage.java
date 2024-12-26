package com.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
	WebDriver driver;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}

	By Productsize = By.xpath("//input[@aria-labelledby='size_name_0-announce']");
	By AddtoCart = By.id("add-to-cart-button");
	By CheckBox = By.id("mbb-offeringID-1");
	By withExchange = By.xpath("(//i[@class='a-icon a-accordion-radio a-icon-radio-inactive'])[1]");
	By ChoosePhone = By.xpath("//input[@aria-labelledby='chooseButton-announce']");
	By Dropdown = By.id("buyBackDropDown1Id");
	By model = By.xpath("(//span[@role='button'])[5]");
	By Phonecondition = By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]");
	By NoDamage = By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]");
	By Proceed = By.xpath("//input[@aria-labelledby='value-commensurate-with-granularity-continue-button-announce']");
	By close = By.xpath("(//i[@class='a-icon a-icon-close'])[1]");
	By withoutExchange = By.xpath("(//i[@class='a-icon a-accordion-radio a-icon-radio-inactive'])[1]");

	public void Chooseproductsize() {
		WebElement scrol = driver.findElement(Productsize);
		Actions act = new Actions(driver);
		act.scrollToElement(scrol).perform();
		scrol.click();

	}

	public void ClickonCheckBox() {

		driver.findElement(CheckBox).click();
	}

	public void WithMobileExchangeenabled() {
		// driver.findElement(withExchange).click();
		driver.findElement(ChoosePhone).click();
		driver.findElement(Dropdown).click();
		List<WebElement> phone = driver
				.findElements(By.xpath("//div[@class='a-popover-inner a-lgtbox-vertical-scroll']//li"));
		for (int i = 0; i < phone.size(); i++) {
			System.out.println(phone.get(i).getText());
			if (phone.get(i).getText().contains("BlackBerry")) {
				phone.get(i).click();
				break;
			}
		}
		driver.findElement(model).click();
		List<WebElement> modellist = driver.findElements(
				By.xpath("//div[@style=\"height: auto; overflow-y: auto; min-width: 191.838px; width: auto;\"]//li"));
		for (int j = 0; j < modellist.size(); j++) {
			if (modellist.get(j).getText().contains("KeyOne")) {
				modellist.get(j).click();
			}
		}
		WebElement value = new WebDriverWait(driver, Duration.ofSeconds(2))
				.until(ExpectedConditions.visibilityOfElementLocated(NoDamage));
		value.click();
		driver.findElement(Proceed).click();
		WebElement finish = new WebDriverWait(driver, Duration.ofSeconds(2))
				.until(ExpectedConditions.elementToBeClickable(close));
		finish.click();
	}

	public void AddtoCart() {
		// driver.findElement(withoutExchange).click();
		WebElement value = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.elementToBeClickable(withoutExchange));
		value.click();
		new WebDriverWait(driver, Duration.ofSeconds(2))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='add-to-cart-button'])[2]")))
				.click();
	}
}
