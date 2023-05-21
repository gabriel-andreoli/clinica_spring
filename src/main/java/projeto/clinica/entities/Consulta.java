package projeto.clinica.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "consultas")
public class Consulta implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "paciente_id")
  private Paciente paciente;

  @ManyToOne
  @JoinColumn(name = "profissional_id")
  private Profissional profissional;

  @ManyToOne
  @JoinColumn(name = "tipo_pagamento_id")
  private TipoPagamento tipoPagamento;

  @Column(name = "preco_total_consulta")
  private Double precoTotalConsulta;

  @Column(name = "data_consulta")
  private String dataConsulta;

  public Consulta(){}

  public Consulta(Long id, Paciente paciente, Profissional profissional, TipoPagamento tipoPagamento, Double precoTotalConsulta, String dataConsulta) {
    this.id = id;
    this.paciente = paciente;
    this.profissional = profissional;
    this.tipoPagamento = tipoPagamento;
    this.precoTotalConsulta = precoTotalConsulta;
    this.dataConsulta = dataConsulta;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Paciente getPaciente() {
    return paciente;
  }

  public void setPaciente(Paciente paciente) {
    this.paciente = paciente;
  }

  public Profissional getProfissional() {
    return profissional;
  }

  public void setProfissional(Profissional profissional) {
    this.profissional = profissional;
  }

  public TipoPagamento getTipoPagamento() {
    return tipoPagamento;
  }

  public void setTipoPagamento(TipoPagamento tipoPagamento) {
    this.tipoPagamento = tipoPagamento;
  }

  public Double getPrecoTotalConsulta() {
    return precoTotalConsulta;
  }

  public void setPrecoTotalConsulta(Double precoTotalConsulta) {
    this.precoTotalConsulta = precoTotalConsulta;
  }

  public String getDataConsulta() {
    return dataConsulta;
  }

  public void setDataConsulta(String dataConsulta) {
    this.dataConsulta = dataConsulta;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Consulta consulta = (Consulta) o;
    return id.equals(consulta.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
