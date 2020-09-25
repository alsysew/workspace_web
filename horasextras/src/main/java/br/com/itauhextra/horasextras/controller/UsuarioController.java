package br.com.itauhextra.horasextras.controller;

import java.util.ArrayList;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.itauhextra.horasextras.dao.UsuarioDAO;
import br.com.itauhextra.horasextras.model.Usuario;

//VAmos definor qua a classe é um restController para Expor URLs (nossa API)

@CrossOrigin("*")
@RestController
public class UsuarioController {

	// esse cara precisa acessar o Banco? SIM
	// coneito "Injeção de Dependencia"

	@Autowired
	private UsuarioDAO dao;

	@GetMapping("/Usuario")
	public ArrayList<Usuario> buscarTodos() {

		ArrayList<Usuario> lista;
		lista = (ArrayList<Usuario>) dao.findAll();
		return lista;

	}


	
	/* ao retornar um objeto do tipo ResponseEntity, eu não quero que retorne apenas o conteúdo da mensagem,
	 * mas também quero poder manipular seu cabeçalho!!
	 */
	@PostMapping("/usuarios/login")
	public ResponseEntity<Usuario> logarUsuario(@RequestBody Usuario dadosLogin) {
		Usuario res = dao.findByRacf(dadosLogin.getRacf());
		if (res != null) {  // ele existe na base com o RACF informado?
			if (res.getSenha().equals(dadosLogin.getSenha())) {
				res.setSenha("********");
				return ResponseEntity.ok(res); // retorno 200, com o objeto no corpo da resposta
			}
			else {
				return ResponseEntity.status(401).build(); // retorno código 401 com corpo da mensagem vazio
			}
		}
		else {
			return ResponseEntity.notFound().build();  // se não existir, retorno um código 404
		}
	}
	

}