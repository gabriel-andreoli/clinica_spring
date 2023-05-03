package projeto.clinica.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "pacientes")
public class Paciente implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;
  private String email;
  private Character sexo;

  public Paciente(){}

  public Paciente(Long id, String nome, String email, Character sexo) {
    this.id = id;
    this.nome = nome;
    this.email = email;
    this.sexo = sexo;
  }

  public Long getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Character getSexo() {
    return sexo;
  }

  public void setSexo(Character sexo) {
    this.sexo = sexo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Paciente paciente = (Paciente) o;
    return id.equals(paciente.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
