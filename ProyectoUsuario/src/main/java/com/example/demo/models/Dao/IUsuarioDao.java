package com.example.demo.models.Dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Entity.Usuario;



public interface IUsuarioDao extends CrudRepository<Usuario,Long> {

}