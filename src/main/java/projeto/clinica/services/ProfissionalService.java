package projeto.clinica.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.clinica.entities.Consulta;
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

  public ProfissionalDTO update(Long id, Profissional profissionalReq){
    Profissional obj = profissionalRepository.getReferenceById(id);
    updateParcial(obj, profissionalReq);
    return new ProfissionalDTO(profissionalRepository.save(obj));
  }

  public void updateParcial(Profissional obj, Profissional profissionalReq){
    obj.setNome(profissionalReq.getNome());
    obj.setSexo(profissionalReq.getSexo());
    obj.setEmail(profissionalReq.getEmail());
    obj.setPrecoConsulta(profissionalReq.getPrecoConsulta());
    obj.setGrauFormacao(profissionalReq.getGrauFormacao());
    for(Consulta consulta : profissionalReq.getConsultas()){
      obj.adicionarConsulta(consulta);
    }
  }

  public void delete(Long id){
    profissionalRepository.deleteById(id);
  }
}
