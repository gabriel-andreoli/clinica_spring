package projeto.clinica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projeto.clinica.entities.AreaAtuacao;
import projeto.clinica.entities.dto.AreaAtuacaoDTO;
import projeto.clinica.services.AreaAtuacaoService;

import java.io.Serializable;
import java.util.List;

@RestController
@RequestMapping(value = "/areasatuacoes")
public class AreaAtuacaoController implements Serializable {
  @Autowired
  private AreaAtuacaoService areaAtuacaoService;

  @GetMapping
  public List<AreaAtuacaoDTO> findAll(){
    return areaAtuacaoService.findAll();
  }

  @GetMapping(value = "/{id}")
  public AreaAtuacaoDTO findById(@PathVariable Long id){
    return areaAtuacaoService.findById(id);
  }

  @PostMapping
  public AreaAtuacaoDTO insert(@RequestBody AreaAtuacao areaAtuacao){
    return areaAtuacaoService.insert(areaAtuacao);
  }

  @PutMapping(value = "/{id}")
  public AreaAtuacaoDTO update(@PathVariable Long id, @RequestBody AreaAtuacao areaAtuacaoBody){
    return areaAtuacaoService.update(id, areaAtuacaoBody);
  }

  @DeleteMapping(value = "/{id}")
  public void delete(@PathVariable Long id){
    areaAtuacaoService.delete(id);
  }

}
