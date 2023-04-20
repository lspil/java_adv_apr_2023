package main;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exemplu21 {

  public static void main(String[] args) {
    // Optional

    Optional<String> str1 = Optional.of("hello");
    Optional<String> str2 = Optional.empty();

    long len1 = str1.map(s -> s.length()).orElse(0);
    long len2 = str1.map(s -> s.length()).orElseThrow(() -> new RuntimeException(":("));

    str1.ifPresentOrElse(
        x -> {
          System.out.println(x);
        }, () -> {
          System.out.println("Nu exista valoare");
    });

  }
}
