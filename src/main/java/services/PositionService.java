
package services;

import java.util.ArrayList;
import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import repositories.PositionRepository;
import domain.Position;
import domain.Positions;

@Service
@Transactional
public class PositionService {

	@Autowired
	private PositionRepository	positionRepository;


	public PositionService() {
		super();
	}

	//CREATE
	public Position create() {
		final Position res = new Position();
		final String name = new String();
		final Collection<Positions> positions = new ArrayList<Positions>();

		res.setName(name);
		res.setPositions(positions);
		return res;
	}

	//SAVE
	public Position save(final Position position) {
		Assert.notNull(position);
		return this.positionRepository.save(position);
	}

	//FINDONE
	public Position findOne(final int id) {
		Position res;
		res = this.positionRepository.findOne(id);
		Assert.notNull(res);
		return res;
	}

	//FINDALL
	public Collection<Position> findAll() {
		Collection<Position> res;
		res = this.positionRepository.findAll();
		Assert.notNull(res);
		return res;
	}

	public void delete(final Position position) {
		Assert.notNull(position);
		Assert.isTrue(position.getId() != 0);
		this.positionRepository.delete(position);

	}
}
