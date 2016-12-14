package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;


import mx.utng.practice.model.PublicationSource;
import mx.utng.practice.repository.PublicationSourceRepository;

import org.springframework.beans.factory.annotation.Autowired;


@Named
@ViewScoped
public class PublicationSourceController {
	@Autowired
	private PublicationSourceRepository publicationSourceRepository;
	private PublicationSource publicationSource = new PublicationSource();
	private List<PublicationSource> publicationSources;
	
	private boolean editMode = false;
	@PostConstruct
	public void init(){
		setPublicationSources(publicationSourceRepository.findAll());
	}
	
	public void save(){
		publicationSourceRepository.save(publicationSource);
		if(!editMode){
			getPublicationSources().add(publicationSource);
		}
		publicationSource=new PublicationSource();
		setEditMode(false);
	}
	
	public void delete(PublicationSource publicationSource){
		publicationSourceRepository.delete(publicationSource);
		publicationSources.remove(publicationSource);
	}
	
	public void update(PublicationSource publicationSource){
		setPublicationSource(publicationSource);
		setEditMode(true);
	}
	
	public void cancel(){
		publicationSource = new PublicationSource();
		setEditMode(false);
	}	

	public PublicationSourceRepository getPublicationSourceRepository() {
		return publicationSourceRepository;
	}

	public void setPublicationSourceRepository(
			PublicationSourceRepository publicationSourceRepository) {
		this.publicationSourceRepository = publicationSourceRepository;
	}

	public PublicationSource getPublicationSource() {
		return publicationSource;
	}

	public void setPublicationSource(PublicationSource publicationSource) {
		this.publicationSource = publicationSource;
	}

	public List<PublicationSource> getPublicationSources() {
		return publicationSources;
	}

	public void setPublicationSources(List<PublicationSource> publicationSources) {
		this.publicationSources = publicationSources;
	}

	public boolean isEditMode() {
		return editMode;
	}

	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
}