package com.br.zup.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.zup.models.FilmeModel;
import com.br.zup.repositories.FilmeRepository;

// alugue filmes, veja seu estoque, e possa adicionar ou remover os mesmos
@Service
public class FilmeService {

	@Autowired
	private FilmeRepository filmeRepository;

	public void alugarFilmes(Integer id) {
		FilmeModel filme;
		filme = filmeRepository.findById(id).get();
		int quantidadeDisponivel = filme.getQuantidadeDisponível();
		
        if(quantidadeDisponivel <= 0) {
        	return false;
		}else {
			
		}

	public String saveMovies(FilmeModel filmeModel) {
		filmeRepository.save(filmeModel);

		return "Been successfully archieved";
	}

	public Iterable<FilmeModel> findAll() {
		return filmeRepository.findAll();

	}

}
