package projeto.clinica.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.*;

@Entity
@Table(name = "profissionais")
public class Profissional extends Pessoa implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "preco_consulta")
  private Double precoConsulta;

  @Column(name = "grau_formacao")
  private String grauFormacao;

  @OneToMany(mappedBy = "profissional")
  private Set<Consulta> consultas = new HashSet<>();

  @OneToMany(mappedBy = "id.profissional")
  private ProfissionalAreaAtuacao profissionalAreaAtuacao;

  public Profissional(){}
  public Profissional(Long id, String nome, String email, String sexo, Double precoConsulta, String grauFormacao, Set<Consulta> consultas, ProfissionalAreaAtuacao profissionalAreaAtuacao) {
    super(nome, email, sexo);
    this.id = id;
    this.precoConsulta = precoConsulta;
    this.grauFormacao = grauFormacao;
    this.consultas = consultas;
    this.profissionalAreaAtuacao = profissionalAreaAtuacao;
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

  public String getGrauFormacao() {
    return grauFormacao;
  }

  public void setGrauFormacao(String grauFormacao) {
    this.grauFormacao = grauFormacao;
  }

  public ProfissionalAreaAtuacao getProfissionalAreaAtuacao() {
    return profissionalAreaAtuacao;
  }

  public void setProfissionalAreaAtuacao(ProfissionalAreaAtuacao profissionalAreaAtuacao) {
    this.profissionalAreaAtuacao = profissionalAreaAtuacao;
  }

  @JsonIgnore
  public Set<Consulta> getConsultas() {
    return consultas;
  }

  public void adicionarConsulta(Consulta consulta){
    consultas.add(consulta);
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
