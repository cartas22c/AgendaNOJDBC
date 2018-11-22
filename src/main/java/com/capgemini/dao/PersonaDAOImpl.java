package com.capgemini.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.capgemini.model.Persona;

@Repository
public class PersonaDAOImpl implements PersonaDAO {
	
	private static List<Persona>  personas;
	static {
	personas = new ArrayList<Persona>();
 	personas.add(new Persona(1, "00000000T", "Alfonso"));
	personas.add(new Persona(2, "11111111H", "Pablo"));
	personas.add(new Persona(3, "22222222R", "Susana"));
	}
	
	@Override
	public void showPersonas() {
		// TODO Auto-generated method stub
		personas.stream().forEach(p -> System.out.println(p.toString()));
	}

	@Override
	public List<Persona> getPersonas() {
		// TODO Auto-generated method stub
		return personas;
	}
	
	
	

}
