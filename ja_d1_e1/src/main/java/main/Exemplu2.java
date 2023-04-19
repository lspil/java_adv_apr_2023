package main;

import exceptions.ButtonAtWrongPositionException;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Exemplu2 {

  public static void main(String[] args) {
    try {
      Class catClass = Class.forName("obj.Cat");
      Constructor constructor = catClass.getDeclaredConstructor();
      constructor.setAccessible(true);

      Object cat = constructor.newInstance();
      System.out.println(cat);

      Method m = catClass.getDeclaredMethod("sayMeow");
      m.setAccessible(true);
      m.invoke(cat);
    } catch (Exception e) {
      throw new ButtonAtWrongPositionException(); // unchecked
    }
  }
}
