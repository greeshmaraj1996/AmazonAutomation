package com.pages;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Securitycode {
	WebDriver driver;
	public Securitycode(WebDriver driver) {
		this.driver=driver;
	}
	public void Entersecutitycode() {
		Scanner ab = new Scanner(System.in);
		System.out.println("enter the security code");
		String securitycode = ab.nextLine();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(securitycode);
		driver.findElement(By.xpath("//button[@class='a-button-text']")).click();
	}
	
	
}
