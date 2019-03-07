<%--
 * action-1.jsp
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

<p><spring:message code="admin.list" /></p>

<display:table name="admins" id="admin" requestURI="${requestURI}" 
pagesize="5" class="DisplayTag">
	<display:column property="name" titleKey="admin.name" />
	<display:column property="middleName" titleKey="admin.middleName" />
	<display:column property="surname" titleKey="admin.surname" />
	<display:column property="photo" titleKey="admin.photo" />
	<display:column property="email" titleKey="admin.email" />
	<display:column property="phoneNumber" titleKey="admin.phoneNumber" />
	<display:column property="address" titleKey="admin.address" />
	<display:column property="userAccount" titleKey="admin.userAccount" />
</display:table>
