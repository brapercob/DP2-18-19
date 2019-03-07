package services;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import domain.Paso;
import domain.Procesion;
import domain.Request;

import repositories.ProcesionRepository;

@Service
@Transactional
public class ProcesionService {

	@Autowired
	private ProcesionRepository	procesionRepository;

	public ProcesionService() {
		super();
	}

	//CREATE
	public Procesion create() {
		Collection<Paso> pasos = new ArrayList<Paso>();
		Collection<Request> requests = new ArrayList<Request>();
		Procesion res = new Procesion();
		res.setPasos(pasos);
		res.setRequests(requests);
		return res;
	}

	//SAVE
	public Procesion save(Procesion procesion) {
		Assert.notNull(procesion);
		return this.procesionRepository.save(procesion);
	}

	//DELETE
	public void delete(Procesion procesion) {
		Assert.notNull(procesion);
		Assert.isTrue(procesion.getId() != 0);
		this.procesionRepository.delete(procesion);
	}

	//FINDONE
	public Procesion findOne(int id) {
		Procesion res;
		res = this.procesionRepository.findOne(id);
		return res;
	}

	//FINDALL
	public Collection<Procesion> findAll() {
		Collection<Procesion> res;
		res = this.procesionRepository.findAll();
		Assert.notNull(res);
		return res;
	}

	//FINDPROCESIONS BY BROTHERHOOD
	public Collection<Procesion> findProcesionByBrotherhood(int id) {
		Collection<Procesion> res;
		res = this.procesionRepository.findProcesionByBrotherhood(id);
		Assert.notNull(res);
		return res;
	}
}



