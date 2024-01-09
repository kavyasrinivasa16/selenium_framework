package com.orangeHRM.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.orangeHRM.generic.BaseclassOrangeHRM;

public class loginscript extends BaseclassOrangeHRM{
	@Test
	public void login() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Paul Collings']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
}
