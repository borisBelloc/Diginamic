package fr.diginamic.tpSpringSecurity.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import fr.diginamic.tpSpringSecurity.service.UserSecurityService;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserSecurityService userSecurityService;
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(10);
	}
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http			
			.formLogin().permitAll().and().logout() // Spring génère une page de login et un endpoint pour le logout
			.and().authorizeRequests()
//			.andMatchers("Admin")
			.anyRequest().authenticated() // Tous les endpoints sont accessibles aux utilisateurs connectés
			.and().httpBasic() // Utilisation de la méthode d'authentification HTTP Basic
			.and().csrf().disable() // Désactivation de CSRF
			.sessionManagement().disable(); // Désacivation de la gestion de sessions
	}
	
	// Configure les composants utilisés pour l'authentification
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userSecurityService).passwordEncoder(passwordEncoder());
	}
	
	
	
	
}
