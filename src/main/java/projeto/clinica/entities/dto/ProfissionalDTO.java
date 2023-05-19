package projeto.clinica.entities.dto;

import jakarta.persistence.*;
import org.springframework.beans.BeanUtils;
import projeto.clinica.entities.Consulta;
import projeto.clinica.entities.Profissional;
import projeto.clinica.entities.enumerate.GrauFormacaoEnum;

import java.util.ArrayList;
import java.util.List;

public class ProfissionalDTO {
  private Long id;
  private Double precoConsulta;
  private GrauFormacaoEnum grauFormacao;
  private List<Consulta> consultas = new ArrayList<>();


  public ProfissionalDTO(Profissional profissional){
    this.id = profissional.getId();
    this.precoConsulta = profissional.getPrecoConsulta();
    this.grauFormacao = profissional.getGrauFormacao();
    this.consultas.addAll(profissional.getConsultas());
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

  public GrauFormacaoEnum getGrauFormacao() {
    return grauFormacao;
  }

  public void setGrauFormacao(GrauFormacaoEnum grauFormacao) {
    this.grauFormacao = grauFormacao;
  }

  public List<Consulta> getConsultas() {
    return consultas;
  }

  public void setConsultas(List<Consulta> consultas) {
    this.consultas = consultas;
  }
}
