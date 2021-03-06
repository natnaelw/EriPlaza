<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MyList</title>
</head>
<body>


 <p> Hello ${user.fname}   <a href="<spring:url value="/userpage?id=${user.id}" />"> BACK</a></p>
<p>
	Posted Items :
</p>	
			<c:forEach items="${userItem}" var="item">
				<div class="article" style="padding-bottom: 15px">
					<div class="thumbnail">
					<img src="<c:url value="/resources/images/${item.itemName}"></c:url>" alt="image"  style = "width:100%"/> 
						<div class="caption">
							<h3>${item.itemName}</h3>
							<p>${item.description}</p>
							<p>${item.unitPrice}USD</p>
							<p>Available ${item.unitsInStock} units in stock</p>
							<p>
								<a
									href="<spring:url value="/edit/item?id=${item.itemId}&userid=${userid}" />"> <span /></span> EDIT
								</a>
							</p>

						</div>
					</div>
				</div>
			</c:forEach>
		</div>
</body>
</html>