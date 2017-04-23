package com.code2java.redbus.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.code2java.redbus.command.JourneyCommand;

/**
Simple Form Controller

When ever we are sending the request through the jsp page to get the source page, then servlet container gets the incomming request, after that he identifies the applicaiton based on the context root, and forward the request to the corressponding application then DispatcherServlet gets the incomming request, he don't know what he has to do, he simply goes to the handler mapping and handler mapping gives the information about the corressponding controller to the DispatcherServlet and then dispatcher servlet forwards the request to the controller, which is written by the programmer and extends SimpleFormController, first it will check for handleRequest() method, but it is not there, then it goes to the super class SimpleFormController for handleRequest method then first it will check for the request type, means which type of request it is? if it is GET request means initial face request then it will create the empty command class object and binds to the ModelAndView and then returns to the DispatcherServlet then DispatcherServlet render the source page based on formView name. After that user fills the data in the form and submits the form, then whole process which ever we discuss above will happen apart from request method checking, handlerRequest method will check again this time for the request method type it is POST request method or not, means it will check for post back face request and then it will create the empty command class object and then populate the data in the command class object and bind the exception object then map to ModelAndView and then calls the onSubmit() method of the controller which is written by the programmer.
*/

public class AddJourneyFormController extends SimpleFormController {

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		ModelAndView mav = null;
		JourneyCommand journeyCommand = null;

		journeyCommand = (JourneyCommand) command;
		mav = new ModelAndView();
		mav.addObject("source", journeyCommand.getSource());
		mav.setViewName("success");

		return mav;
	}

}
