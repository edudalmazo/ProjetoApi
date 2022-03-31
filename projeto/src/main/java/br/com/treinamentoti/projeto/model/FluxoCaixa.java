package br.com.treinamentoti.projeto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="fluxo_caixa")

public class FluxoCaixa {
	
	@Id
	
	@Column(name="conta")
	private int conta;
	
	@Column(name="fluxo")
	private int fluxo;
	
	@Column(name="entrada")
	private double entrada;
	
	@Column(name="saida")
	private double saida;

	@ManyToOne
	@JoinColumn(name="ag")
	private Correntista titular;
	
	public Correntista getTitular() {
		return titular;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public int getFluxo() {
		return fluxo;
	}
	public void setFluxo(int fluxo) {
		this.fluxo = fluxo;
	}
	public double getEntrada() {
		return entrada;
	}
	public void setEntrada(double entrada) {
		this.entrada = entrada;
	}
	public double getSaida() {
		return saida;
	}
	public void setSaida(double saida) {
		this.saida = saida;
	}
	
}
