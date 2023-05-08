package projeto.clinica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.clinica.entities.TipoPagamento;

public interface TipoPagamentoRepository extends JpaRepository<TipoPagamento, Long> {
}
