package projeto.clinica.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "consultas")
public class Consulta {
  @EmbeddedId
  private ConsultaPK id = new ConsultaPK();

  public Consulta(){}

  public Consulta(Paciente paciente, Profissional profissional) {
    id.setPaciente(paciente);
    id.setProfissional(profissional);
  }

  public ConsultaPK getId() {
    return id;
  }

  public void setId(ConsultaPK id) {
    this.id = id;
  }

  public Double precoConsulta(Double taxaPorcentagem){
    Double precoConsultaProfissional = id.getProfissional().getPrecoConsulta();
    return precoConsultaProfissional + (taxaPorcentagem/100 * precoConsultaProfissional);
  }

}
