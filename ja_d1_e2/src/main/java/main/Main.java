package main;

import annotations.CatName;
import obj.Cat;

import java.lang.reflect.Field;

public class Main {

  public static void main(String[] args) throws Exception {
    Application a = new Application();

    Class c = Class.forName("main.Application");
    Field[] fields = c.getDeclaredFields();

    for (Field f : fields) {
      f.setAccessible(true);
      if (f.isAnnotationPresent(CatName.class)) {
        CatName catName = f.getAnnotation(CatName.class);
        Cat cat = new Cat();
        cat.name = catName.name();
        f.set(a, cat);
      }
    }

    a.show();

  }
}
