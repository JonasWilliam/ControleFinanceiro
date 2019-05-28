package Negocio;

import java.util.Date;

public class Imprevistos extends Despesas {

	
	private String descricao;
	
	public Imprevistos(String nome, Date dataParaPagar, double valor,String descricao) {
		super(nome, dataParaPagar, valor);
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	
}
