package mx.utng.practice.repository;

import java.util.List;




import mx.utng.practice.model.Alternative;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface AlternativeRepository extends JpaRepository<Alternative, Long>{
	@Query("select alt from Alternative alt")
	public List<Alternative>findAll();
}