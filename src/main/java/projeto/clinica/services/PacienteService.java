package projeto.clinica.services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projeto.clinica.entities.Consulta;
import projeto.clinica.entities.Paciente;
import projeto.clinica.entities.dto.ConsultaDTO;
import projeto.clinica.entities.dto.PacienteConsultaDTO;
import projeto.clinica.entities.dto.PacienteDTO;
import projeto.clinica.repositories.PacienteRepository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class PacienteService {

  @Autowired
  private PacienteRepository pacienteRepository;

  @Transactional(readOnly = true)
  public List<PacienteDTO> findAll(){
    return pacienteRepository.findAll().stream().map(PacienteDTO::new).toList();
  }

  @Transactional(readOnly = true)
  public PacienteDTO findById(Long id) {
    Paciente paciente = pacienteRepository.findById(id)
            .orElseThrow(() -> new NoSuchElementException("Consulta não encontrada com o ID: " + id));
    return new PacienteDTO(paciente);
  }

  @Transactional(readOnly = true)
  public PacienteConsultaDTO findByIdWithConsultas(Long id){
    return new PacienteConsultaDTO(pacienteRepository.findById(id).get());
  }

  @Transactional
  public PacienteDTO insert(Paciente paciente){
    return new PacienteDTO(pacienteRepository.save(paciente));
  }

  @Transactional
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

  @Transactional
  public void delete(Long id){
    pacienteRepository.deleteById(id);
  }

}
