package repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import domain.Paso;

@Repository
public interface PasoRepository extends JpaRepository<Paso, Integer> {

    @Query("select b.pasos from Brotherhood b where b.id=?1")
    Collection<Paso> findPasosByBrotherhood(int id);
    
    @Query("select p.pasos from Procesion p where p.id=?1")
    Collection<Paso> findPasosByProcesion(int id);
}