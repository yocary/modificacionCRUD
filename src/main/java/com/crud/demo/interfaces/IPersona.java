package com.crud.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.demo.modelo.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer>{

}
