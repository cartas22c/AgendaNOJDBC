package com.capgemini.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@Configuration // Esta anotacion hace que esta clase sea una clase de configuracion 
@EnableWebMvc  //La habilitamos para WebMVC.
@ComponentScan(basePackageClasses = WebConfig.class) //Ruta para buscar los controladores
public class WebConfig  implements WebMvcConfigurer{

	// Esto se corresponde con el codigo que iria en el fichero web.xml mezclado con el spring-servlet

	// Este metodo resolvera la ubicacion de las vistas.
	//// Esto se encuentra en el fichero XML  spring-servlet
	/*/////<!-- View Resolver -->
	 * <mvc:annotation-driven />
		<bean
			class="org.springframework.web.servlet.view.InternalResourceViewResolver">
			<property name="prefix" value="/WEB-INF/pages/" />
			<property name="suffix" value=".jsp" />
			</bean>*/


	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// TODO Auto-generated method stub
		registry.jsp().prefix("/WEB-INF/pages/").suffix(".jsp"); 
	}


	 @Bean
	  public MessageSource messageSource() {
	     ResourceBundleMessageSource source = new ResourceBundleMessageSource();
	     source.setBasename("messages");
	     return source;
	  }




}
