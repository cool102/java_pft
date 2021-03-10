package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class DeleteContact extends TestBase {


  @Test
  public void testDeleteContact() throws Exception {
    app.getContactsHelper().goToHomePage();
    app.getContactsHelper().selectContact();
    app.getContactsHelper().deleteSelectedContact();
  }


}
