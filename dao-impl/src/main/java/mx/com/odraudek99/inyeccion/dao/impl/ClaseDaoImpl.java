package mx.com.odraudek99.inyeccion.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import THija.TPadre;
import mx.com.odraudek99.inyeccion.dao.ClaseDao;

@Component
public class ClaseDaoImpl implements ClaseDao {

	final static Logger logger = Logger.getLogger(ClaseDaoImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public String ejecutaDao(String parametroDos) {
		logger.info("ejecutaDao: " + parametroDos);

		for (TPadre paddre : selectPadreAll()) {
			logger.info("Padre: " + paddre.toString());
		}

		return "Regresa un parametro:ejecutaDao " + parametroDos;
	}

	public List<TPadre> selectPadreAll() {
		return jdbcTemplate.query("select * from T_PADRE ", new BeanPropertyRowMapper<TPadre>(TPadre.class));
	}

}
