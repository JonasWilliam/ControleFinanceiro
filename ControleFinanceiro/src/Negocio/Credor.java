package Negocio;

import java.util.Date;

public class Credor {


	private String nome;
	private Double valor;
	private Date dataParaPagar;
	
	public Credor(String nome, Double valor, Date dataParaPagar) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.dataParaPagar = dataParaPagar;
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

	public Date getDataParaPagar() {
		return dataParaPagar;
	}

	public void setDataParaPagar(Date dataParaPagar) {
		this.dataParaPagar = dataParaPagar;
	}
	
	
	
	
}
