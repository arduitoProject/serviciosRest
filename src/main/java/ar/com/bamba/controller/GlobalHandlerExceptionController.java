package ar.com.bamba.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;


/**
 * Anotando la clase con ControllerAdvice los @ExceptionHandler son globales a todos los controllers.  
 * @author ptamburro
 */
@ControllerAdvice
public class GlobalHandlerExceptionController {

	/**
	 * Este metodo es un handler global a la IOException, si ocurre una IOException se llama a error_global.jsp
	 * @author ptamburro
	 */
	@ExceptionHandler(IOException.class)
	public ModelAndView handleIOException(IOException ex){
		
		ModelAndView model = new ModelAndView("error/error_global");
		model.addObject("exceptionMsg", "Ocurrio un IOException");
		
		return model;
	}
	
	
}
