package com.br.zup.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class FilmeModel implements Serializable {
	private final static long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotBlank(message = "Nome não pode ficar em branco")
	private String nome;

	@NotBlank(message = "Link da capa não pode ficar em branco")
	private String linkDaCapa;

	@NotBlank(message = "Ano não pode ficar em branco")
	@Size(min = 4, message = "O ano deve conter 4 caracteres")
	private int ano;

	@NotBlank(message = "Genero não pode ficar em branco")
	private String genero;

	private int classificaçãoIndicativa;

	private int quantidadeDisponível;

	public FilmeModel(Integer id, String nome, String linkDaCapa, int ano, String genero, int classificaçãoIndicativa,
			int quantidadeDisponível) {
		this.id = id;
		this.nome = nome;
		this.linkDaCapa = linkDaCapa;
		this.ano = ano;
		this.genero = genero;
		this.classificaçãoIndicativa = classificaçãoIndicativa;
		this.quantidadeDisponível = quantidadeDisponível;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLinkDaCapa() {
		return linkDaCapa;
	}

	public void setLinkDaCapa(String linkDaCapa) {
		this.linkDaCapa = linkDaCapa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getClassificaçãoIndicativa() {
		return classificaçãoIndicativa;
	}

	public void setClassificaçãoIndicativa(int classificaçãoIndicativa) {
		this.classificaçãoIndicativa = classificaçãoIndicativa;
	}

	public int getQuantidadeDisponível() {
		return quantidadeDisponível;
	}

	public void setQuantidadeDisponível(int quantidadeDisponível) {
		this.quantidadeDisponível = quantidadeDisponível;
	}

	
}
