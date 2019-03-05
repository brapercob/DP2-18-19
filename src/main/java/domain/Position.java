
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@Access(AccessType.PROPERTY)
public class Position extends DomainEntity {

	public String					name;
	public Collection<Positions>	positions;


	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@OneToMany(cascade = CascadeType.ALL)
	public Collection<Positions> getPositions() {
		return this.positions;
	}

	public void setPositions(final Collection<Positions> positions) {
		this.positions = positions;
	}
}
