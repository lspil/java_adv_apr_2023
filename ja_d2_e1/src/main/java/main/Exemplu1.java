package main;

public class Exemplu1 {

  public static void main(String[] args) {

//    Predicate p1 = new Predicate() {
//
//      @Override
//      public boolean test(int x) {
//        return x % 2 == 0;
//      }
//
//    };

    Predicat p1 = x -> x % 2 == 0;
    boolean b1 = p1.test(3); // false
    boolean b3 = p1.test(8);

    Predicat p2 = x -> x < 10;

    boolean b2 = p2.test(6);

    Runnable r1 = () -> System.out.println(":)");

  }
}
