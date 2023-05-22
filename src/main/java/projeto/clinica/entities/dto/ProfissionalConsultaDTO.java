package projeto.clinica.entities.dto;

import projeto.clinica.entities.Consulta;
import projeto.clinica.entities.Profissional;
import projeto.clinica.entities.ProfissionalAreaAtuacao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProfissionalConsultaDTO {
  private Long id;
  private String nome;
  private String email;
  private String sexo;
  private Double precoConsulta;
  private String grauFormacao;
  private Set<String> areasAtuacoes = new HashSet<>();
  private List<Object> infoConsultas = new ArrayList<>();

  public ProfissionalConsultaDTO(Profissional profissional){
    this.id = profissional.getId();
    this.nome = profissional.getNome();
    this.email = profissional.getEmail();
    this.sexo = profissional.getSexo();
    this.precoConsulta = profissional.getPrecoConsulta();
    this.grauFormacao = profissional.getGrauFormacao();
    for(ProfissionalAreaAtuacao obj: profissional.getProfissionalAreaAtuacoes()){
      this.areasAtuacoes.add(obj.getId().getAreaAtuacao().getDescricao());
    }
    for(Consulta obj : profissional.getConsultas()){
      ConsultaDTO consultaDTO = new ConsultaDTO();
      consultaDTO.setId(obj.getId());
      consultaDTO.setNomePaciente(obj.getPaciente().getNome());
      consultaDTO.setDataConsulta(obj.getDataConsulta());
      consultaDTO.setPrecoTotalConsulta(obj.getPrecoTotalConsulta());
      consultaDTO.setNomeTipoPagamento(obj.getTipoPagamento().getDescricao());
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

  public Set<String> getAreasAtuacoes() {
    return areasAtuacoes;
  }

  public List<Object> getInfoConsultas() {
    return infoConsultas;
  }

}
