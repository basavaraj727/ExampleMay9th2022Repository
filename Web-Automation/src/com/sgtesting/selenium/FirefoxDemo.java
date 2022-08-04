package com.sgtesting.selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDemo {
	
public  static WebDriver oBrowser=null;
	public static void main(String[] args) {
		
		LaunchBrowser();
		naviagte();
		closeApplication();
		
	}
	private static void LaunchBrowser()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver","E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void naviagte()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			oBrowser.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
