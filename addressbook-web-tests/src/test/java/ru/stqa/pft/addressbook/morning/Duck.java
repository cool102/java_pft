package ru.stqa.pft.addressbook.morning;


import java.io.IOException;
import java.sql.SQLException;

class Test {

  static void run()  throws SQLException, IOException {
    System.out.println("in run()");
    throw new SQLException();
  }

  public static void main(String[] args) throws IOException{
  try {
    run();
  }
  catch (SQLException sqle) {
    System.out.println(sqle);
  }
  catch (Exception e) {
    System.out.println(e);
  }
  finally {
    System.out.println("finally() work");
  }
    System.out.println("after catch()");
  }
}


