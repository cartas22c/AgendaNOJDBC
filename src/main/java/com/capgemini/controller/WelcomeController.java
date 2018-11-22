package com.capgemini.controller;

//import java.util.logging.Level;
//import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.manager.PersonaManager;

@Controller
public class WelcomeController {

	@Autowired
	private PersonaManager miManager;
	
	
	/*@RequestMapping("/")
	public String welcome() {
		Logger.getLogger(WelcomeController.class.getName()).log(Level.INFO, "Renderizado de pagina inicial");
		return "home";
		
	}
	*/
	@RequestMapping("/")
	public ModelAndView showHome() {
		return new ModelAndView("home", "listado", miManager.getPersonas());
	}
	
	
}
