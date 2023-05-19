package projeto.clinica.entities;

import jakarta.persistence.*;
import projeto.clinica.entities.enumerate.GrauFormacaoEnum;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "profissionais")
public class Profissional extends Pessoa implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private Double precoConsulta;
  @Enumerated(EnumType.STRING)
  @Column(name = "grau_formacao")
  private GrauFormacaoEnum grauFormacao;

  @OneToMany(mappedBy = "profissional")
  private List<Consulta> consultas = new ArrayList<>();

  public Profissional(Long id, String nome, String email, String sexo, Double precoConsulta, GrauFormacaoEnum grauFormacao) {
    super(nome, email, sexo);
    this.id = id;
    this.precoConsulta = precoConsulta;
    this.grauFormacao = grauFormacao;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Double getPrecoConsulta() {
    return precoConsulta;
  }

  public void setPrecoConsulta(Double precoConsulta) {
    this.precoConsulta = precoConsulta;
  }

  public GrauFormacaoEnum getGrauFormacao() {
    return grauFormacao;
  }

  public void setGrauFormacao(GrauFormacaoEnum grauFormacao) {
    this.grauFormacao = grauFormacao;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    Profissional that = (Profissional) o;
    return id.equals(that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), id);
  }
}
