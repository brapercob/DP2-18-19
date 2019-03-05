package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

@Entity
@Access(AccessType.PROPERTY)
public class Area extends DomainEntity{
	
	private String name;
	private int numPictures;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumPictures() {
		return numPictures;
	}
	public void setNumPictures(int numPictures) {
		this.numPictures = numPictures;
	}
	
	

}
