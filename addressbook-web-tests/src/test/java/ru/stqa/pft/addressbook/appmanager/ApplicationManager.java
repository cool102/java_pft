package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class ApplicationManager {

  private final ContactsHelper contactsHelper = new ContactsHelper();
  public WebDriver wd;
  public  SessionHelper sessionHelper;
  public   NavigationHelper navigationHelper;
  public  GroupHelper groupHelper = new GroupHelper();
  public  String baseUrl;
  public  boolean acceptNextAlert = true;
  public  StringBuffer verificationErrors = new StringBuffer();

  public void init() {
    contactsHelper.contactsHelper.wd = new FirefoxDriver();
    contactsHelper.contactsHelper.wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    contactsHelper.contactsHelper.wd.get("http://localhost/addressbook/addressbook/");
    groupHelper = new GroupHelper(contactsHelper.contactsHelper.wd);
    navigationHelper = new NavigationHelper(contactsHelper.contactsHelper.wd);
    sessionHelper = new SessionHelper(contactsHelper.contactsHelper.wd);
    sessionHelper.login("admin", "secret");
  }



  public void stop() {
    contactsHelper.contactsHelper.wd.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  public boolean isElementPresent(By by) {
    try {
      contactsHelper.contactsHelper.wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }



  public String closeAlertAndGetItsText() {
    try {
      Alert alert = contactsHelper.contactsHelper.wd.switchTo().alert();
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

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }

  public ContactsHelper getContactsHelper() {
    return contactsHelper.contactsHelper;
  }

  public ContactsHelper getContactsHelper() {
    return contactsHelper;
  }
}
