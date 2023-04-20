package com.example.ex_hib_2.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "produse")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String nume;
  private int cantitate;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNume() {
    return nume;
  }

  public void setNume(String nume) {
    this.nume = nume;
  }

  public int getCantitate() {
    return cantitate;
  }

  public void setCantitate(int cantitate) {
    this.cantitate = cantitate;
  }
}
