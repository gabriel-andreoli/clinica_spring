package projeto.clinica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projeto.clinica.entities.dto.ProfissionalDTO;
import projeto.clinica.services.ProfissionalService;

import java.util.List;

@RestController
@RequestMapping(value = "/profissionais")
public class ProfissionalController {
  @Autowired
  private ProfissionalService profissionalService;

  @GetMapping
  public List<ProfissionalDTO> findAll(){
    return profissionalService.findAll();
  }
}
