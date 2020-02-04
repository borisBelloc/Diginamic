package fr.diginamic.tpSpringSecurity.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.diginamic.tpSpringSecurity.models.Right;
import fr.diginamic.tpSpringSecurity.models.User;
import fr.diginamic.tpSpringSecurity.repository.UserJpaRepository;


@Service
@Transactional
public class UserSecurityService implements UserDetailsService {
	// UserDetailsService <- interface from spring security

	@Autowired
	private UserJpaRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

			User user = userRepository.findByNickname(username)
					.orElseThrow(() -> new UsernameNotFoundException("User not found"));
			
			List<GrantedAuthority> authorities = new ArrayList<>();
			authorities.add(new SimpleGrantedAuthority("ROLE_" + user.getRole().getLabel().toUpperCase()));
			
			for (Right right : user.getRole().getRights()) {
				authorities.add(new SimpleGrantedAuthority(right.getLabel().toUpperCase()));
			}
			
		return new org.springframework.security.core.userdetails.User(user.getNickname(), user.getPassword(), authorities);
		
	}
	

}
