package com.seald.firstpreview;

public final class Circle extends Shape implements TestInterface{
  private final double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }
}
