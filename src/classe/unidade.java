package classe;

public class unidade {
  public String nome, endereco, telefone, tel;

  
  public void SetNome(String nome) {
      this.nome = nome;
  }

  public String GetNome() {
      return nome;
  }
  
  public void SetTel(String tel) {
      this.tel = tel;
  }

  public String GetTel() {
      return tel;
  }

  public void SetNomeUnidade(String nome) {
    this.nome = nome;
  }

  public String GetNomeUnidade() {
    return nome;
  }

  public void SetEnderecoUnidade(String endereco) {
    this.endereco = endereco;
  }

  public String GetEnderecoUnidade() {
    return endereco;
  }

  public void SetTelefoneUnidade(String telefone) {
    this.telefone = telefone;
  }

  public String GetTelefoneUnidade() {
    return telefone;
  }
}