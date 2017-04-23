/*package com.code2java.redbus.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.servlet.DispatcherServlet;

public class RedbusInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		ContextLoaderListener listener = null;
		DispatcherServlet dispatcherServlet = null;
		ServletRegistration.Dynamic register = null;

		// applicationContext.xml
		listener = new ContextLoaderListener();
		listener = new ContextLoaderListener();
		servletContext.addListener(listener);
		
		dispatcherServlet = new DispatcherServlet();

		register = servletContext.addServlet("dispatcher", dispatcherServlet);
		register.setLoadOnStartup(2);
		register.addMapping("*.htm");

	}

}*/
