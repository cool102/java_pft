package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactsModif extends TestBase{

  @Test
  public void testContactsModif() throws Exception {
    app.getContactHelper().initContactEdition();
    app.getContactHelper().editContact("Tagir1", "89174942003");
    app.getContactHelper().submitContactsEdition();

  }

}
