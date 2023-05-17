package projeto.clinica.entities.dto;

import org.springframework.beans.BeanUtils;
import projeto.clinica.entities.Paciente;

public class PacienteDTO {
  private Long id;
  private String nome;
  private String email;
  private String sexo;

  public PacienteDTO(){}

  public PacienteDTO(Paciente paciente) {
    BeanUtils.copyProperties(paciente, this);
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
}
