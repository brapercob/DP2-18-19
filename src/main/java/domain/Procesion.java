package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@Access(AccessType.PROPERTY)
public class Procesion extends DomainEntity{
	public Collection<Paso> pasos;
	public Collection<Request> requests;
	
	public String title;
	public String description;
	public String ticker;
	public Boolean draftMode;
	
	public Boolean getDraftMode(){
		return this.draftMode;
	}
	
	public void setDraftMode(final Boolean draftMode){
		this.draftMode = draftMode;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public void setTitle(final String title) {
		this.title = title;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public void setDescription(final String description) {
		this.description = description;
	}
	
	public String getTicker(){
		return this.ticker;
	}
	
	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}
	
	@OneToMany
	public Collection<Paso> getPasos() {
		return this.pasos;
	}
	
	public void setPasos(final Collection<Paso> pasos) {
		this.pasos = pasos;
	}
	
	@OneToMany
	public Collection<Request> getRequests() {
		return this.requests;
	}
	
	public void setRequests(final Collection<Request> requests) {
		this.requests = requests;
	}
	

}
