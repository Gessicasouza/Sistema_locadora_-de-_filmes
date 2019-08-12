package com.br.zup.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.zup.models.FilmeModel;

@Repository
public interface FilmeRepository extends CrudRepository<FilmeModel, Integer> {

}
