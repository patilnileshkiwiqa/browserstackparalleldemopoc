package com.akami.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.akami.Login.LoginVerification;
import com.akami.init.AbstractPage;
import com.akami.init.Common;

public class TestIndexPage extends AbstractPage {

	public TestIndexPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement clickRightArrow;
	@FindBy(xpath="//a[@id='about_sidebar_link']")
	WebElement aboutClick;

	public TestVerification sideMenu() {

		Common.pause(2);
		Common.clickableElement(clickRightArrow, driver);
		Common.clickOn(driver, clickRightArrow);
		
		log("clicked on right arrow");
		Common.pause(2);
		Common.clickOn(driver, aboutClick);
		log("clicked on about");
		return new TestVerification(driver);
	}

}


