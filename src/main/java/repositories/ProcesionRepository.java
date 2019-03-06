
package repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import domain.Procesion;

@Repository
public interface ProcesionRepository extends JpaRepository<Procesion, Integer> {

	@Query("select b.procesions from Brotherhood b where b.id=?1")
	Collection<Procesion> findProcesionByBrotherhood(int id);

}
