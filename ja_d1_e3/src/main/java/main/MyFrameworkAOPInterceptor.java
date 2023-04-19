package main;

import obj.IProductService;
import obj.ProductService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyFrameworkAOPInterceptor implements InvocationHandler {

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

    if (method.getName().equals("doSmthWithProduct")) {  // este metoda adnotata cu @Transactional ?
      System.out.println("Ceva intainte");   // deschide o tranzactie noua
      ProductService productService = new ProductService();
      String p1 = String.valueOf(args[0]);
      productService.doSmthWithProduct(new StringBuilder(p1).reverse().toString());
      System.out.println("Ceva dupa");  // commite tranzactia
    }

    return null;
  }
}
