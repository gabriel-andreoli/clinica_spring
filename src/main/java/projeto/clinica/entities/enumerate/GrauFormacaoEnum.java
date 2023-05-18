package projeto.clinica.entities.enumerate;

public enum GrauFormacaoEnum {
  GRADUACAO("Graduacao"),
  POS_GRADUACAO("Pos-Graduacao"),
  MESTRADO("Mestrado"),
  DOUTORADO("Doutorado"),
  POS_DOUTORADO("Pos-Doutorado");

  private final String descricao;

  GrauFormacaoEnum(String descricao){
    this.descricao = descricao;
  }

  public String getDescricao(){
    return descricao;
  }

}
