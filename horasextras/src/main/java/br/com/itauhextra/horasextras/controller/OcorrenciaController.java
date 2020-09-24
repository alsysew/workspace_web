package br.com.itauhextra.horasextras.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.itauhextra.horasextras.dao.OcorrenciaDAO;
import br.com.itauhextra.horasextras.model.Ocorrencia;

@CrossOrigin("*")
@RestController
public class OcorrenciaController {

	@Autowired
	private OcorrenciaDAO dao;

	@GetMapping("/ocorrencias/{id}")
	public Ocorrencia buscarDetalhesPeloId(@PathVariable int id) {
		Ocorrencia ac = dao.findById(id).orElse(null);
		return ac;
	}

}
