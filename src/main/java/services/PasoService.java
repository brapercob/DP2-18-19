package services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import repositories.PasoRepository;
import domain.Paso;

@Service
@Transactional
public class PasoService {

    @Autowired
    private PasoRepository    pasosRepository;

    public PasoService() {
        super();
    }

    //CREATE
    public Paso create() {
        Paso res = new Paso();
        String description = new String();
        String title = new String();
        String photo = new String();
        res.setDescription(description);
        res.setTitle(title);
        res.setPhoto(photo);
        return res;
    }

    //SAVE
    public Paso save(Paso paso) {
        Assert.notNull(paso);
        return this.pasosRepository.save(paso);
    }

    //DELETE
    public void delete(Paso p) {
    	Assert.notNull(p);
		Assert.isTrue(p.getId() != 0);
		this.pasosRepository.delete(p);
    }

    //FINDONE
    public Paso findOne(int id) {
        Paso res;
        res = this.pasosRepository.findOne(id);
        return res;
    }

    //FINDALL
    public Collection<Paso> findAll() {
        Collection<Paso> res;
        res = this.pasosRepository.findAll();
        Assert.notNull(res);
        return res;
    }

    //FIND PASOS BY BROTHERHOOD
    public Collection<Paso> findPasosByBrotherhood(int id) {
    	Collection<Paso> res;
		res = this.pasosRepository.findPasosByBrotherhood(id);
		Assert.notNull(res);
		return res;
    }
    
    //FIND PASOS BY PROCESION
    public Collection<Paso> findPasosByProcesion(int id) {
        Collection<Paso> res;
        res = this.pasosRepository.findPasosByProcesion(id);
        Assert.notNull(res);
        return res;
    }

}
