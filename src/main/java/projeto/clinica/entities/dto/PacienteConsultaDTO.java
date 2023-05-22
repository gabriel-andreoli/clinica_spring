package projeto.clinica.entities.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import projeto.clinica.entities.Consulta;
import projeto.clinica.entities.Paciente;

import java.util.*;

public class PacienteConsultaDTO {
  private Long id;
  private String nome;
  private String email;
  private String sexo;
  private List<Object> infoConsultas = new ArrayList<>();

  public PacienteConsultaDTO(){}
  public PacienteConsultaDTO(Paciente paciente){
    this.id = paciente.getId();
    this.nome = paciente.getNome();
    this.email = paciente.getEmail();
    this.sexo = paciente.getSexo();
    for(Consulta consulta : paciente.getConsultas()){
      ConsultaDTO consultaDTO = new ConsultaDTO();
      consultaDTO.setId(consulta.getId());
      consultaDTO.setNomeProfissional(consulta.getProfissional().getNome());
      consultaDTO.setDataConsulta(consulta.getDataConsulta());
      consultaDTO.setNomeTipoPagamento(consulta.getTipoPagamento().getDescricao());
      consultaDTO.setPrecoTotalConsulta(consulta.getPrecoTotalConsulta());
      infoConsultas.add(consultaDTO);
    }
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

  public List<Object> getInfoConsultas() {
    return infoConsultas;
  }
}
