package ar.com.bamba.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ar.com.bamba.exception.CustomGenericException;

@RestController
@RequestMapping("/errores")
public class SpringExceptionHandlingController {

	/***
	 * Evalua el texto ingresado y segun sea se lanza un CustomGenericException/RuntimeException/IOException
	 * los cuales serán tratados por los @ExceptionHandler definidos. O en el caso del IOException es tratada
	 * por un handler global (@ControllerAdvice)
	 * @author ptamburro 
	 */
	@RequestMapping(value = "/obtenerException/{texto}")
	public String getSpringException(@PathVariable("texto") String texto) throws IOException {

		if (texto != null && "custom".equals(texto)) {
			throw new CustomGenericException(
					"Por medio de un servicio se genero un CustomGenericException");
		} else if (texto != null && "runtime".equals(texto)) {
			throw new RuntimeException(
					"Por medio de un servicio se genero un RuntimeException");
		} else if (texto != null && "global".equals(texto)) {
			throw new IOException("Por medio de un servicio se genero un RuntimeException");
		} else {
			return "No se obtuvo exception (el texto ingresado como parametro debe ser: custom, runtime o global)";
		}
	}

	
	/**
	 * Handler para CustomGenericException
	 */
	@ExceptionHandler(CustomGenericException.class)
	public ModelAndView handleCustomException(CustomGenericException ex) {

		ModelAndView model = new ModelAndView("error/error_generico");
		model.addObject("exceptionMsg", ex.getExceptionMsg());

		return model;

	}

	/**
	 * Handler para RuntimeException
	 */
	@ExceptionHandler(RuntimeException.class)
	public ModelAndView handleAllException(RuntimeException ex) {

		ModelAndView model = new ModelAndView("error/error_generico");
		model.addObject("exceptionMsg", "Hubo un RuntimeException");

		return model;

	}

}
