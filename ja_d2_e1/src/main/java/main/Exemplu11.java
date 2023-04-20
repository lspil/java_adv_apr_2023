package main;

import java.util.List;
import java.util.stream.Stream;

public class Exemplu11 {

  public static void main(String[] args) {

    // s.split("")   Ana  A n a

    List<String> list = List.of("Ana", "are", "mere");
    // aflati daca toate caracterele sunt vocale

    List<String> vowels = List.of("a", "e", "i", "o", "u");

    long res =
      list.stream()
          .flatMap(s -> Stream.of(s.split("")))
          .map(s -> s.toLowerCase())
          .filter(s -> vowels.contains(s))
          .count();

    System.out.println(res);
  }
}
