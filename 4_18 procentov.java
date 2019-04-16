package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class 418 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test418() throws Exception {
    driver.get("https://ndscalc.ru/");
    driver.findElement(By.id("sum")).click();
    driver.findElement(By.id("sum")).clear();
    driver.findElement(By.id("sum")).sendKeys("100");
    driver.findElement(By.id("setdef")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='начислить НДС'])[2]/following::input[2]")).click();
    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сумма без НДС'])[1]/following::td[1]")).getText(), "100");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сумма без НДС'])[1]/following::b[1]")).click();
    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сумма без НДС'])[1]/following::b[1]")).getText(), "выделить");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='выделить'])[1]/following::td[1]")).click();
    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='выделить'])[1]/following::td[1]")).getText(), "18");
    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='выделить'])[1]/following::td[2]")).getText(), "15.25");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='выделить'])[1]/following::td[3]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='выделить'])[1]/following::td[3]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='выделить'])[1]/following::td[3]")).click();
    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='выделить'])[1]/following::td[3]")).getText(), "84.75");
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
