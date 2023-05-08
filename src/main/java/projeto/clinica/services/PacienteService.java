package projeto.clinica.services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.clinica.entities.Paciente;
import projeto.clinica.repositories.PacienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

  @Autowired
  private PacienteRepository pacienteRepository;

  public List<Paciente> findAll(){
    return pacienteRepository.findAll();
  }

  public Paciente findById(Long id){
    Optional<Paciente> paciente = pacienteRepository.findById(id);
    return paciente.get();
  }

  public Paciente insert(Paciente paciente){
    return pacienteRepository.save(paciente);
  }

  public Paciente update(Paciente pacienteReq, Long id){
    Paciente entidade = pacienteRepository.getReferenceById(id);
    updateFunc(entidade, pacienteReq);
    return pacienteRepository.save(entidade);
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
