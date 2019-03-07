package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Positions;


public interface PositionsRepository extends JpaRepository<Positions, Integer> {

}
