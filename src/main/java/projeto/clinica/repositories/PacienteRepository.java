package projeto.clinica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.clinica.entities.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
