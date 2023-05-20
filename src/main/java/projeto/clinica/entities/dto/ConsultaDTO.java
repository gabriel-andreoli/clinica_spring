package projeto.clinica.entities.dto;

import org.springframework.beans.BeanUtils;
import projeto.clinica.entities.Consulta;
import projeto.clinica.entities.TipoPagamento;

public class ConsultaDTO {
  private Long id;
  private TipoPagamento tipoPagamento;
  private Double precoTotalConsulta;
  private String dataConsulta;

  public ConsultaDTO(){}
  public ConsultaDTO(Consulta consulta){
    BeanUtils.copyProperties(consulta, this);
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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
}
