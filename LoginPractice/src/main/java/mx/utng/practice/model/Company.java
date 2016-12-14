package mx.utng.practice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="companies")
public class Company {
	@Id @GeneratedValue
	private Long id;
	private String name;
	private String category;
	private String location;
	
	public Company(String name, String category, String location) {
		super();
		this.name = name;
		this.category = category;
		this.location = location;
	}
	
	public Company(){
		this("","","");
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", category=" + category + ", location=" + location + "]";
	}
	
	

}