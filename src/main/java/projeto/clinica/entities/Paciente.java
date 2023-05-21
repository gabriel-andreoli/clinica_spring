package projeto.clinica.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.*;

@Entity
@Table(name = "pacientes")
public class Paciente extends Pessoa implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToMany(mappedBy = "paciente")
  private Set<Consulta> consultas = new HashSet<>();

  public Paciente(){}

  public Paciente(String nome, String email, String sexo, Long id, Set<Consulta> consultas) {
    super(nome, email, sexo);
    this.id = id;
    this.consultas = consultas;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @JsonIgnore
  public Set<Consulta> getConsultas() {
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
