package projeto.clinica.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "consultas")
public class Consulta implements Serializable {
  @EmbeddedId
  private ConsultaPK id = new ConsultaPK();

  @ManyToOne
  @JoinColumn(name = "tipo_pagamento_id")
  private TipoPagamento tipoPagamento;

  @Column(name = "preco_total_consulta")
  private Double precoTotalConsulta;

  @Column(name = "data_consulta")
  private String dataConsulta;


  public Consulta(){}

  public Consulta(ConsultaPK id, Profissional profissional, Paciente paciente, TipoPagamento tipoPagamento, Double precoTotalConsulta, String dataConsulta) {
    id.setProfissional(profissional);
    id.setPaciente(paciente);
    this.tipoPagamento = tipoPagamento;
    this.precoTotalConsulta = precoTotalConsulta;
    this.dataConsulta = dataConsulta;
  }

  public ConsultaPK getId() {
    return id;
  }

  public void setId(ConsultaPK id) {
    this.id = id;
  }

  public TipoPagamento getTipoPagamento() {
    return tipoPagamento;
  }

  public Double getPrecoTotalConsulta() {
    return precoTotalConsulta;
  }

  public void setTipoPagamento(TipoPagamento tipoPagamento) {
    this.tipoPagamento = tipoPagamento;
  }

  public String getDataConsulta() {
    return dataConsulta;
  }

  public void setDataConsulta(String dataConsulta) {
    this.dataConsulta = dataConsulta;
  }

  public Double setPrecoTotalConsulta(Double taxaPorcentagem){
    Double precoConsultaProfissional = id.getProfissional().getPrecoConsulta();
    return precoConsultaProfissional + (taxaPorcentagem/100 * precoConsultaProfissional);
  }

}
