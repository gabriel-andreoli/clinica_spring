package projeto.clinica.entities.dto;

import projeto.clinica.entities.Consulta;

public class ConsultaDTO {
  private Long id;
  private String nomeProfissional;
  private String nomePaciente;
  private String emailPaciente;
  private String nomeTipoPagamento;
  private Double precoTotalConsulta;
  private String dataConsulta;

  public ConsultaDTO(){}
  public ConsultaDTO(Consulta consulta){
    this.id = consulta.getId();
    this.nomeProfissional = consulta.getProfissional().getNome();
    this.nomePaciente = consulta.getPaciente().getNome();
    this.emailPaciente = consulta.getPaciente().getEmail();
    this.nomeTipoPagamento = consulta.getTipoPagamento().getDescricao();
    this.precoTotalConsulta = consulta.getPrecoTotalConsulta();
    this.dataConsulta = consulta.getDataConsulta();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNomeProfissional() {
    return nomeProfissional;
  }

  public void setNomeProfissional(String nomeProfissional) {
    this.nomeProfissional = nomeProfissional;
  }

  public String getNomePaciente() {
    return nomePaciente;
  }

  public void setNomePaciente(String nomePaciente) {
    this.nomePaciente = nomePaciente;
  }

  public String getEmailPaciente() {
    return emailPaciente;
  }

  public void setEmailPaciente(String emailPaciente) {
    this.emailPaciente = emailPaciente;
  }

  public String getNomeTipoPagamento() {
    return nomeTipoPagamento;
  }

  public void setNomeTipoPagamento(String nomeTipoPagamento) {
    this.nomeTipoPagamento = nomeTipoPagamento;
  }

  public Double getPrecoTotalConsulta() {
    return precoTotalConsulta;
  }

  public void setPrecoTotalConsulta(Double precoTotalConsulta) {
    this.precoTotalConsulta = precoTotalConsulta;
  }

  public String getDataConsulta() {
    return dataConsulta;
  }

  public void setDataConsulta(String dataConsulta) {
    this.dataConsulta = dataConsulta;
  }
}
