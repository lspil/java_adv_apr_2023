package main;

import obj.IProductService;
import obj.ProductService;

import java.lang.reflect.Proxy;

public class Main {

  public static void main(String[] args) {

    IProductService productService = (IProductService) Proxy.newProxyInstance(Main.class.getClassLoader(),
        new Class[]{IProductService.class},
        new MyFrameworkAOPInterceptor());

    productService.doSmthWithProduct("hello");
  }
}
