package main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Exemplu1 {

  // Amber, Loom, Valhalla, Panama
  public static void main(String[] args) {

    Map<Integer, List<String>> map1 = m();

    var map2 = m();  // nu este universal acceptata

    var r1 = new Random();  // situatie universal acceptata

    var s1 = "Hello";

  }

  public static Map<Integer, List<String>> m() {
    return null;
  }
}
