package projeto.clinica.entities.dto;

import org.springframework.beans.BeanUtils;
import projeto.clinica.entities.TipoPagamento;

public class TipoPagamentoDTO {
  private Long id;
  private String descricao;

  public TipoPagamentoDTO(){}
  public TipoPagamentoDTO(TipoPagamento tipoPagamento){
    BeanUtils.copyProperties(tipoPagamento, this);
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
}
