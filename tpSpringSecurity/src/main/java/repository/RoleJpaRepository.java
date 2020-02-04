package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.diginamic.tpSpringSecurity.models.Role;

public interface RoleJpaRepository extends JpaRepository<Role, Long> {

}
