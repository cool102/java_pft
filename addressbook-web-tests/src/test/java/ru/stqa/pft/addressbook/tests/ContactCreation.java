package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreation extends TestBase {

  @Test
  public void testContactCreation() throws Exception {

    app.getContactHelper().addNewContact();
    app.getContactHelper().fillContactForm(new ContactData("Tagir", "Salyakhov", "Almazovich", "89174942002", "olmik@bk.ru"));
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().goToHomePage();
  }

}




