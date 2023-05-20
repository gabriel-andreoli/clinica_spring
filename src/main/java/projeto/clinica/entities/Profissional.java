package projeto.clinica.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

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

  @Column(name = "preco_consulta")
  private Double precoConsulta;

  @Column(name = "grau_formacao")
  private String grauFormacao;

  @OneToMany(mappedBy = "profissional")
  private List<Consulta> consultas = new ArrayList<>();

  public Profissional(){}
  public Profissional(Long id, String nome, String email, String sexo, Double precoConsulta, String grauFormacao) {
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

  public String getGrauFormacao() {
    return grauFormacao;
  }

  public void setGrauFormacao(String grauFormacao) {
    this.grauFormacao = grauFormacao;
  }

  @JsonIgnore
  public List<Consulta> getConsultas() {
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
