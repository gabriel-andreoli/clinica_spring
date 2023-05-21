package projeto.clinica.entities.dto;

import org.springframework.beans.BeanUtils;
import projeto.clinica.entities.AreaAtuacao;
import projeto.clinica.entities.ProfissionalAreaAtuacao;

public class AreaAtuacaoDTO {
  private Long id;
  private String descricao;
  private ProfissionalAreaAtuacao profissionalAreaAtuacao;

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

  public ProfissionalAreaAtuacao getProfissionalAreaAtuacao() {
    return profissionalAreaAtuacao;
  }

  public void setProfissionalAreaAtuacao(ProfissionalAreaAtuacao profissionalAreaAtuacao) {
    this.profissionalAreaAtuacao = profissionalAreaAtuacao;
  }
}
