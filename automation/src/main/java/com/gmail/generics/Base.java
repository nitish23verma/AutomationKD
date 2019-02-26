package com.gmail.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Base implements Constants {
	protected WebDriver driver;

	@BeforeSuite
	public void launchBrowser() {

		if (BROWSER.equalsIgnoreCase("chrome")) {
			Reporter.log("Opening Chrome Browser...", true);
			System.setProperty("webdriver.chrome.driver", "./jars/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(URL);

		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			Reporter.log("Opening Firefox Browser...", true);
			System.setProperty("webdriver.gecko.driver", "./jars/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(URL);

		} else if (BROWSER.equalsIgnoreCase("internet explorer")) {
			Reporter.log("Opening IE Browser...", true);
			System.setProperty("webdriver.ie.driver", "./jars/ie.exe");
			driver = new InternetExplorerDriver();
			driver.get(URL);

		} else {
			Reporter.log("Browser not listed or Invalid Browser!!", true);
		}
	}

	@AfterSuite
	public void closeBrowser() {
		try {

		} finally {
			driver.close();
			Reporter.log("Closing Browser...", true);
		}
	}
}
