package com.example.ja_d1_e4.controllers;

import com.example.ja_d1_e4.service.DemoService;
import com.example.ja_d1_e4.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  @Autowired
  private IDemoService demoService;

  @GetMapping("/")
  public void demo() {
    demoService.demo();
  }
}
