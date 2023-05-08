package projeto.clinica.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.clinica.entities.TipoPagamento;
import projeto.clinica.repositories.TipoPagamentoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TipoPagamentoService {
  @Autowired
  private TipoPagamentoRepository tipoPagamentoRepository;

  public List<TipoPagamento> findAll(){
    return tipoPagamentoRepository.findAll();
  }

  public TipoPagamento findById(Long id){
    Optional<TipoPagamento> obj = tipoPagamentoRepository.findById(id);
    return obj.get();
  }

  public TipoPagamento insert(TipoPagamento tipoPagamento){
    return tipoPagamentoRepository.save(tipoPagamento);
  }
}