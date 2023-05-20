package projeto.clinica.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class ProfissionalAreaAtuacaoPK {
  @ManyToOne
  @JoinColumn(name = "profissional_id")
  private Profissional profissional;
  @ManyToOne
  @JoinColumn(name = "area_atuacao_id")
  private AreaAtuacao areaAtuacao;

  public ProfissionalAreaAtuacaoPK(){}
  public ProfissionalAreaAtuacaoPK(Profissional profissional, AreaAtuacao areaAtuacao){
    this.profissional = profissional;
    this.areaAtuacao = areaAtuacao;
  }

  public Profissional getProfissional() {
    return profissional;
  }

  public void setProfissional(Profissional profissional) {
    this.profissional = profissional;
  }

  public AreaAtuacao getAreaAtuacao() {
    return areaAtuacao;
  }

  public void setAreaAtuacao(AreaAtuacao areaAtuacao) {
    this.areaAtuacao = areaAtuacao;
  }
}
