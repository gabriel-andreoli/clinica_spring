package projeto.clinica.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projeto.clinica.entities.TipoPagamento;
import projeto.clinica.services.TipoPagamentoService;

import java.util.List;

@RestController
@RequestMapping(value = "/tipopagamentos")
public class TipoPagamentoResource {

  @Autowired
  private TipoPagamentoService tipoPagamentoService;

  @GetMapping
  public ResponseEntity<List<TipoPagamento>> findAll(){
    return ResponseEntity.ok().body(tipoPagamentoService.findAll());
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<TipoPagamento> findById(@PathVariable Long id){
    return ResponseEntity.ok().body(tipoPagamentoService.findById(id));
  }

  @PostMapping
  public ResponseEntity<TipoPagamento> insert(@RequestBody TipoPagamento tipoPagamento){
    TipoPagamento obj = tipoPagamentoService.insert(tipoPagamento);
    return ResponseEntity.ok().body(obj);
  }


}