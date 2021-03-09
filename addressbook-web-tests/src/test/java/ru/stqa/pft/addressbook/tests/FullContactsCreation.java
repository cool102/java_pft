package ru.stqa.pft.addressbook.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FullContactsCreation extends TestBase {


  @Test
  public void testFullContactsCreation() throws Exception {
    app.goToContactAddPage();
    app.fillContactCreation(new ContactData("Tagir", "Salyakhov", "Almazovich", "89177938407", "olmik@bk.ru"));
    app.submitContactCreation();
    app.goToAllContactsPage();
  }


}
