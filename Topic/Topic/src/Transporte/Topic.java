package Transporte;

import java.util.ArrayList;

public class Topic {
	ArrayList<Pass> poltronas;
	int qtdPreferenciais;
	
	public Topic(int lotacaoMax, int qtdPreferenciais) {
		poltronas = new ArrayList<Pass>();
		
		for(int i = 0; i < lotacaoMax; i++) 
			poltronas.add(null);

		this.qtdPreferenciais = qtdPreferenciais;
	}
	
	private boolean inserirPassageiro(int inicio, int fim, Pass pass) {
		for(int i = inicio; i < fim; i++) {
			if(poltronas.get(i) == null) {
				poltronas.set(i, pass);
				return true;
			}
		}
		return false;
	}
	
	public void inserirPassageiro(Pass pass) {
			if(pass.ehPreferencial()) {
				inserirPassageiro(0, this.poltronas.size(), pass);
			}
			else {
				if(!inserirPassageiro(this.qtdPreferenciais, this.poltronas.size(), pass))
					inserirPassageiro(0, this.qtdPreferenciais, pass);
			}
		
	}
	
	public boolean remover(String id) {
		for(int i = 0; i < poltronas.size(); i++) {
			if(poltronas.get(i) != null) {
				if(poltronas.get(i).getId().equals(id)) {
					poltronas.set(i, null);
					return true;
				}
				
			}
		}
		return false;
		
	}
	
	@Override
	public String toString() {
		String saida = "[";
			for(int i = 0; i < poltronas.size(); i++) {
				if(i < qtdPreferenciais)
					saida += "@ ";
				else
					saida += "= ";
				if(poltronas.get(i) != null)
					saida += poltronas.get(i).getId();
			}
		saida += "]";
		return saida;
	}

}
