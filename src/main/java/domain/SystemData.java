package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

@Entity
@Access(AccessType.PROPERTY)
public class SystemData extends DomainEntity{

  private String name;
  private String bannerHeader;
  private String welcomeMsg;
  private String site;
  private String phoneCode;
  private int cache;
  
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBannerHeader() {
	return bannerHeader;
}
public void setBannerHeader(String bannerHeader) {
	this.bannerHeader = bannerHeader;
}
public String getWelcomeMsg() {
	return welcomeMsg;
}
public void setWelcomeMsg(String welcomeMsg) {
	this.welcomeMsg = welcomeMsg;
}
public String getSite() {
	return site;
}
public void setSite(String site) {
	this.site = site;
}
public String getPhoneCode() {
	return phoneCode;
}
public void setPhoneCode(String phoneCode) {
	this.phoneCode = phoneCode;
}
public int getCache() {
	return cache;
}
public void setCache(int cache) {
	this.cache = cache;
}
  

}
