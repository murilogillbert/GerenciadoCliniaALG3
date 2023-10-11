package classe;

public class paciente extends pessoa{
    String numCarteira,historico;
    
    
    public void SetNumCarteira(String numCarteira){
        this.numCarteira = numCarteira;
    }

    public String GetNumCarteira(){
        return this.numCarteira;
    }

    public void SetHistorico(String historico){
        this.historico = historico;
    }

    public String GetHistorico(){
        return this.historico;
    }

    public void SetTipo(int tipo){
        this.tipo = tipo;
    }
    public int GetTipo(){
        return this.tipo;
    } 
}
