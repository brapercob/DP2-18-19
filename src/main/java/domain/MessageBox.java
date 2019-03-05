package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import org.hibernate.validator.constraints.NotBlank;


@Entity
@Access(AccessType.PROPERTY)
public class MessageBox extends DomainEntity {
	
	private String name;
	private Boolean defaultBox;
	
	//Relationships
	
	public Collection<Message> messages;

	@ManyToMany
	public Collection<Message> getMessages() {
		return this.messages;
	}
	
	public void setMessages(Collection<Message> messages) {
		this.messages = messages;
	}
	
	@NotBlank
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Boolean getDefaultBox() {
		return this.defaultBox;
	}
	
	public void setDefaultBox(Boolean defaultBox) {
		this.defaultBox = defaultBox;
	}
	
}
