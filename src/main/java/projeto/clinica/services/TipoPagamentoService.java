package projeto.clinica.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projeto.clinica.entities.Paciente;
import projeto.clinica.entities.TipoPagamento;
import projeto.clinica.entities.dto.PacienteDTO;
import projeto.clinica.entities.dto.TipoPagamentoDTO;
import projeto.clinica.repositories.TipoPagamentoRepository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class TipoPagamentoService {
  @Autowired
  private TipoPagamentoRepository tipoPagamentoRepository;

  @Transactional(readOnly = true)
  public List<TipoPagamentoDTO> findAll(){
    return tipoPagamentoRepository.findAll().stream().map(TipoPagamentoDTO::new).toList();
  }

  @Transactional(readOnly = true)
  public TipoPagamentoDTO findById(Long id) {
    TipoPagamento tipoPagamento = tipoPagamentoRepository.findById(id)
            .orElseThrow(() -> new NoSuchElementException("Consulta não encontrada com o ID: " + id));
    return new TipoPagamentoDTO(tipoPagamento);
  }

  @Transactional
  public TipoPagamentoDTO insert(TipoPagamento tipoPagamento){
    return new TipoPagamentoDTO(tipoPagamentoRepository.save(tipoPagamento));
  }

  @Transactional
  public TipoPagamentoDTO update(Long id, TipoPagamento tipoPagamentoNew){
    TipoPagamento objAtual = tipoPagamentoRepository.getReferenceById(id);
    updateData(objAtual, tipoPagamentoNew);
    return new TipoPagamentoDTO(tipoPagamentoRepository.save(objAtual));
  }

  public void updateData(TipoPagamento objAtual, TipoPagamento tipoPagamentoNew){
    objAtual.setDescricao(tipoPagamentoNew.getDescricao());
  }

  @Transactional
  public void delete(Long id){
    tipoPagamentoRepository.deleteById(id);
  }
}
