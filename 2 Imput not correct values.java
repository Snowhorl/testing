package com.example.tests;

import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import static org.apache.commons.lang3.StringUtils.join;

public class 2 {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.katalon.com/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void test2() throws Exception {
		selenium.open("https://ndscalc.ru/");
		selenium.click("id=sum");
		selenium.type("id=sum", "йцу");
		selenium.click("id=vat");
		selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='начислить НДС'])[2]/following::input[2]");
		assertEquals("0", selenium.getText("xpath=(.//*[normalize-space(text()) and normalize-space(.)='выделить'])[1]/following::td[3]"));
		selenium.click("id=sum");
		selenium.type("id=sum", "100");
		selenium.click("id=vat");
		selenium.click("id=vat");
		selenium.type("id=vat", "ыва");
		selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='начислить НДС'])[2]/following::input[2]");
		selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='выделить'])[1]/following::td[2]");
		selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='выделить'])[1]/following::td[2]");
		assertEquals("0", selenium.getText("xpath=(.//*[normalize-space(text()) and normalize-space(.)='выделить'])[1]/following::td[2]"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
