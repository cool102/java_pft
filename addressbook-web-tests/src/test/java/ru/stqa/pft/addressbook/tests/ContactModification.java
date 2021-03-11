package com.example.tests;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import ru.stqa.pft.addressbook.appmanager.ContactHelper;

public class ContactModification  {
  private WebDriver wd;


  @Test
  public void testContactModification() throws Exception {

    pressEditButton();
    editContacts();
    pressUpdateButton();

  }

  private void pressUpdateButton() {
    wd.findElement(By.xpath("(//input[@name='update'])[2]")).click();
  }

  private void editContacts() {
    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).clear();
    wd.findElement(By.name("firstname")).sendKeys("Tagir1");
    wd.findElement(By.name("home")).click();
    wd.findElement(By.name("home")).clear();
    wd.findElement(By.name("home")).sendKeys("89174942003");
  }

  private void pressEditButton() {
    wd.findElement(By.xpath("//img[@alt='Edit']")).click();
  }

  @AfterClass(alwaysRun = true)
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



  private String closeAlertAndGetItsText() {
    try {
      Alert alert = wd.switchTo().alert();
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
