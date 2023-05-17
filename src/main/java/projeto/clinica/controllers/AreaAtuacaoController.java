package projeto.clinica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

}
