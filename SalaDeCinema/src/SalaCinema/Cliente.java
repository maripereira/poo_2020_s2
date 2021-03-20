package SalaCinema;

import java.util.Random;

public class Cliente {
	
	private String id;
	private String fone;
	
	public Cliente(String id, String fone) {
		this.id = id;
		this.fone = fone;
	}
	
	public Cliente() {}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}

	@Override
	public String toString() {
		return this.id + " " + this.fone;
	}

}
