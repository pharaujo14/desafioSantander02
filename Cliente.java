package desafio02;

public class Cliente {
	
	private int id;
	private String sobrenome;
	private String rg;
	private String cpf;
	
	public Cliente(int id, String sobrenome, String rg, String cpf) {
		setId(id);
		setSobrenome(sobrenome);
		setRg(rg);
		setCpf(cpf);
	}	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", sobrenome=" + sobrenome + ", rg=" + rg + ", cpf=" + cpf + "]";
	}
}
