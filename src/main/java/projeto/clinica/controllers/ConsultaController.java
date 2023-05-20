package projeto.clinica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
}
