
package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Access(AccessType.PROPERTY)
public class Enrolment extends DomainEntity {

	public Collection<Brotherhood>	brotherhood;
	public Collection<Position>		position;

	public Date						startDate;
	public Date						finishDate;


	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(final Date startDate) {
		this.startDate = startDate;
	}

	public Date getFinishDate() {
		return this.finishDate;
	}

	public void setFinishDate(final Date finishDate) {
		this.finishDate = finishDate;
	}

	@ManyToOne
	public Collection<Brotherhood> getBrotherhood() {
		return this.brotherhood;
	}

	public void setBrotherhood(final Collection<Brotherhood> brotherhood) {
		this.brotherhood = brotherhood;
	}

	@ManyToOne
	public Collection<Position> getPosition() {
		return this.position;
	}
	public void setPosition(final Collection<Position> position) {
		this.position = position;
	}

}
