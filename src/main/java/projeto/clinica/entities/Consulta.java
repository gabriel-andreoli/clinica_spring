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

  private Double precoConsulta;

  public Consulta(){}

  public Consulta(ConsultaPK id, TipoPagamento tipoPagamento, Double precoConsulta) {
    this.id = id;
    this.tipoPagamento = tipoPagamento;
    this.precoConsulta = precoConsulta;
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

  public Double getPrecoConsulta() {
    return precoConsulta;
  }

  public void setTipoPagamento(TipoPagamento tipoPagamento) {
    this.tipoPagamento = tipoPagamento;
  }

  public Double setPrecoConsulta(Double taxaPorcentagem){
    Double precoConsultaProfissional = id.getProfissional().getPrecoConsulta();
    return precoConsultaProfissional + (taxaPorcentagem/100 * precoConsultaProfissional);
  }

}
