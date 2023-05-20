package projeto.clinica.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "profissional_area_atuacao")
public class ProfissionalAreaAtuacao implements Serializable {
  @EmbeddedId
  private ProfissionalAreaAtuacaoPK id = new ProfissionalAreaAtuacaoPK();

  public ProfissionalAreaAtuacao(){}
  public ProfissionalAreaAtuacao(Profissional profissional, AreaAtuacao areaAtuacao){
    id.setProfissional(profissional);
    id.setAreaAtuacao(areaAtuacao);
  }

  public ProfissionalAreaAtuacaoPK getId() {
    return id;
  }

  public void setId(ProfissionalAreaAtuacaoPK id) {
    this.id = id;
  }
}
