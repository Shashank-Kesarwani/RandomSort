<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Random Sort MVC with Hibernate</title>
</head>
<body>
  <h2>Enter numbers to sort</h2>
  <form:form method="POST" modelAttribute="command" action="sortnumbers">
      <table>
       <tr>
           <td>Please Enter Numbers to Sort with csv format:</td>
           <td><form:input path="inputParam" value="${NumberSortModel.inputParam}"/></td>
       </tr>
          <tr>
         <td colspan="2"><input type="submit" value="Sort"/></td>
        </tr>
   </table> 
   </form:form>

  
  <c:if test="${!empty number}">
  <h2>Sort Results</h2>
 <table align="left" border="1">
  <tr>
   <th>Id</th>
   <th>Input Value</th>
   <th>Output Value</th>
   <th>Time Consumed</th>
   <th>Number of positions Changed</th>
  </tr>


   <tr>
    <td><c:out value="${number.id}"/></td>
    <td><c:out value="${number.inputParam}"/></td>
    <td><c:out value="${number.outputParam}"/></td>
    <td><c:out value="${number.timeConsumed}"/></td>
    <td><c:out value="${number.positionChanged}"/></td>
   </tr>
 </table>
</c:if>
<br/>
<br/>
<br/>
  
 <c:if test="${!empty numbers}">
  <h2>Previous Result</h2>
 <table align="left" border="1">
  <tr>
   <th>Id</th>
   <th>Input Value</th>
   <th>Output Value</th>
   <th>Time Consumed</th>
   <th>Number of positions Changed</th>
  </tr>

  <c:forEach items="${numbers}" var="number">
   <tr>
    <td><c:out value="${number.id}"/></td>
    <td><c:out value="${number.inputParam}"/></td>
    <td><c:out value="${number.outputParam}"/></td>
    <td><c:out value="${number.timeConsumed}"/></td>
    <td><c:out value="${number.positionChanged}"/></td>
   </tr>
  </c:forEach>
 </table>
</c:if>

 
 </body>
</html>