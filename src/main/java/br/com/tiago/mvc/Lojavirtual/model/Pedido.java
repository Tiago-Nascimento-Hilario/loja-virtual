package br.com.tiago.mvc.Lojavirtual.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pedido {
	

	private String nomeProduto;
	private BigDecimal valorNegociado;
	private LocalDate dataDaEntrega;
	private String urlDoProduto;
	private String imgDoProduto;
	private String descricaoDoproduto;
	
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public BigDecimal getValorNegociado() {
		return valorNegociado;
	}
	public void setValorNegociado(BigDecimal valorNegociado) {
		this.valorNegociado = valorNegociado;
	}
	public LocalDate getDataDaEntrega() {
		return dataDaEntrega;
	}
	public void setDataDaEntrega(LocalDate dataDaEntrega) {
		this.dataDaEntrega = dataDaEntrega;
	}
	
	public String getUrlDoProduto() {
		return urlDoProduto;
	}
	public void setUrlDoProduto(String urlDoProduto) {
		this.urlDoProduto = urlDoProduto;
	}
	public String getImgDoProduto() {
		return imgDoProduto;
	}
	public void setImgDoProduto(String imgDoProduto) {
		this.imgDoProduto = imgDoProduto;
	}
	public String getDescricaoDoproduto() {
		return descricaoDoproduto;
	}
	public void setDescricaoDoproduto(String descricaoDoproduto) {
		this.descricaoDoproduto = descricaoDoproduto;
	}
	
	
	

}
