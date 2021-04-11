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
		if(this.cadeiras.get(index) != null) {
			throw new VagaOcupadaException("Fail: cadeira ocupada!");
		}

		try{
			for(Cliente cliente : this.cadeiras) {
				if(cliente != null && cliente.getId().equals(id)) {
					throw new ClienteReservadoException("fail: cliente ja esta no cinema");
				}
			}
			this.cadeiras.set(index, new Cliente(id, fone));
			return true;
		} catch(IndexOutOfBoundsException e) {
			throw new IndexOutOfBoundsException(e.getMessage());
		}
	}
	
	public void cancelar(String id) {
		try {
			for(int i = 0; i < this.cadeiras.size(); i++) {
				if( (this.cadeiras.get(i) != null) && (this.cadeiras.get(i).getId().equals(id)) ) {
					this.cadeiras.set(i, null);
					return;
				}
			}
		} catch (IndexOutOfBoundsException e) {
			throw new IndexOutOfBoundsException(e.getMessage());
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
