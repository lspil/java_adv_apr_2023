package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class Exemplu12 {

  public static void main(String[] args) {
    List<Integer> list = List.of(1,2,3,2,4,5,6,6,1,7);

    List<Integer> list1 =
      list.stream()
          .collect(Collectors.toList());

    Set<Integer> set1 =
        list.stream()
            .collect(Collectors.toSet());

    ArrayList<Integer> list2 =
        list.stream()
            .collect(Collectors.toCollection(() -> new ArrayList<>()));

//    ArrayList<Integer> list3 = new ArrayList<>();   code smell/antipattern
//    list.stream()
//        .forEach(x -> list3.add(x));

  }
}
