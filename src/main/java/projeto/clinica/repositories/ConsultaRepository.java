package projeto.clinica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.clinica.entities.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
}
