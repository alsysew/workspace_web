package br.com.itauhextra.horasextras.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.itauhextra.horasextras.model.Ocorrencia;

public interface OcorrenciaDAO extends CrudRepository<Ocorrencia, Integer> {
	public ArrayList<Ocorrencia> findByStatus(int status);
	

}
