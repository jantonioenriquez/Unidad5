package mx.utng.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="publication_sources")
public class PublicationSource {
	@Id @GeneratedValue
	private Long id;
	private String name;
	@Column(name="type_key")
	private int typeKey;
	
	public PublicationSource(String name, int typeKey) {
		super();
		this.name = name;
		this.typeKey = typeKey;
	}
	
	public PublicationSource(){
		this("",0);
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

	public int getTypeKey() {
		return typeKey;
	}

	public void setTypeKey(int typeKey) {
		this.typeKey = typeKey;
	}

	@Override
	public String toString() {
		return "PublicationSource [id=" + id + ", name=" + name + ", typeKey="
				+ typeKey + "]";
	}

}
