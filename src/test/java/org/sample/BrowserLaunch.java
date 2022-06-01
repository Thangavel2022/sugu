package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Web Driver\\Drivers\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

}
