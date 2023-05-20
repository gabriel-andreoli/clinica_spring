package projeto.clinica.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "pacientes")
public class Paciente extends Pessoa implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToMany(mappedBy = "id.paciente")
  private List<Consulta> consultas = new ArrayList<>();

  public Paciente(){}

  public Paciente(Long id, String nome, String email, String sexo) {
    super(nome, email, sexo);
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  @JsonIgnore
  public List<Consulta> getConsultas() {
    return consultas;
  }

  public void adicionarConsulta(Consulta consulta){
    consultas.add(consulta);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    Paciente paciente = (Paciente) o;
    return id.equals(paciente.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), id);
  }
}
