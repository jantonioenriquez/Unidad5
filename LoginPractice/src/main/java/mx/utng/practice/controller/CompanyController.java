package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import mx.utng.practice.model.Company;
import mx.utng.practice.repository.CompanyRepository;

import org.springframework.beans.factory.annotation.Autowired;


@Named
@ViewScoped
public class CompanyController {
	@Autowired
	private CompanyRepository companyRepository;
	private Company company = new Company();
	private List<Company> companies;
	
	private boolean editMode = false;
	@PostConstruct
	public void init(){
		setCompanies(companyRepository.findAll());
	}
	
	public void save(){
		companyRepository.save(company);
		if(!editMode){
			getCompanies().add(company);
		}
		company=new Company();
		setEditMode(false);
	}
	
	public void delete(Company company){
		companyRepository.delete(company);
		companies.remove(company);
	}
	
	public void update(Company company){
		setCompany(company);
		setEditMode(true);
	}
	
	public void cancel(){
		company = new Company();
		setEditMode(false);
	}	

	public CompanyRepository getCompanyRepository() {
		return companyRepository;
	}

	public void setCompanyRepository(CompanyRepository companyRepository) {
		this.companyRepository = companyRepository;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public List<Company> getCompanies() {
		return companies;
	}

	public void setCompanies(List<Company> companies) {
		this.companies = companies;
	}

	public boolean isEditMode() {
		return editMode;
	}

	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
}