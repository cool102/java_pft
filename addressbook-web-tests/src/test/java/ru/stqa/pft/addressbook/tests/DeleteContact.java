package ru.stqa.pft.addressbook.tests;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DeleteContact extends TestBase {
  private WebDriver wd;


  @Test
  public void testDeleteContact(String idOfcontacts) throws Exception {
    app.goToContactAddPage();
    app.selectContact(idOfcontacts);
    app.deleteSelectedContact();

  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    wd.quit();

  }

  private boolean isElementPresent(By by) {
    try {
      wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }




}
