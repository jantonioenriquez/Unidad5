package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import mx.utng.practice.model.Alternative;
import mx.utng.practice.repository.AlternativeRepository;

import org.springframework.beans.factory.annotation.Autowired;


@Named
@ViewScoped
public class AlternativeController {
	@Autowired
	private AlternativeRepository alternativeRepository;
	private Alternative alternative = new Alternative();
	private List<Alternative> alternatives;
	
	private boolean editMode = false;
	@PostConstruct
	public void init(){
		setAlternatives(alternativeRepository.findAll());
	}
	
	public void save(){
		alternativeRepository.save(alternative);
		if(!editMode){
			getAlternatives().add(alternative);
		}
		alternative=new Alternative();
		setEditMode(false);
	}
	
	public void delete(Alternative alternative){
		alternativeRepository.delete(alternative);
		alternatives.remove(alternative);
	}
	
	public void update(Alternative alternative){
		setAlternative(alternative);
		setEditMode(true);
	}
	
	public void cancel(){
		alternative = new Alternative();
		setEditMode(false);
	}	

	public AlternativeRepository getAlternativeRepository() {
		return alternativeRepository;
	}

	public void setAlternativeRepository(AlternativeRepository alternativeRepository) {
		this.alternativeRepository = alternativeRepository;
	}

	public Alternative getAlternative() {
		return alternative;
	}

	public void setAlternative(Alternative alternative) {
		this.alternative = alternative;
	}

	public List<Alternative> getAlternatives() {
		return alternatives;
	}

	public void setAlternatives(List<Alternative> alternatives) {
		this.alternatives = alternatives;
	}

	public boolean isEditMode() {
		return editMode;
	}

	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
}