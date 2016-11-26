package mx.com.odraudek99.inyeccion.negocio.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.com.odraudek99.inyeccion.negocio.NegocioDos;
import mx.com.odraudek99.inyeccion.negocio.NegocioUno;

@Component
public class NegocioUnoImpl implements NegocioUno {

	final static Logger logger = Logger.getLogger(NegocioUnoImpl.class);

	@Autowired
	private NegocioDos negocioDos;

	public String ejecutaNegocioUno(String parametroUno) {
		logger.info("parametroUno: " + parametroUno);
		return negocioDos.ejecutaNegocioDos(parametroUno);
	}

	public NegocioDos getNegocioDos() {
		return negocioDos;
	}

	public void setNegocioDos(NegocioDos negocioDos) {
		this.negocioDos = negocioDos;
	}
	
	

}
