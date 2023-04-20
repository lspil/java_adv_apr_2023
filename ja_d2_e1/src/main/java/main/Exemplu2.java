package main;

import java.util.Random;
import java.util.UUID;
import java.util.function.*;

public class Exemplu2 {

  public static void main(String[] args) {
    // java.util.function

    /*
    1. Predicate<T>   -> Testeaza o valoare
    2. Function<T,R>
    3. BiFunction<T,G,R>
    4. Supplier<T>
    5. BiPredicate<T,G>    -> Testeaza doua valori
    6. UnaryOperator<T>
    7. BinaryOperator<T,G>
    8. Consumer<T>
    9. BiConsumer<T,G>
     */

    Predicate<Integer> p1 = x -> x % 2 == 0;
    Function<Integer, Boolean> pf1 = x -> x % 2 == 0;

    BiPredicate<Integer, Integer> p2 = (x,y) -> x > y;
    Predicate<String> p3 = x -> x.length() > 10;

    Supplier<String> s1 = () -> "Hello";
    Supplier<String> s2 = () -> UUID.randomUUID().toString();
    Supplier<Integer> s3 = () -> new Random().nextInt();

    Consumer<Integer> c1 = x -> System.out.println(x);
    BiConsumer<Integer, String> c2 = (x,y) -> System.out.println(x + " " + y);

    Function<Integer, Integer> f1 = x -> 2 * x;
    BiFunction<Integer, Integer, Integer> f2 = (x,y) -> x + y;

    UnaryOperator<Integer> uo1 = x -> 2 * x;
    BinaryOperator<Integer> bo1 = (x,y) -> x + y;

    DoubleBinaryOperator dbo1 = (x,y) -> x + y;
    BinaryOperator<Double> dbo2 = (x,y) -> x + y;
  }
}
