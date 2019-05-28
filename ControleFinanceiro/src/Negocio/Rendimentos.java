package Negocio;

import java.util.Date;

public class Rendimentos {

	private String nome;
	private String valor;
	private Date dataParaReceber;
	
	public Rendimentos(String nome, String valor, Date dataParaReceber) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.dataParaReceber = dataParaReceber;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Date getDataParaReceber() {
		return dataParaReceber;
	}

	public void setDataParaReceber(Date dataParaReceber) {
		this.dataParaReceber = dataParaReceber;
	}
	
	
	
	
	
}
