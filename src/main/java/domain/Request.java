package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

@Entity
@Access(AccessType.PROPERTY)
public class Request extends DomainEntity{

  private Status status;
  private int row;
  private int column;
  private String reason;
  
public Status getStatus() {
	return status;
}
public void setStatus(Status status) {
	this.status = status;
}
public int getRow() {
	return row;
}
public void setRow(int row) {
	this.row = row;
}
public int getColumn() {
	return column;
}
public void setColumn(int column) {
	this.column = column;
}
public String getReason() {
	return reason;
}
public void setReason(String reason) {
	this.reason = reason;
}


}
