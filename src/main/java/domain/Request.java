package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Access(AccessType.PROPERTY)
public class Request extends DomainEntity{
	public Collection<Member> members;
	public Collection<Procesion> procesions;
	
	public Integer status;
	public Integer row;
	public Integer column;
	public String reason;
	
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(final Integer status) {
		this.status = status;
	}
	
	public Integer getRow() {
		return this.row;
	}

	public void setRow(final Integer row) {
		this.row = row;
	}
	
	public Integer getColumn() {
		return this.column;
	}

	public void setColumn(final Integer column) {
		this.column = column;
	}
	
	public String getReason() {
		return this.reason;
	}

	public void setReason(final String reason) {
		this.reason = reason;
	}
	
	@ManyToOne
	public Collection<Member> getMembers() {
		return this.members;
	}
	
	@ManyToOne
	public Collection<Procesion> getProcesions() {
		return this.procesions;
	}
	
	public void setProcesions(final Collection<Procesion> procesions) {
		this.procesions = procesions;
	}
}
