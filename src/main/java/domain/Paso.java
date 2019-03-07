package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

@Entity
@Access(AccessType.PROPERTY)
public class Paso extends DomainEntity{
	
	public String description;
	public String title;
	public String photo;
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(final String description) {
		this.description = description;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(final String title) {
		this.title = title;
	}
	
	public String getPhoto() {
		return this.photo;
	}
	
	public void setPhoto(final String photo) {
		this.photo = photo;
	}

}
