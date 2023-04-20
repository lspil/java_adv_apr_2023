package main;

import java.util.List;
import java.util.stream.Stream;

public class Exemplu10 {

  public static void main(String[] args) {

    // s.split("")   Ana  A n a

    List<String> list = List.of("Ana", "are", "mere");
    // aflati daca toate caracterele sunt vocale

    List<String> vowels = List.of("a", "e", "i", "o", "u");

    boolean res =
      list.stream()
          .flatMap(s -> Stream.of(s.split("")))
          .map(s -> s.toLowerCase())
          .allMatch(s -> vowels.contains(s));

    System.out.println(res);
  }
}
