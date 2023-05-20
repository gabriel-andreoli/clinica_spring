package projeto.clinica.entities.dto;

import projeto.clinica.entities.Profissional;


public class ProfissionalDTO {
  private Long id;
  private String nome;
  private String email;
  private String sexo;
  private Double precoConsulta;
  private String grauFormacao;


  public ProfissionalDTO(){}
  public ProfissionalDTO(Profissional profissional){
    this.id = profissional.getId();
    this.nome = profissional.getNome();
    this.email = profissional.getEmail();
    this.sexo = profissional.getSexo();
    this.precoConsulta = profissional.getPrecoConsulta();
    this.grauFormacao = profissional.getGrauFormacao();
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

}
