package com.sgtesting.objectmap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutDemo {
	public static String filename=null;
	public static WebDriver oBrowser=null;
	public static Objectmap objmap=null;
	public static void main(String[] args) {
	
		launchBrowser();
		navigate();
		login();
		minimizeflyoutwindow();
		logout();
		closeApplication();
	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\CurrentWorkSpace\\ExampleMay9th2022Repository\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			String path=System.getProperty("user.dir");
			System.out.println(path);
			filename=path+"\\Objectmap\\objectmap.properties";
			objmap=new Objectmap(filename);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost/login.do");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("loginpageusername")).sendKeys("admin");
			oBrowser.findElement(objmap.getLocator("loginpagepassword")).sendKeys("manager");
			oBrowser.findElement(objmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeflyoutwindow()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("homepageflyoutwin")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
		oBrowser.findElement(objmap.getLocator("homepagelogoutlink")).click();
		Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
}
