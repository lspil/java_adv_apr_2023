package main;

import annotations.CatName;
import obj.Cat;

public class Application {  // IoC  -> DI   /  AOP

//  @CatName(name = "Tom")
  private Cat c1;

  @CatName(name = "Leo")
  private Cat c2;

  @CatName
  private Cat c3;

  public void show() {
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
  }
}
