package ru.stqa.pft.addressbook;

public class ContactData {
  private final String firstname;
  private final String familiya;
  private final String otchestvo;
  private final String mobilephone;
  private final String email;

  public ContactData(String firstname, String familiya, String otchestvo, String mobilephone, String email) {
    this.firstname = firstname;
    this.familiya = familiya;
    this.otchestvo = otchestvo;
    this.mobilephone = mobilephone;
    this.email = email;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getFamiliya() {
    return familiya;
  }

  public String getOtchestvo() {
    return otchestvo;
  }

  public String getMobilephone() {
    return mobilephone;
  }

  public String getEmail() {
    return email;
  }
}
