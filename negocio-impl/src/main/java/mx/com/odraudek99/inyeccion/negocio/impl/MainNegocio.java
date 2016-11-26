package mx.com.odraudek99.inyeccion.negocio.impl;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mx.com.odraudek99.inyeccion.negocio.NegocioDos;
import mx.com.odraudek99.inyeccion.negocio.NegocioUno;

public class MainNegocio {

	final static Logger logger = Logger.getLogger(MainNegocio.class);

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/*.xml");

		for (String bean : context.getBeanDefinitionNames()) {
			logger.info("bean: " + bean);

		}

		NegocioUno negocioUno = (NegocioUno) context.getBean(NegocioUnoImpl.class);
		String respuestaUno = negocioUno.ejecutaNegocioUno("Hola mundo");
		logger.info("respuesta: " + respuestaUno);
		
		NegocioDos negocioDos = (NegocioDos) context.getBean(NegocioDosImpl.class);
		String respuestaDos = negocioDos.ejecutaNegocioDos("Hola mundo");
		logger.info("respuesta: " + respuestaDos);

	}

}
