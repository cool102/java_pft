package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletion extends TestBase {


  @Test
  public void testContactDeletion() throws Exception {
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContact();
    app.getNavigationHelper().goToHomePage();

  }


}



