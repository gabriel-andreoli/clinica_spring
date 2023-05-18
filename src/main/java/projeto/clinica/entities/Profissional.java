package projeto.clinica.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "profissionais")
public class Profissional extends Pessoa implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private Double precoConsulta;

  public Profissional(Long id, String nome, String email, String sexo, Double precoConsulta) {
    super(nome, email, sexo);
    this.id = id;
    this.precoConsulta = precoConsulta;
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
