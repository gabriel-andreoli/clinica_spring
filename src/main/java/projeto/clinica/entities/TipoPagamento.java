package projeto.clinica.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tipo_pagamentos")
public class TipoPagamento implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String descricao;
  @OneToMany(mappedBy = "tipoPagamento")
  private List<Consulta> consultas = new ArrayList<>();

  public TipoPagamento(){}

  public TipoPagamento(Long id, String descricao) {
    this.id = id;
    this.descricao = descricao;
  }

  public Long getId() {
    return id;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public List<Consulta> getConsultas() {
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
