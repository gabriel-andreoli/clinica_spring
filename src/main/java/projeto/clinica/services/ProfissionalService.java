package projeto.clinica.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.clinica.entities.Profissional;
import projeto.clinica.entities.dto.ProfissionalDTO;
import projeto.clinica.repositories.ProfissionalRepository;

import java.util.List;

@Service
public class ProfissionalService {
  @Autowired
  private ProfissionalRepository profissionalRepository;

  public List<ProfissionalDTO> findAll(){
    return profissionalRepository.findAll().stream().map(ProfissionalDTO::new).toList();
  }

  public ProfissionalDTO findById(Long id){
    return new ProfissionalDTO(profissionalRepository.findById(id).get());
  }

  public ProfissionalDTO insert(Profissional profissional){
    return new ProfissionalDTO(profissionalRepository.save(profissional));
  }
}
