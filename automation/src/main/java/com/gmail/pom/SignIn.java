package com.gmail.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {

	@FindBy(xpath = "//input[@type='email']")
	private WebElement emailTextbox;

	@FindBy(id = "identifierNext")
	private WebElement nextButton;

	@FindBy(name = "password")
	private WebElement passwordTextbox;

	@FindBy(id = "passwordNext")
	private WebElement passwordnextButton;

	public SignIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterEmail(String userName) {
		emailTextbox.clear();
		emailTextbox.sendKeys(userName);
	}

	public void clickNext() {
		nextButton.click();
	}

	public void enterPassword(String password) {
		passwordTextbox.clear();
		passwordTextbox.sendKeys(password);
	}

	public void clickLogin() {
		passwordnextButton.click();
	}
}
