package projeto.clinica.services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.clinica.entities.Paciente;
import projeto.clinica.entities.dto.PacienteDTO;
import projeto.clinica.repositories.PacienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

  @Autowired
  private PacienteRepository pacienteRepository;

  public List<PacienteDTO> findAll(){
    return pacienteRepository.findAll().stream().map(PacienteDTO::new).toList();
  }

  public PacienteDTO findById(Long id){
    Optional<Paciente> paciente = pacienteRepository.findById(id);
    return new PacienteDTO(paciente.get());
  }

  public PacienteDTO insert(Paciente paciente){
    return new PacienteDTO(pacienteRepository.save(paciente));
  }

  public PacienteDTO update(Paciente pacienteReq, Long id){
    Paciente entidade = pacienteRepository.getReferenceById(id);
    updateFunc(entidade, pacienteReq);
    return new PacienteDTO(pacienteRepository.save(entidade));
  }

  public void updateFunc(Paciente entidade, Paciente pacienteReq){
    entidade.setNome(pacienteReq.getNome());
    entidade.setEmail(pacienteReq.getEmail());
    entidade.setSexo(pacienteReq.getSexo());
  }

  public void delete(Long id){
    pacienteRepository.deleteById(id);
  }

}
