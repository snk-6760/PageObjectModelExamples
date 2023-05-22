package com.letcode.seleniumBase;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LetcodeBase {

	protected RemoteWebDriver driver = null;

	String URL = "https://dev166977.service-now.com/navpage.do";

	@BeforeMethod
	public void startApp() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(URL);

	}

	@AfterMethod
	public void closeApp() {
		driver.quit();
	}

}
