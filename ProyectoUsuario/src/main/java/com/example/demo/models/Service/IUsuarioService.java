package com.example.demo.models.Service;

import java.util.List;

import com.example.demo.models.Entity.Usuario;


public interface IUsuarioService {
	
	public List<Usuario> findAll();

	public Usuario save(Usuario id);
	
	public Usuario findById(Long id);

	public void delete (Long id);

}
