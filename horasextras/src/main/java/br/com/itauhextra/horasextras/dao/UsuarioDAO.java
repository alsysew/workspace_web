package br.com.itauhextra.horasextras.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.itauhextra.horasextras.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {

	public Usuario findByRacfAndSenha(String racf, String senha);

	public Usuario findByRacf(String racf);
}
