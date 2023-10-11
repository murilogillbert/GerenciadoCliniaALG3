package classe;

public class administrativo extends funcionario {
  String funcao;

  public void SetFuncao(String funcao) {
    this.funcao = funcao;
  }

  public String GetFuncao() {
    return this.funcao;
  }
}
