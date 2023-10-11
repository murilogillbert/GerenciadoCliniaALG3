package classe;

public class consulta {
	int idPaciente, idProfissional, idConsulta, tipo;
	String dataHora;
	String local, descricao;
	

	public void SetPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	
	public int GetPaciente() {
		return idPaciente;
	}

	public void SetProfissional(int idProfissional) {
		this.idProfissional = idProfissional;
	}
	
	public int GetProfissional() {
		return idProfissional;
	}

	public void SetDataHora(String dataHora) {
		this.dataHora = dataHora;
	}
	
	public String GetDataHora() {
		return dataHora;
	}

	public void SetLocal(String local) {
		this.local = local;
	}
	
	public String GetLocal() {
		return local;
	}

	public void SetDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String GetDescricao() {
		return descricao;
	}

  public void SetId(int idConsulta) {
    this.idConsulta = idConsulta;
  }

  	public int GetId() {
		return idConsulta;
	}

  public void SetTipo(int tipo){
      this.tipo = tipo;
  }
  public int GetTipo(){
      return this.tipo;
   } 
}