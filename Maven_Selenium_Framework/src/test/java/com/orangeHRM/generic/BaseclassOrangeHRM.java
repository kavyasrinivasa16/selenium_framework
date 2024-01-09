package com.orangeHRM.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseclassOrangeHRM implements Frameworkconstant{
	public WebDriver driver;
	@BeforeMethod
	public void openApp()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("---start-maximized");
		driver=new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(base_url);
	}
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}
}

