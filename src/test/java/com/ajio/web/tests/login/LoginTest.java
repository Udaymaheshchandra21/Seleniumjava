package com.ajio.web.tests.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.ajio.web.pages.login.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	LoginPage loginpage;
	WebDriver driver;
	@Test(priority=1)
	public void initAjioWebSite() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		loginpage=new LoginPage(driver);
    }
	
	@Test(priority = 2)
	
	public void loginWithInvalidDetalis(String number) throws InterruptedException
	{
		loginpage.clickOnSignIn();
		//loginpage.setMobileNumber("799554");
	}
	
	/*@Test(priority=2)
	
	
	public void verifyLoginWithInValidDetalis(String number) throws InterruptedException
	{
		Thread.sleep(2000);
		loginpage.enterEmailMobileNumber("799554");
	}*/
	

}
