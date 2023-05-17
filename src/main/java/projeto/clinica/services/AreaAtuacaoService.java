package projeto.clinica.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projeto.clinica.entities.AreaAtuacao;
import projeto.clinica.entities.dto.AreaAtuacaoDTO;
import projeto.clinica.repositories.AreaAtuacaoRepository;

import java.awt.geom.Area;
import java.util.List;

@Service
public class AreaAtuacaoService {
  @Autowired
  private AreaAtuacaoRepository areaAtuacaoRepository;

  @Transactional(readOnly = true)
  public List<AreaAtuacaoDTO> findAll(){
    return areaAtuacaoRepository.findAll().stream().map(AreaAtuacaoDTO::new).toList();
  }

  @Transactional(readOnly = true)
  public AreaAtuacaoDTO findById(Long id){
    return new AreaAtuacaoDTO(areaAtuacaoRepository.findById(id).get());
  }

  public AreaAtuacaoDTO insert(AreaAtuacao areaAtuacao){
    return new  AreaAtuacaoDTO(areaAtuacaoRepository.save(areaAtuacao));
  }

  public AreaAtuacaoDTO update(Long id, AreaAtuacao areaAtuacaoBody){
    AreaAtuacao obj = areaAtuacaoRepository.getReferenceById(id);
    updateParcial(obj, areaAtuacaoBody);
    return new AreaAtuacaoDTO(areaAtuacaoRepository.save(obj));
  }

  public void updateParcial(AreaAtuacao areaAtuacao, AreaAtuacao areaAtuacaoBody){
    areaAtuacao.setDescricao(areaAtuacaoBody.getDescricao());
  }

  public void delete(Long id){
    areaAtuacaoRepository.deleteById(id);
  }

}
