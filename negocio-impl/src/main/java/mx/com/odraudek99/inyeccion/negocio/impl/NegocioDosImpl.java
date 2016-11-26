package mx.com.odraudek99.inyeccion.negocio.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import mx.com.odraudek99.inyeccion.dao.ClaseDao;
import mx.com.odraudek99.inyeccion.negocio.NegocioDos;

@Component
public class NegocioDosImpl implements NegocioDos {

	final static Logger logger = Logger.getLogger(NegocioDosImpl.class);

	@Autowired
	private ClaseDao claseDao;
	
	public String ejecutaNegocioDos(String parametroDos) {
		logger.info("parametroDos: " + parametroDos);
		return claseDao.ejecutaDao(parametroDos);
	}



}
