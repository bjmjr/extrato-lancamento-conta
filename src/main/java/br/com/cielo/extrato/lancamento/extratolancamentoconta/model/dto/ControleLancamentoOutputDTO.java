package br.com.cielo.extrato.lancamento.extratolancamentoconta.model.dto;

import br.com.cielo.extrato.lancamento.extratolancamentoconta.model.ControleLancamento;

public class ControleLancamentoOutputDTO {

	private String dataLancamento;
	private String nomeTipoOperacao;
	private Integer numeroEvento;
	private String situacaoRemessa;
	private String dataConfirmacao;
	private String nomeBanco;
	private Integer agencia;
	private String contaCorrente;
	private Double valorFinal;

	public ControleLancamentoOutputDTO(ControleLancamento controleLancamento) {
		super();
		this.dataLancamento = controleLancamento.getDataEfetivaLancamento();
		this.nomeTipoOperacao = controleLancamento.getLancamentoContaCorrenteCliente().getNomeTipoOperacao();
		this.numeroEvento = controleLancamento.getNumeroEvento();
		this.situacaoRemessa = controleLancamento.getLancamentoContaCorrenteCliente().getNomeSituacaoRemessa();
		this.dataConfirmacao = controleLancamento.getDataLancamentoContaCorrenteCliente();
		this.nomeBanco = controleLancamento.getNomeBanco();
		this.agencia = controleLancamento.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getNumeroAgencia();
		this.contaCorrente = controleLancamento.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getNumeroContaCorrente();
		this.valorFinal = controleLancamento.getValorLancamentoRemessa();
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public String getNomeTipoOperacao() {
		return nomeTipoOperacao;
	}

	public Integer getNumeroEvento() {
		return numeroEvento;
	}

	public String getSituacaoRemessa() {
		return situacaoRemessa;
	}

	public String getDataConfirmacao() {
		return dataConfirmacao;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public String getContaCorrente() {
		return contaCorrente;
	}

	public Double getValorFinal() {
		return valorFinal;
	}
	
}
