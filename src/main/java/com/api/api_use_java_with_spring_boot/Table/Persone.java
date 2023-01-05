package com.api.api_use_java_with_spring_boot.Table;

import jakarta.persistence.*;

@Entity
public class Persone {

  @Id
  @GeneratedValue
  private Long id;

  private String nome;
  private String cognome;
  private String eta;

  public Long getId() {
    return this.id;
  }

  public String getNome() {
    return this.nome;
  }

  public String getCognome() {
    return this.cognome;
  }

  public String getEta() {
    return this.eta;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  public void setEta(String eta) {
      this.eta = eta;
  }
  
  Persone() {
  }
  
  Persone(String nome, String cognome, String eta) {
    this.nome = nome;
    this.cognome = cognome;
    this.eta = eta;
  }
}
