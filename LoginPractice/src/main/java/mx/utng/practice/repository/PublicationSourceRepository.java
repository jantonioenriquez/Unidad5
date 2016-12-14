package mx.utng.practice.repository;


import java.util.List;



import mx.utng.practice.model.PublicationSource;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicationSourceRepository extends JpaRepository<PublicationSource, Long>{
	@Query("select pubsrc from PublicationSource pubsrc")
	public List<PublicationSource>findAll();
}