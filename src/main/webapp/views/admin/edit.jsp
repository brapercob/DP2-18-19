<%--
 * action-2.jsp
 *
 * Copyright (C) 2019 Universidad de Sevilla
 * 
 * The use of this project is hereby constrained to the conditions of the 
 * TDG Licence, a copy of which you may download from 
 * http://www.tdg-seville.info/License.html
 --%>

<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@taglib prefix="jstl"	uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="display" uri="http://displaytag.sf.net"%>

<p><spring:message code="admin.edit" /></p>

<form:form action="admin/edit.do" modelAttribute="admin">
	<form:hidden path="id"/>
	<form:hidden path="version"/>
	
	<form:label path="name">
		<spring:message code="admin.name" />
	</form:label>
	<form:input path="name"/>
	<form:errors cssClass="error" path="name" />
	<br/>
	
	<form:label path="middleName">
		<spring:message code="admin.middleName" />
	</form:label>
	<form:input path="middleName"/>
	<form:errors cssClass="error" path="middleName" />
	<br/>
	
	<form:label path="surname">
		<spring:message code="admin.surname" />
	</form:label>
	<form:input path="surname"/>
	<form:errors cssClass="error" path="surname" />
	<br/>
	
	<form:label path="photo">
		<spring:message code="admin.photo" />
	</form:label>
	<form:input path="photo"/>
	<form:errors cssClass="error" path="photo" />
	<br/>
	
	<form:label path="email">
		<spring:message code="admin.email" />
	</form:label>
	<form:input path="email"/>
	<form:errors cssClass="error" path="email" />
	<br/>
	
	<form:label path="phoneNumber">
		<spring:message code="admin.phoneNumber" />
	</form:label>
	<form:input path="phoneNumber"/>
	<form:errors cssClass="error" path="phoneNumber" />
	<br/>
	
	<form:label path="address">
		<spring:message code="admin.address" />
	</form:label>
	<form:input path="address"/>
	<form:errors cssClass="error" path="address" />
	<br/>
	
	<form:label path="address">
		<spring:message code="admin.address" />
	</form:label>
	<form:input path="address"/>
	<form:errors cssClass="error" path="address" />
	<br/>
	
	<form:label path="userAccount">
		<spring:message code="admin.userAccount" />
	</form:label>
	<form:input path="userAccount"/>
	<form:errors cssClass="error" path="userAccount" />
	<br/>
	
	<input type="submit" name="save" 
			value="<spring:message code="admin.save" />"/>
	<input type="submit" name="delete" 
			value="<spring:message code="delete" />" />
	<input type="submit" name="cancel" 
			value="<spring:message code="cancel" />" />

</form:form>



