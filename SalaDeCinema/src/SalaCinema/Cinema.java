package SalaCinema;

import java.util.ArrayList;

public class Cinema {
	
	ArrayList<Cliente> cadeiras;
	
	public Cinema(int capacidade) {
		cadeiras = new ArrayList<Cliente>();
		for(int i = 0; i < capacidade; i++)
			cadeiras.add(null);
	}
	
	public boolean reservar(String id, String fone, int index) {
		if(index >= this.cadeiras.size() || (index < 0)) {
			System.out.println("fail: index invalido");
			return false;
		}
		if(this.cadeiras.get(index) != null) {
			System.out.println("fail: vaga ocupada");
			return false;
		}
		for(Cliente cliente : this.cadeiras) {
			if(cliente != null && cliente.getId().equals(id)) {
				System.out.println("fail: cliente ja esta no cinema");
				return false;				
			}
		}
		this.cadeiras.set(index, new Cliente(id, fone));
		return true;
	}
	
	public void cancelar(String id) {
		for(int i = 0; i < this.cadeiras.size(); i++) {
			if( (this.cadeiras.get(i) != null) && (this.cadeiras.get(i).getId().equals(id)) ) {
				this.cadeiras.set(i, null);
				return;
			}
		}
	}
	
	@Override
	public String toString() {
		String saida = "[ ";
		for(Cliente cliente : this.cadeiras) {
			if(cliente == null)
				saida += "- ";
			else
				saida += cliente + " ";
		}
		saida += "]";
		return saida;
	}

	

}
