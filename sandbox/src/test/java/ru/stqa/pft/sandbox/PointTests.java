package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test

  public void testPoint() {
    Point p1 = new Point(1,10);
    Point p2 = new Point(6,1);

    //Assert.assertEquals(p1.distance(p2),25);
    Assert.assertEquals(p1.distance(p2),10.395630140987);


  }
}
