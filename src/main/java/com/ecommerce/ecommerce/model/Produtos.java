package com.ecommerce.ecommerce.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="produtos")
public class Produtos implements Serializable{
	
	public Produtos () {
		super ();
	}
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_Produto")
	private long idProduto;
	
	@NotNull
	@Size(min=1,max=255)
	@Column(name="nome_Produto")
	private String nomeProduto;
	
	@NotNull
	@Size(min=1)
	@Column(name="descricao_Produto")
	private String descricaoProduto;
	
	
	@NotNull
	@Column(name="valor_Produto")
	private double valorProduto;


	public long getIdProduto() {
		return idProduto;
	}


	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}


	public String getNomeProduto() {
		return nomeProduto;
	}


	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}


	public String getDescricaoProduto() {
		return descricaoProduto;
	}


	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}


	public double getValorProduto() {
		return valorProduto;
	}


	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
