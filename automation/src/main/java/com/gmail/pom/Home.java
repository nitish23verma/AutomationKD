package com.gmail.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	@FindBy(xpath = "//a[@role='button'][contains(@aria-label,'Google Account:')]")
	private WebElement accountOptionsButton;

	@FindBy(xpath = "//a[text()='Sign out']")
	private WebElement signoutButton;

	public Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickAccountOptions() {
		accountOptionsButton.click();
	}

	public void clickSignOut() {
		signoutButton.click();
	}
}
