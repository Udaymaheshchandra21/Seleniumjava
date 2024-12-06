package com.ajio.web.pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//span[@class='  login-form login-modal']")
	WebElement btnClickOnSignIn;
	
	@FindBy(xpath = "//input[@class='username remove-phonenumber-flownumberfield']")
	WebElement txtSetMobileNumber;


	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignIn() throws InterruptedException 
	{	
		Thread.sleep(2000);
		btnClickOnSignIn.click();
	}
	
	public void setMobileNumber(String number)
	{
		txtSetMobileNumber.sendKeys(number);
	}
}
	


