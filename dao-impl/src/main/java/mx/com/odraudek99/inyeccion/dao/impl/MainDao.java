package mx.com.odraudek99.inyeccion.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mx.com.odraudek99.inyeccion.dao.ClaseDao;

public class MainDao {
	

	final static Logger logger = Logger.getLogger(MainDao.class);
	
	public static void main(String args[]){
	ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/*.xml");
	
	for (String bean: context.getBeanDefinitionNames()) {
		logger.info("bean: "+bean);
		
	}
		
		ClaseDao claseDao = (ClaseDao) context.getBean(ClaseDaoImpl.class);
		String respuesta = claseDao.ejecutaDao("Hola mundo");
		
		logger.info("respuesta: "+respuesta);
		
	}

}
