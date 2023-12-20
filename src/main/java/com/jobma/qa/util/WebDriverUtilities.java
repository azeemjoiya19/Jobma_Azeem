package com.jobma.qa.util;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.jobma.qa.base.TestBase;

public class WebDriverUtilities  extends TestBase

{


	public WebDriverUtilities() throws IOException 
	{

	}

	public void switchTabs(WebDriver driver)
	{
		Set<String> child =driver.getWindowHandles();
		for(String b:child)
		{
			driver.switchTo().window(b);
		}

	}

	public static boolean checkElementIsClickable(WebElement ele)
	{
		try {

			ele.click();

			return true;
		}
		catch(Exception e)
		{

			return false;
		}
	}

	public static void wait(WebDriver driver1 ,int sec, WebElement ele)
	{


		WebDriverWait w =new WebDriverWait(driver1,sec);
		w.until(ExpectedConditions.elementToBeClickable(ele)).click();
		//ele.click();
	}

	

	public static void wait1(WebDriver driver ,int sec, WebElement ele)
	{
		WebDriverWait w = new WebDriverWait(driver, sec);
		WebElement e = w.until(ExpectedConditions.visibilityOf(ele));
	} 

}






