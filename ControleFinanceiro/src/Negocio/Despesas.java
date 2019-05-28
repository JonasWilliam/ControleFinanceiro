package Negocio;

import java.util.Date;

public class Despesas {

	private String nome;
	private Date dataParaPagar;
	private double valor;
	
	public Despesas(String nome, Date dataParaPagar, double valor) {
		super();
		this.nome = nome;
		this.dataParaPagar = dataParaPagar;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataParaPagar() {
		return dataParaPagar;
	}
	public void setDataParaPagar(Date dataParaPagar) {
		this.dataParaPagar = dataParaPagar;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
