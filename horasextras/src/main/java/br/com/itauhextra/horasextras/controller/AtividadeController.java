package br.com.itauhextra.horasextras.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.itauhextra.horasextras.dao.AtividadeDAO;
import br.com.itauhextra.horasextras.model.Atividade;

@RestController
public class AtividadeController {

	
	
	@Autowired
	private AtividadeDAO dao;

	@GetMapping("/Atividade")
	public ArrayList<Atividade> buscarTodos() {

		ArrayList<Atividade> lista;
		lista = (ArrayList<Atividade>) dao.findAll();
		return lista;

	}
}
