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

<p><spring:message code="member.list" /></p>

<display:table name="members" id="member" requestURI="${requestURI}" 
pagesize="5" class="DisplayTag">
	<display:column property="name" titleKey="member.name" />
	<display:column property="middleName" titleKey="member.middleName" />
	<display:column property="surname" titleKey="member.surname" />
	<display:column property="photo" titleKey="member.photo" />
	<display:column property="email" titleKey="member.email" />
	<display:column property="phoneNumber" titleKey="member.phoneNumber" />
	<display:column property="address" titleKey="member.address" />
	<display:column property="userAccount" titleKey="member.userAccount" />
</display:table>
