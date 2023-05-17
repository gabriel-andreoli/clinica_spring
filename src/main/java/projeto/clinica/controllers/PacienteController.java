package projeto.clinica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projeto.clinica.entities.Paciente;
import projeto.clinica.services.PacienteService;

import java.util.List;

@RestController
@RequestMapping(value = "/pacientes")
public class PacienteController {

  @Autowired
  private PacienteService pacienteService;

  @GetMapping
  public List<Paciente> findAll(){
    return pacienteService.findAll();
  }

  @GetMapping(value = "/{id}")
  public Paciente findById(@PathVariable Long id){
    return pacienteService.findById(id);
  }

  @PostMapping
  public Paciente insert(@RequestBody Paciente paciente){
    return pacienteService.insert(paciente);
  }

  @PutMapping(value = "/{id}")
  public Paciente update(@RequestBody Paciente pacienteReq, @PathVariable Long id){
    return pacienteService.update(pacienteReq, id);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id){
    pacienteService.delete(id);
    return ResponseEntity.noContent().build();
  }

}
