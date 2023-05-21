package projeto.clinica.entities.dto;

import projeto.clinica.entities.Consulta;
import projeto.clinica.entities.TipoPagamento;

import java.util.HashSet;
import java.util.Set;

public class TipoPagamentoDTO {
  private Long id;
  private String descricao;
  private Set<Consulta> consultas = new HashSet<>();

  public TipoPagamentoDTO(){}
  public TipoPagamentoDTO(TipoPagamento tipoPagamento){
    this.id = tipoPagamento.getId();
    this.descricao = tipoPagamento.getDescricao();
    this.consultas.addAll(tipoPagamento.getConsultas());
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

  public Set<Consulta> getConsultas() {
    return consultas;
  }
}
