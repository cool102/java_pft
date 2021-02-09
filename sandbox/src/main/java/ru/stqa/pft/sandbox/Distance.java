package ru.stqa.pft.sandbox;

public class Distance {
  public static void main(String[] args) {

    Point p1 = new Point(1,10);
    System.out.println("Координаты точки p1: " + " x1 = "+ p1.x + ", y1 = " + p1.y);

    Point p2 = new Point(6,1);
    System.out.println("Координаты точки p2: " + " x2 = "+ p2.x + ", y2 = " + p2.y);


    System.out.println ("Расстояние между точками p1 и p2 = " + Point.distance(p1,p2));
  }
}
