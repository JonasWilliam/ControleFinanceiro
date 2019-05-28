package Negocio;

public class Usuario {

	private String nome;
	private Rendimentos rendimentos;
	private Despesas despesas;
	private Imprevistos imprevistos;
	private Credor credores;
	private Devedor devedores;
	
	public Usuario(String nome, Rendimentos rendimentos, Despesas despesas, Imprevistos imprevistos, Credor credores,
			Devedor devedores) {
		super();
		this.nome = nome;
		this.rendimentos = rendimentos;
		this.despesas = despesas;
		this.imprevistos = imprevistos;
		this.credores = credores;
		this.devedores = devedores;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Rendimentos getRendimentos() {
		return rendimentos;
	}

	public void setRendimentos(Rendimentos rendimentos) {
		this.rendimentos = rendimentos;
	}

	public Despesas getDespesas() {
		return despesas;
	}

	public void setDespesas(Despesas despesas) {
		this.despesas = despesas;
	}

	public Imprevistos getImprevistos() {
		return imprevistos;
	}

	public void setImprevistos(Imprevistos imprevistos) {
		this.imprevistos = imprevistos;
	}

	public Credor getCredores() {
		return credores;
	}

	public void setCredores(Credor credores) {
		this.credores = credores;
	}

	public Devedor getDevedores() {
		return devedores;
	}

	public void setDevedores(Devedor devedores) {
		this.devedores = devedores;
	}
	
	
	
}
