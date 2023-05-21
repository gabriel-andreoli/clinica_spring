package projeto.clinica.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.*;

@Entity
@Table(name = "tipo_pagamentos")
public class TipoPagamento implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String descricao;

  @OneToMany(mappedBy = "tipoPagamento")
  private Set<Consulta> consultas = new HashSet<>();

  public TipoPagamento(){}

  public TipoPagamento(Long id, String descricao, Set<Consulta> consultas) {
    this.id = id;
    this.descricao = descricao;
    this.consultas = consultas;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  @JsonIgnore
  public Set<Consulta> getConsultas() {
    return consultas;
  }

  public void adicionarConsulta(Consulta consulta) {
    consultas.add(consulta);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TipoPagamento that = (TipoPagamento) o;
    return id.equals(that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
