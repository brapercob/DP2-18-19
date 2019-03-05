package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

@Entity
@Access(AccessType.PROPERTY)
public class SearchResult extends DomainEntity{

  private int period;
  //private Procesion procesion;

  public int getPeriod(){
    return period;
  }
  public void setPeriod(int period){
    this.period = period;
  }

  //public Procesion getProcesion(){
  // return procesion;

}
