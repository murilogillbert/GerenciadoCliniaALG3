package classe;

public class funcionario extends pessoa {
    float salario;
    int idFuncionario;
  
    public void SetSalario(float salario){
        this.salario = salario;
    }
    public float GetSalario(){
        return this.salario;
    }

    public void SetIdFuncionario(int idFuncionario){
        this.idFuncionario = idFuncionario;
    }
    public int GetIdFuncionario(){
        return idFuncionario;
    }

    public void SetNome(String nome){
      this.nome = nome;
    }
    public String GetNome(){
      return this.nome;
    }
  
    public void SetTel(String tel){
      this.tel= tel;
    }

    public String GetTel(){
      return this.nome;
    }
}