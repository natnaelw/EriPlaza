<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><spring:message code="label.form.title"></spring:message></title>
</head>
<body>
<form:form modelAttribute="newUser" method="POST" enctype="utf8">
<table>
<tr>
<td><label><spring:message code="label.user.firstName"></spring:message>:&nbsp;</label>
</td>
<td>
<form:input path="fname" value="" />
 <form:errors path="fname" element="div"/>
</td>
</tr>


<tr>
<td><label><spring:message code="label.user.lastName"></spring:message>:&nbsp;</label>
</td>
<td>
<form:input path="lname" value="" />
<form:errors path="lname" element="div" />
</td>
</tr>
<tr>
<td><label><spring:message code="label.user.email"></spring:message>:&nbsp;</label>
</td>
<td>
<form:input path="email" value="" />
 <form:errors path="email" element="div" /> 
</td>
</tr>

<tr>
<td><label><spring:message code="label.user.phone"></spring:message>:&nbsp;</label>
</td>
<td>
<form:input path="phone" value="" />
 <form:errors path="phone" element="div" />
</td>
</tr>

<tr>
<td><label><spring:message code="label.user.address.str"></spring:message>:&nbsp;</label>
</td>
<td>
<form:input path="address.street" value="" type="text" />
<form:errors path="address.street" element="div" />
</td>
</tr>

<tr>
<td><label><spring:message code="label.user.address.state"></spring:message>:&nbsp;</label>
</td>
<td>
<form:input path="address.state" value="" type="text" />
<form:errors path="address.state" element="div" />
</td>
</tr>

<tr>
<td><label><spring:message code="label.user.address.zip"></spring:message>:&nbsp;</label>
</td>
<td>
<form:input path="address.zipcode" value="" type="text" />
<form:errors path="address.zipcode" element="div" />
</td>
</tr>
<tr>
<td>
<!-- <label class="control-label col-lg-2" for="authority">Role</label> -->
<form:hidden path="credentials.authority[0].authority"  value="ROLE_USER" />
<%-- <form:errors path="credentials.authority[0].authority" cssClass="text-danger"/> --%>
</td>
<tr>
<td>
<form:hidden path="credentials.enabled" value="TRUE"  />
</td>
</tr>
<tr>
<td>
</td>
</tr>


<tr>
<td><label><spring:message code="label.user.userName"></spring:message>:&nbsp;</label>
</td>
<td>
<form:input path="credentials.username" value="" />
<form:errors path="credentials.username" element="div" />
</td>
</tr>

<tr>
<td><label><spring:message code="label.user.password"></spring:message>:&nbsp;</label>
</td>
<td>
<form:input path="credentials.password" value="" type="password" />
<form:errors path="password" element="div" />
</td>
</tr>

<tr>
<td><label><spring:message code="label.user.verifyPassword"></spring:message>:&nbsp;</label>
</td>
<td>
<form:input path="credentials.verifyPassword" value="" type="password" />
<form:errors path="credentials.verifyPassword" element="div" />
</td>
</tr>

</table>

<p align="justify">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="submit" value="Submit" tabindex="5">
</p>
</form:form>


</body>


</html>