package com.seald.firstpreview;

public sealed class Rectangle extends Shape permits FilledRectangle,EmptyRectangle {

  private final double width;
  private final double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }
}