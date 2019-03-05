
package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import repositories.PositionsRepository;
import domain.Positions;

@Service
@Transactional
public class PositionsService {

	@Autowired
	private PositionsRepository	positionsRepository;


	public PositionsService() {
		super();
	}

	//CREATE
	public Positions create() {
		final Positions res = new Positions();
		return res;
	}

	//SAVE
	public Positions save(final Positions positions) {
		Assert.notNull(positions);
		return this.positionsRepository.save(positions);
	}

	//FINDONE
	public Positions findOne(final int id) {
		Positions res;
		res = this.positionsRepository.findOne(id);
		Assert.notNull(res);
		return res;
	}

	//FINDALL
	public Collection<Positions> findAll() {
		Collection<Positions> res;
		res = this.positionsRepository.findAll();
		Assert.notNull(res);
		return res;
	}

	public void delete(final Positions positions) {
		Assert.notNull(positions);
		Assert.isTrue(positions.getId() != 0);
		this.positionsRepository.delete(positions);

	}
}
