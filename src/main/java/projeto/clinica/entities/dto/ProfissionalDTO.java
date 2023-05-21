package projeto.clinica.entities.dto;

import jakarta.persistence.OneToMany;
import projeto.clinica.entities.Consulta;
import projeto.clinica.entities.Profissional;
import projeto.clinica.entities.ProfissionalAreaAtuacao;

import java.util.HashSet;
import java.util.Set;


public class ProfissionalDTO {
  private Long id;
  private String nome;
  private String email;
  private String sexo;
  private Double precoConsulta;
  private String grauFormacao;
  private Set<Consulta> consultas = new HashSet<>();
  private ProfissionalAreaAtuacao profissionalAreaAtuacao;


  public ProfissionalDTO(){}
  public ProfissionalDTO(Profissional profissional){
    this.id = profissional.getId();
    this.nome = profissional.getNome();
    this.email = profissional.getEmail();
    this.sexo = profissional.getSexo();
    this.precoConsulta = profissional.getPrecoConsulta();
    this.grauFormacao = profissional.getGrauFormacao();
    this.profissionalAreaAtuacao = profissional.getProfissionalAreaAtuacao();
    this.consultas.addAll(profissional.getConsultas());
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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

  public Set<Consulta> getConsultas() {
    return consultas;
  }

  public ProfissionalAreaAtuacao getProfissionalAreaAtuacao() {
    return profissionalAreaAtuacao;
  }

  public void setProfissionalAreaAtuacao(ProfissionalAreaAtuacao profissionalAreaAtuacao) {
    this.profissionalAreaAtuacao = profissionalAreaAtuacao;
  }
}
