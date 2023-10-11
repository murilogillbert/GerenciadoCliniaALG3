package classe;
import java.util.Scanner;
import java.util.Date;

public class pessoa extends unidade{
    String nome, cpf, rg, email, tel, rua, bairro, cidade, estado;
    Date data_nascimento;
    int tipo,id;
    Scanner scan = new Scanner(System.in);

    public void SetNome(String nome) {
        this.nome = nome;
    }

    public String GetNome() {
        return this.nome;
    }

    public void SetCPF(String cpf) {
        this.cpf = cpf;
    }

    public String GetCPF() {
        return this.cpf;
    }

    public void SetRG(String rg) {
        this.rg = rg;
    }

    public String GetRG() {
        return this.rg;
    }


    public void SetEmail(String email){
      this.email = email;
    }

  
    public String GetEmail() {
        return this.email;
    }

    public void SetRua(String rua) {
        this.rua = rua;
    }

    public String GetRua() {
        return this.rua;
    }

    public void SetBairro(String bairro) {
        this.bairro = bairro;
    }

    public String GetBairro() {
        return this.bairro;
    }
  
    public void SetCidade(String cidade) {
        this.cidade = cidade;
    }

    public String GetCidade() {
        return this.cidade;
    }

    public void SetEstado(String estado){
        this.estado = estado;
    }
    public String GetEstado(){
        return this.estado;
    }
  
    public void SetDataNascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public Date GetDataNascimento() {
        return data_nascimento;
    }

    public void SetTipo(int tipo){
        this.tipo = tipo;
    }
    public int GetTipo(){
        return this.tipo;
    }    
    public void SetId(int id){
        this.id = id;
    }
    public int GetId(){
        return this.id;
    }
  
}