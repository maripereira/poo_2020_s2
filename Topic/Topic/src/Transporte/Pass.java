package Transporte;

public class Pass {
	private String id;
	private Integer idade;
	
	public Pass(String id, Integer idade) {
		this.id = id;
		this.idade = idade;
	}
	
	public Pass() {}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public boolean ehPreferencial() {
		return this.idade >= 60;
	}
	
	@Override
	public String toString() {
		return getId() + ": " + getIdade();
	}
	
}
