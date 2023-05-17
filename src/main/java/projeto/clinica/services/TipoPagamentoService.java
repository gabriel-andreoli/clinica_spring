package projeto.clinica.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.clinica.entities.TipoPagamento;
import projeto.clinica.entities.dto.TipoPagamentoDTO;
import projeto.clinica.repositories.TipoPagamentoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TipoPagamentoService {
  @Autowired
  private TipoPagamentoRepository tipoPagamentoRepository;

  public List<TipoPagamentoDTO> findAll(){
    return tipoPagamentoRepository.findAll().stream().map(TipoPagamentoDTO::new).toList();
  }

  public TipoPagamentoDTO findById(Long id){
    Optional<TipoPagamento> obj = tipoPagamentoRepository.findById(id);
    return new TipoPagamentoDTO(obj.get());
  }

  public TipoPagamentoDTO insert(TipoPagamento tipoPagamento){
    return new TipoPagamentoDTO(tipoPagamentoRepository.save(tipoPagamento));
  }

  public TipoPagamentoDTO update(Long id, TipoPagamento tipoPagamentoNew){
    TipoPagamento objAtual = tipoPagamentoRepository.getReferenceById(id);
    updateData(objAtual, tipoPagamentoNew);
    return new TipoPagamentoDTO(tipoPagamentoRepository.save(objAtual));
  }

  public void updateData(TipoPagamento objAtual, TipoPagamento tipoPagamentoNew){
    objAtual.setDescricao(tipoPagamentoNew.getDescricao());
  }

  public void delete(Long id){
    tipoPagamentoRepository.deleteById(id);
  }
}
