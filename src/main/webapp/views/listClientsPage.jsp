<%--
  Created by IntelliJ IDEA.
  User: oussa
  Date: 1/23/21
  Time: 7:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored = "false" %>
<html>

<header>
    <div class="logo">Cigma<span>D2J</span></div>
    <link rel="stylesheet" href="../resources/css/cssStyle.css">
</header>
<body>
<div class="nav-btn">Menu</div>
<div class="container">

    <div class="sidebar">
        <nav>
            <a href="#">Cigma<span>D2J</span></a>
            <ul>
                <li><a href="../client/home">Nouveau client</a></li>
                <li class="active"><a href="#">Listdes clients</a></li>
                <li><a href="#">Demand</a></li>
            </ul>
        </nav>
    </div>

    <div class="main-content">
        <h1>Client</h1>
        <p>Nouveau client</p>
        <section>
            <div class="section">
                <table class="table-fill" id="datatable">
                    <thead>
                    <tr class="thead-dark">
                        <th class="text-left">Prenom</th>
                        <th class="text-left">Nom</th>
                        <th class="text-left">Email</th>
                        <th class="text-left">Telephone</th>
                        <th class="text-left">Adresse</th>
                    </tr>
                    </thead>
                    <tbody class="table-hover">
                    <c:forEach var="cl" items="${client}">
                        <tr>
                            <td>${cl.firstname}</td>
                            <td class="text-left">${cl.lastname}</td>
                            <td class="text-left">${cl.email}</td>
                            <td class="text-left">${cl.phone}</td>
                            <td class="text-left">${cl.address}</td>
                                <%--                   <td>
                                                       <a href = "${pageContext.request.contextPath}/EmployeeController?action=EDIT&id=${employee.id}">Edit</a>
                                                       |
                                                       <a href = "${pageContext.request.contextPath}/EmployeeController?action=DELETE&id=${employee.id}">Delete</a>
                                                   </td>--%>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </section>
    </div>
</div>

</body>
</html>
