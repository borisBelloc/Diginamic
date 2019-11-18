package fr.diginamic.tp8512_SpringJPA.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public abstract class AbstractJdbcRepository {
	
	// doc : https://docs.spring.io/spring/docs/3.0.x/spring-framework-reference/html/jdbc.html#jdbc-JdbcTemplate-idioms
	
	
	private JdbcTemplate jdbcTemplate;
	
    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.setJdbcTemplate(new JdbcTemplate(dataSource));
    }

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	

}
