package projeto.clinica.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.clinica.entities.dto.AreaAtuacaoDTO;
import projeto.clinica.repositories.AreaAtuacaoRepository;

import java.util.List;

@Service
public class AreaAtuacaoService {
  @Autowired
  private AreaAtuacaoRepository areaAtuacaoRepository;

  public List<AreaAtuacaoDTO> findAll(){
    return areaAtuacaoRepository.findAll().stream().map(AreaAtuacaoDTO::new).toList();
  }

  public AreaAtuacaoDTO findById(Long id){
    return new AreaAtuacaoDTO(areaAtuacaoRepository.findById(id).get());
  }
}
