package projeto.clinica.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.clinica.entities.dto.ConsultaDTO;
import projeto.clinica.repositories.ConsultaRepository;

import java.util.List;

@Service
public class ConsultaService {
  @Autowired
  private ConsultaRepository consultaRepository;

  public List<ConsultaDTO> findAll(){
    return consultaRepository.findAll().stream().map(ConsultaDTO::new).toList();
  }

  public ConsultaDTO findById(Long id){
    return new ConsultaDTO(consultaRepository.findById(id).get());
  }
}
