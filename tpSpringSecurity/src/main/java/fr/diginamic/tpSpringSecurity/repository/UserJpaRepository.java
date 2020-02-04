package fr.diginamic.tpSpringSecurity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.diginamic.tpSpringSecurity.models.User;

@Repository
public interface UserJpaRepository extends JpaRepository<User, Long>, UserJpaRepositoryCustom {
	
	// permet la recherche via un paramettre du model
	public Optional<User> findByNickname(String nickname);
	
	// autre possibilité de faire :
	
	@Query("from User u where u.email = :email")
	// @Param("email" -> indique que emailAddress doit prendre :email
	// si on ne veut pas @Param -> mettre email pour avoir le meme nom que :email
	public Optional<User> findByEmailAddress(@Param("email") String emailAddress);
	
	
}
