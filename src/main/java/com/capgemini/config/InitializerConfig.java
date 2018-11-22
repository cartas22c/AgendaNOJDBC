package com.capgemini.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class InitializerConfig implements WebApplicationInitializer {

	// Aqui fijamos la ruta donde se encontraran los controladores
	@Override
	public void onStartup(ServletContext container) throws ServletException {
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext context
		= new AnnotationConfigWebApplicationContext();
		context.setConfigLocation("com.capgemini");

		container.addListener(new ContextLoaderListener(context));

		ServletRegistration.Dynamic dispatcher = container
				.addServlet("dispatcher", new DispatcherServlet(context));

		
	// Fijamos la ruta inicial
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");

	}




}
