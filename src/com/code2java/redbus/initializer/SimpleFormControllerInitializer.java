package com.code2java.redbus.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SimpleFormControllerInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		DispatcherServlet servlet = null;
		ContextLoaderListener listener = null;
		XmlWebApplicationContext appContext = null;
		XmlWebApplicationContext webContext = null;
		ServletRegistration.Dynamic register = null;

		appContext = new XmlWebApplicationContext();
		appContext.setConfigLocation("/WEB-INF/application-context.xml");
		listener = new ContextLoaderListener(appContext);
		servletContext.addListener(listener);

		webContext = new XmlWebApplicationContext();
		webContext.setConfigLocation("/WEB-INF/web-beans.xml");
		servlet = new DispatcherServlet(webContext);

		register = servletContext.addServlet("dispatcher", servlet);
		register.setLoadOnStartup(2);
		register.addMapping("*.htm");

	}

}
