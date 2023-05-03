package projeto.clinica.services;

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

//  public Paciente update(Paciente paciente, Long id){
//    return pacienteRepository.
//  }
}
