package com.gmail.login;

import org.testng.annotations.Test;

import com.gmail.generics.Base;
import com.gmail.pom.Home;
import com.gmail.pom.SignIn;

public class TestLogin extends Base {

	@Test
	public void testLogin() throws InterruptedException {
		SignIn signin = new SignIn(driver);
		signin.enterEmail(EMAIL);
		signin.clickNext();
		Thread.sleep(2000);
		signin.enterPassword(PASSWORD);
		signin.clickLogin();
	}

	@Test
	public void testLogout() throws InterruptedException {
		Thread.sleep(10000);
		Home home = new Home(driver);
		home.clickAccountOptions();
		home.clickSignOut();
	}

}
