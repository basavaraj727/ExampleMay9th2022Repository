package com.sgtesting.objectmap;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class Objectmap {
	public static Properties prop=null;
	
	public Objectmap(String filename)
	{
		FileInputStream fin=null;
		try
		{
			fin=new FileInputStream(filename);
			prop=new Properties();
			prop.load(fin);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public By getLocator(String logicalname)
	{
		By by=null;
		try
		{
			String locatordetail=prop.getProperty(logicalname);
			String locator[]=locatordetail.split(",");
			String locatorname=locator[0];
			String locatorvalue=locator[1];
			switch (locatorname.toLowerCase())
			{
			case "id":
				 by=By.id(locatorvalue);
				 break;
			case "name":
				by=By.name(locatorvalue);
				break;
			case "xpath":
			    by=By.xpath(locatorvalue);
			    break;
			case "tagname":
				by=By.linkText(locatorvalue);
				break;
			case "cssselector":
				by=By.linkText(locatorvalue);
				break;
			case "className":
				by=By.className(locatorvalue);
				break;
			default:
				System.out.println("Invalid locator name!!!");
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return by;
	}

}
