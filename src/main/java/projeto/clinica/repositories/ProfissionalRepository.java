package projeto.clinica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.clinica.entities.Profissional;

public interface ProfissionalRepository extends JpaRepository<Profissional, Long> {
}
