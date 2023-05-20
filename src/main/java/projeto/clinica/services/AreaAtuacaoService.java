package projeto.clinica.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projeto.clinica.entities.AreaAtuacao;
import projeto.clinica.entities.dto.AreaAtuacaoDTO;
import projeto.clinica.repositories.AreaAtuacaoRepository;

import java.awt.geom.Area;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AreaAtuacaoService {
  @Autowired
  private AreaAtuacaoRepository areaAtuacaoRepository;

  @Transactional(readOnly = true)
  public List<AreaAtuacaoDTO> findAll(){
    return areaAtuacaoRepository.findAll().stream().map(AreaAtuacaoDTO::new).toList();
  }

  @Transactional(readOnly = true)
  public AreaAtuacaoDTO findById(Long id) {
    AreaAtuacao areaAtuacao = areaAtuacaoRepository.findById(id)
            .orElseThrow(() -> new NoSuchElementException("Área de atuação não encontrada com o ID: " + id));
    return new AreaAtuacaoDTO(areaAtuacao);
  }


  @Transactional
  public AreaAtuacaoDTO insert(AreaAtuacao areaAtuacao){
    return new  AreaAtuacaoDTO(areaAtuacaoRepository.save(areaAtuacao));
  }

  @Transactional
  public AreaAtuacaoDTO update(Long id, AreaAtuacao areaAtuacaoBody){
    AreaAtuacao obj = areaAtuacaoRepository.getReferenceById(id);
    updateParcial(obj, areaAtuacaoBody);
    return new AreaAtuacaoDTO(areaAtuacaoRepository.save(obj));
  }

  public void updateParcial(AreaAtuacao areaAtuacao, AreaAtuacao areaAtuacaoBody){
    areaAtuacao.setDescricao(areaAtuacaoBody.getDescricao());
  }

  @Transactional
  public void delete(Long id){
    areaAtuacaoRepository.deleteById(id);
  }

}
