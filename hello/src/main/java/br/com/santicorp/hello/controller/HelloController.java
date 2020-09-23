package br.com.santicorp.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.santicorp.hello.model.Produto;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String syHello() {
		return "Hello World form SpringBOOT!.. Opa";
	}
	
	@GetMapping("produto")
	public Produto exibirProduto() {
		Produto p = new Produto();
		p.setId(1234);
		p.setDescricao("Computador");
		p.setPreco(2000.0);
		p.setQtdEstoque(6);
		
		return p;
	}
}
