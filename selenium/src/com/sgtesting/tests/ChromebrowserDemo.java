package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromebrowserDemo  {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		closeApplication();
	}
	private static void LaunchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\selenium\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
   		}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
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



