package projeto.clinica.entities.dto;

import org.springframework.beans.BeanUtils;
import projeto.clinica.entities.AreaAtuacao;

public class AreaAtuacaoDTO {
  private Long id;
  private String descricao;

  public AreaAtuacaoDTO(){}

  public AreaAtuacaoDTO(AreaAtuacao areaAtuacao) {
    BeanUtils.copyProperties(areaAtuacao, this);
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
