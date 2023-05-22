package projeto.clinica.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projeto.clinica.entities.Consulta;
import projeto.clinica.entities.Paciente;
import projeto.clinica.entities.Profissional;
import projeto.clinica.entities.dto.PacienteDTO;
import projeto.clinica.entities.dto.ProfissionalConsultaDTO;
import projeto.clinica.entities.dto.ProfissionalDTO;
import projeto.clinica.repositories.ProfissionalRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ProfissionalService {
  @Autowired
  private ProfissionalRepository profissionalRepository;

  @Transactional(readOnly = true)
  public List<ProfissionalDTO> findAll(){
    return profissionalRepository.findAll().stream().map(ProfissionalDTO::new).toList();
  }

  @Transactional(readOnly = true)
  public ProfissionalDTO findById(Long id) {
    Profissional profissional = profissionalRepository.findById(id)
            .orElseThrow(() -> new NoSuchElementException("Consulta não encontrada com o ID: " + id));
    return new ProfissionalDTO(profissional);
  }

  @Transactional(readOnly = true)
  public ProfissionalConsultaDTO findByIdWithConsultas(Long id){
    return new ProfissionalConsultaDTO(profissionalRepository.findById(id).get());
  }

  public ProfissionalDTO insert(Profissional profissional){
    return new ProfissionalDTO(profissionalRepository.save(profissional));
  }

  @Transactional
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

  @Transactional
  public void delete(Long id){
    profissionalRepository.deleteById(id);
  }
}
