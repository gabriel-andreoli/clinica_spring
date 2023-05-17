package projeto.clinica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projeto.clinica.entities.Paciente;
import projeto.clinica.entities.dto.PacienteDTO;
import projeto.clinica.services.PacienteService;

import java.util.List;

@RestController
@RequestMapping(value = "/pacientes")
public class PacienteController {

  @Autowired
  private PacienteService pacienteService;

  @GetMapping
  public List<PacienteDTO> findAll(){
    return pacienteService.findAll();
  }

  @GetMapping(value = "/{id}")
  public PacienteDTO findById(@PathVariable Long id){
    return pacienteService.findById(id);
  }

  @PostMapping
  public PacienteDTO insert(@RequestBody Paciente paciente){
    return pacienteService.insert(paciente);
  }

  @PutMapping(value = "/{id}")
  public PacienteDTO update(@RequestBody Paciente pacienteReq, @PathVariable Long id){
    return pacienteService.update(pacienteReq, id);
  }

  @DeleteMapping(value = "/{id}")
  public void delete(@PathVariable Long id){
    pacienteService.delete(id);
  }

}
