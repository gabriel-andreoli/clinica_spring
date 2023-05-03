package projeto.clinica.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projeto.clinica.entities.Paciente;
import projeto.clinica.services.PacienteService;

import java.util.List;

@RestController
@RequestMapping(value = "/pacientes")
public class PacienteResource {

  @Autowired
  private PacienteService pacienteService;

  @GetMapping
  public ResponseEntity<List<Paciente>> findAll(){
    List<Paciente> pacientes = pacienteService.findAll();
    return ResponseEntity.ok().body(pacientes);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Paciente> findById(@PathVariable Long id){
    Paciente paciente = pacienteService.findById(id);
    return ResponseEntity.ok().body(paciente);
  }

  @PostMapping
  public ResponseEntity<Paciente> insert(@RequestBody Paciente paciente){
    return ResponseEntity.ok().body(pacienteService.insert(paciente));
  }

//  @PutMapping(value = "/{id}")
//  public ResponseEntity<Paciente> update(RequestBody Paciente paciente, @PathVariable Long id){
//
//  }

}
