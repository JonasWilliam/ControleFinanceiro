package Negocio;

import java.util.Date;

public class Devedor {

	private String nome;
	private Double valor;
	private Date dataParaReceber;
	
	public Devedor(String nome, Double valor, Date dataParaReceber) {
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

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Date getDataParaReceber() {
		return dataParaReceber;
	}

	public void setDataParaReceber(Date dataParaReceber) {
		this.dataParaReceber = dataParaReceber;
	}
	
	
	
	
}
