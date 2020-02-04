package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.diginamic.tpSpringSecurity.models.Right;

public interface RightJpaRepository extends JpaRepository<Right, Long> {

}
