package projeto.clinica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projeto.clinica.entities.TipoPagamento;
import projeto.clinica.entities.dto.TipoPagamentoDTO;
import projeto.clinica.services.TipoPagamentoService;

import java.util.List;

@RestController
@RequestMapping(value = "/tipopagamentos")
public class TipoPagamentoController {

  @Autowired
  private TipoPagamentoService tipoPagamentoService;

  @GetMapping
  public List<TipoPagamentoDTO> findAll(){
    return tipoPagamentoService.findAll();
  }

  @GetMapping(value = "/{id}")
  public TipoPagamentoDTO findById(@PathVariable Long id){
    return tipoPagamentoService.findById(id);
  }

  @PostMapping
  public TipoPagamentoDTO insert(@RequestBody TipoPagamento tipoPagamento){
    return tipoPagamentoService.insert(tipoPagamento);
  }

  @PutMapping(value = "/{id}")
  public TipoPagamentoDTO update(@PathVariable Long id, @RequestBody TipoPagamento tipoPagamentoNew){
    return tipoPagamentoService.update(id, tipoPagamentoNew);
  }

  @DeleteMapping(value = "/{id}")
  public void delete(@PathVariable Long id){
    tipoPagamentoService.delete(id);
  }


}
