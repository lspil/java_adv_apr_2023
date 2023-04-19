package com.example.ja_d1_e4.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DemoService implements IDemoService {

  @Transactional
  public void demo() {
    System.out.println("Demo");
  }
}
