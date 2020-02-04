package fr.diginamic.tpSpringSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.diginamic.tpSpringSecurity.models.User;

@Repository
public interface UserJpaRepository extends JpaRepository<User, Long> {
	
}
