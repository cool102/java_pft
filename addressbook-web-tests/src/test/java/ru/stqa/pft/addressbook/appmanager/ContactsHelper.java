package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactsHelper {
  protected final ContactsHelper contactsHelper = new ContactsHelper();
  public WebDriver wd;

  public void submitContactCreation() {
    wd.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
  }

  public void fillContactForm(ContactData contactData) {
    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).clear();
    wd.findElement(By.name("firstname")).sendKeys(contactData.getFirstname());
    wd.findElement(By.name("middlename")).clear();
    wd.findElement(By.name("middlename")).sendKeys(contactData.getFamiliya());
    wd.findElement(By.name("lastname")).clear();
    wd.findElement(By.name("lastname")).sendKeys(contactData.getOtchestvo());
    wd.findElement(By.name("home")).click();
    wd.findElement(By.name("home")).clear();
    wd.findElement(By.name("home")).sendKeys(contactData.getMobilephone());
    wd.findElement(By.name("email")).click();
    wd.findElement(By.name("email")).clear();
    wd.findElement(By.name("email")).sendKeys(contactData.getEmail());
  }

  public void addNewContact() {
    wd.findElement(By.linkText("add new")).click();
  }

  public void deleteSelectedContact() {
    wd.findElement(By.xpath("//input[@value='Delete']")).click();
    wd.switchTo().alert().accept();
  }

  public void selectContact() {
    wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[2]/td")).click();
    wd.findElement(By.id("10")).click();
  }

  public void goToHomePage() {
    contactsHelper.wd.findElement(By.linkText("home page")).click();
  }
}
