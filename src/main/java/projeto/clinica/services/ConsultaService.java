package projeto.clinica.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projeto.clinica.entities.Consulta;
import projeto.clinica.entities.dto.ConsultaDTO;
import projeto.clinica.repositories.ConsultaRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ConsultaService {
  @Autowired
  private ConsultaRepository consultaRepository;

  @Transactional(readOnly = true)
  public List<ConsultaDTO> findAll(){
    return consultaRepository.findAll().stream().map(ConsultaDTO::new).toList();
  }

  @Transactional(readOnly = true)
  public ConsultaDTO findById(Long id) {
    Consulta consulta = consultaRepository.findById(id)
            .orElseThrow(() -> new NoSuchElementException("Consulta não encontrada com o ID: " + id));
    return new ConsultaDTO(consulta);
  }

  @Transactional
  public ConsultaDTO insert(Consulta consulta){
    return new ConsultaDTO(consulta);
  }

  @Transactional
  public ConsultaDTO update(Long id, Consulta consultaReq){
    Consulta obj = consultaRepository.getReferenceById(id);
    updateParcial(obj, consultaReq);
    return new ConsultaDTO(consultaRepository.save(obj));
  }

  public void updateParcial(Consulta obj, Consulta consultaReq){
    obj.setProfissional(consultaReq.getProfissional());
    obj.setPaciente(consultaReq.getPaciente());
    obj.setTipoPagamento(consultaReq.getTipoPagamento());
    obj.setPrecoTotalConsulta(consultaReq.getPrecoTotalConsulta());
    obj.setDataConsulta(consultaReq.getDataConsulta());
  }

  @Transactional
  public void delete(Long id){
    consultaRepository.deleteById(id);
  }
}
