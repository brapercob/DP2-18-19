package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import domain.Request;

public class RequestRepository {

  @Query("select p from Procession p")
  public Collection<Procession> getAllProcession();

  @Query("select p from Procession p where p.description like %?1%) //and p.endDate>CURRENT_DATE")
  public Collection<Procession> filterProcessionByKeyWordInDescription(String keyWord);

  @Query("select p from Procession p where p.area.name=?1 ")
  public Collection<Procession> filterProcessionByArea(String area);

  @Query("select p from Procession p where p.minDate>=?1 and p.maxDate>CURRENT_DATE ")
  public Collection<Procession> filterProcessionByMinDate(Date minDate);

  @Query("select p from Task p where p.maxDate<=?1 and p.maxDate>CURRENT_DATE")
  public Collection<Procession> filterProcessionByMaxDate(Date maxDate);


}
