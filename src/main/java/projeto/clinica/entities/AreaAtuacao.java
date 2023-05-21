package projeto.clinica.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "areas_atuacoes")
public class AreaAtuacao {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String descricao;

  @OneToMany(mappedBy = "id.areaAtuacao")
  private ProfissionalAreaAtuacao profissionalAreaAtuacao;

  public AreaAtuacao(){}

  public AreaAtuacao(Long id, String descricao, ProfissionalAreaAtuacao profissionalAreaAtuacao) {
    this.id = id;
    this.descricao = descricao;
    this.profissionalAreaAtuacao = profissionalAreaAtuacao;
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
