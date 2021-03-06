//: polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.
package com.course.ch08.polymorphism;
import java.util.*;

public class RandomShapeGenerator {
  private Random rand = new Random(47);
  public Shape next() {
    switch(rand.nextInt(4)) {
      default:
      case 0: return new Circle();
      case 1: return new Square();
      case 2: return new Triangle();
      case 3: return new Polygon();
    }
  }
} ///:~
