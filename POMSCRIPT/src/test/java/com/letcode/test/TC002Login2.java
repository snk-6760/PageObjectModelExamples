package com.letcode.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.letcode.pages.LoginPage;
import com.letcode.seleniumBase.LetcodeBase;

public class TC002Login2 extends LetcodeBase{

	@Test
	public void loginTest1() {
		
		LoginPage lp = new LoginPage(driver);
		boolean nameLabel = lp.getUserNameLabel();
		Assert.assertEquals(nameLabel, true);
		
		boolean passwordLabel = lp.getPasswordLabel();
		Assert.assertTrue(passwordLabel);

		
		new LoginPage(driver)
		.enterUserName("admin")
		.enterPassword("Nimmi#2611")
		.clickLogin();		
	}
}
