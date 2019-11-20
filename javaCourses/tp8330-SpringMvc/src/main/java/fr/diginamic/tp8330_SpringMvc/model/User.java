package fr.diginamic.tp8330_SpringMvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import fr.diginamic.tp8330_SpringMvc.dao.IoEntity;

@Entity
@Table(name = "user_")
public class User implements IoEntity {
	
	private static final long serialVersionUID = 6110450423867174653L;
	
	@Id
	@GeneratedValue()
	private long id;
	private String login;
	private String password;
	private String name;
	
	public User() {
		super();
	}
	
	public User(String login, String password, String name) {
		super();
		this.login = login;
		this.password = password;
		this.name = name;
	}
	
	
	@Override
	public Long getId() {
		return id;
	}
	@Override
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
//	--
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
