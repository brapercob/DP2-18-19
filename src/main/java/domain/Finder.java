package domain;

import java.util.Date;
import java.util.Collection;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

@Entity
@Access(AccessType.PROPERTY)
public class Finder extends DomainEntity{

  private String keyword;
  private Area area;
  private Date minDate;
  private Date maxDate;
  public Collection<SearchResult> searchResults;

  public String getKeyword(){
    return keyword;
  }
  public void setKeyword(String keyword){
    this.keyword = keyword;
  }
  public Area getArea(){
    return area;
  }
  public void setArea(Area area){
    this.area = area;
  }
  public Date getMinDate(){
    return minDate;
  }
  public void setMinDate(Date minDate){
    this.minDate = minDate;
  }
  public Date getMaxDate(){
    return maxDate;
  }
  public void setMaxDate(Date maxDate){
    this.maxDate = maxDate;
  }
  public Collection<SearchResult> getSearchResults(){
    return searchResults;
  }


}
