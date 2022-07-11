package com.akami.Login;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.akami.init.SeleniumInit;

public class LoginIndex extends SeleniumInit{

	@Parameters ({"email", "password"})
	@Test(description = "Do Login")
	public void login(String email, String password) throws IOException, AWTException{

		int numOfFailure=0;
		int step=1;

		logStep(step++,"Open URL : "+testUrl);	

		logStep(step++,"Do login with valid username and password.");
		loginVerification = loginIndexPage.doLogin(email, password);

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		} 

	}

	@Test
	public void logout() throws IOException{

		int numOfFailure=0;
		int step=1;

		logStep(step++,"Open URL : "+testUrl);	
		
		logStep(step++,"Click on 1st link.");
		loginVerification=loginIndexPage.logout();

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		} 

	}

}
