package com.akami.test;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.akami.init.SeleniumInit;

public class TestIndex extends SeleniumInit{

	@Test
	public void sideMenu() throws IOException, AWTException{

		int numOfFailure=0;
		int step=1;

		logStep(step++,"Open URL : "+testUrl);	

		logStep(step++,"click on side menu.");
		testVerification = testIndexPage.sideMenu();
		log("clicked");

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		} 

	}
}
