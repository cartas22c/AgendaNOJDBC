package com.capgemini.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.PersonaDAO;
import com.capgemini.model.Persona;

@Service
public class PersonaManagerImpl implements PersonaManager {

	@Autowired
	private PersonaDAO miDao;

	public PersonaDAO getMiDao() {
		return miDao;
	}

	public void setMiDao(PersonaDAO miDao) {
		this.miDao = miDao;
	}

	@Override
	public void showPersonas() {
		// TODO Auto-generated method stub
		miDao.showPersonas();
	}

	@Override
	public List<Persona> getPersonas() {
		// TODO Auto-generated method stub
		return miDao.getPersonas();
	}
	
	
	
	
}
