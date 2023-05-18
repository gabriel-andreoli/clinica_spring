package projeto.clinica.entities;

import jakarta.persistence.MappedSuperclass;

import java.util.Objects;
@MappedSuperclass
public abstract class Pessoa {
  private String nome;
  private String email;
  private String sexo;

  public Pessoa(){}

  public Pessoa(String nome, String email, String sexo) {
    this.nome = nome;
    this.email = email;
    this.sexo = sexo;
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

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Pessoa pessoa = (Pessoa) o;
    return nome.equals(pessoa.nome) && email.equals(pessoa.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, email);
  }
}
