package projeto.clinica.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "areas_atuacoes")
public class AreaAtuacao {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String descricao;

  @OneToMany(mappedBy = "id.areaAtuacao")
  private Set<ProfissionalAreaAtuacao> profissionalAreaAtuacoes = new HashSet<>();

  public AreaAtuacao(){}

  public AreaAtuacao(Long id, String descricao, Set<ProfissionalAreaAtuacao> profissionalAreaAtuacao) {
    this.id = id;
    this.descricao = descricao;
    this.profissionalAreaAtuacoes.addAll(profissionalAreaAtuacoes);
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

  @JsonIgnore
  public Set<ProfissionalAreaAtuacao> getProfissionalAreaAtuacoes() {
    return profissionalAreaAtuacoes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AreaAtuacao that = (AreaAtuacao) o;
    return id.equals(that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
