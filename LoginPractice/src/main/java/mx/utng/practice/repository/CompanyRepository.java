package mx.utng.practice.repository;

import java.util.List;

import mx.utng.practice.model.Company;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface CompanyRepository extends JpaRepository<Company, Long>{
	@Query("select comp from Company comp")
	public List<Company>findAll();
}