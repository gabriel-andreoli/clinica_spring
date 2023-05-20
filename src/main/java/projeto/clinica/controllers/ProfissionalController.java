package projeto.clinica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projeto.clinica.entities.Profissional;
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

  @GetMapping(value = "/{id}")
  public ProfissionalDTO findById(@PathVariable Long id){
    return profissionalService.findById(id);
  }

  @PostMapping
  public ProfissionalDTO insert(@RequestBody Profissional profissional){
    return profissionalService.insert(profissional);
  }

  @PutMapping(value = "/{id}")
  public ProfissionalDTO update(@PathVariable Long id, @RequestBody Profissional profissionalReq){
    return profissionalService.update(id, profissionalReq);
  }
}
