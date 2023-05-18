package projeto.clinica.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class ConsultaPK {
  @ManyToOne
  @JoinColumn(name = "paciente_id")
  private Paciente paciente;
  @ManyToOne
  @JoinColumn(name = "profissional_id")
  private Profissional profissional;

  public ConsultaPK(){}
  public ConsultaPK(Paciente paciente, Profissional profissional) {
    this.paciente = paciente;
    this.profissional = profissional;
  }

  public Paciente getPaciente() {
    return paciente;
  }

  public void setPaciente(Paciente paciente) {
    this.paciente = paciente;
  }

  public Profissional getProfissional() {
    return profissional;
  }

  public void setProfissional(Profissional profissional) {
    this.profissional = profissional;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ConsultaPK that = (ConsultaPK) o;
    return paciente.equals(that.paciente) && profissional.equals(that.profissional);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paciente, profissional);
  }
}
