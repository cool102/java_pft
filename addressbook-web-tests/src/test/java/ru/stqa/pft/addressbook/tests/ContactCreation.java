package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreation extends TestBase {


  @Test
  public void testContactCreation() throws Exception {

    app.getContactsHelper().addNewContact();
    app.getContactsHelper().fillContactForm(new ContactData("Tagir", "Salyakhov", "Almazovich", "89174942002", "olmik@bk.ru"));
    app.getContactsHelper().submitContactCreation();
    app.getContactsHelper().goToHomePage();
  }


}
