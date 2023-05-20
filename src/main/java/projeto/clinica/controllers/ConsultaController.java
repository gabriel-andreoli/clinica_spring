package projeto.clinica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projeto.clinica.entities.Consulta;
import projeto.clinica.entities.dto.ConsultaDTO;
import projeto.clinica.services.ConsultaService;

import java.util.List;

@RestController
@RequestMapping(value = "/consultas")
public class ConsultaController {
  @Autowired
  private ConsultaService consultaService;

  @GetMapping
  public List<ConsultaDTO> findAll(){
    return consultaService.findAll();
  }

  @GetMapping(value = "/{id}")
  public ConsultaDTO findById(@PathVariable Long id){
    return consultaService.findById(id);
  }

  @PostMapping
  public ConsultaDTO insert(@RequestBody Consulta consulta){
    return consultaService.insert(consulta);
  }

  @PutMapping(value = "/{id}")
  public ConsultaDTO update(@PathVariable Long id, @RequestBody Consulta consulta){
    return consultaService.update(id, consulta);
  }

  @DeleteMapping(value = "/{id}")
  public void delete(@PathVariable Long id){
    consultaService.delete(id);
  }
}
