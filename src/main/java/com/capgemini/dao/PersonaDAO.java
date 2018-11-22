package com.capgemini.dao;

import java.util.List;

import com.capgemini.model.Persona;

public interface PersonaDAO {

	public void showPersonas();
	public List<Persona> getPersonas();
}
