package com.letcode.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.letcode.seleniumBase.LetcodeBase;

public class LoginPage extends LetcodeBase {

	public LoginPage(RemoteWebDriver driver) {
		
		this.driver = driver;
	}
	
	//RemoteWebDriver driver = null;

	//locators

	public boolean getUserNameLabel(){
		return driver.findElement(By.xpath("//label[.='User name']")).isDisplayed();
	}

	public boolean getPasswordLabel(){
		return driver.findElement(By.xpath("//label[.='Password']")).isDisplayed();
	}





	//Actions
	/**
	 * 
	 * @description - get the data user and type on the username field
	 * @param username-pass the user to be login
	 * @return 
	 */

	public LoginPage enterUserName(String username){
		driver.findElement(By.id("user_name")).sendKeys(username);
		return this;
	}
	
	public LoginPage enterPassword(String pass){
		driver.findElement(By.id("user_password")).sendKeys(pass);
		return this;
	}

	public DashboardPage clickLogin(){
		driver.findElement(By.id("sysverb_login")).click();
		return new DashboardPage();
	}
	
	public ForgotPasswordPage clickForgotPassword(){
		driver.findElement(By.linkText("Forgot Password ?")).click();
		return new ForgotPasswordPage();
	}

	/**
	 * @description - this function used to login into the service now application
	 * @param username
	 * @param pass
	 */
	public void login(String username, String pass) {

		enterUserName(username);
		enterPassword(pass);
		clickLogin();

	}

}
